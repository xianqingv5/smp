package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.DayReport.*;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Portion;
import com.yiche.smp.common.Ratio;
import com.yiche.smp.common.YichePlatform;
import com.yiche.smp.common.util.AddTotalUtil;
import com.yiche.smp.common.util.CalculatePortionUtil;
import com.yiche.smp.common.util.CalculateRatioUtil;
import com.yiche.smp.common.util.DataCalculationUtils;
import com.yiche.smp.core.service.DisplayDayReportService;
import com.yiche.smp.mapper.DisplayDayReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/9
 */
@Service
public class DisplayDayReportServiceImpl implements DisplayDayReportService {
    @Autowired
    private DisplayDayReportMapper displayDayReportMapper;

    /**
     *
     * 根据时间日期，查询前两天的日报总数据，并计算出环比
     * @param date
     * @param date2
     * @return
     */
    @Override
    public DayReport getSumDataDay(String date, String date2) {
        Map<String, String> map = new HashMap<>();
        Map<String,Object> map1 = new HashMap<>();
        Data data = new Data();
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3= new Data();
        ArrayList<Data> datas = new ArrayList<>();
        DayReport dayReport = new DayReport();
        Ratio ratio = new Ratio();
        map.put("date",date);
        GatherYicheAPP sumDataDayPre = displayDayReportMapper.getSumDataDay(map);
        sumDataDayPre.setLeadsCost(calculateLeadsCost(sumDataDayPre.getLeadsCnt(),20f));
        map.replace("date",date2);
        GatherYicheAPP sumDataDayPre2 = displayDayReportMapper.getSumDataDay(map);
        sumDataDayPre2.setLeadsCost(calculateLeadsCost(sumDataDayPre2.getLeadsCnt(),20f));
        Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, sumDataDayPre, sumDataDayPre2);
        Long leadsCnt = sumDataDayPre.getLeadsCnt();
        Long leadsCnt1 = sumDataDayPre2.getLeadsCnt();
        String clueRatio = ratio1.getClueRatio();
        data.setTitle("总线索量");
        data.setPreTwoDay(leadsCnt1);
        data.setPreOneDay(leadsCnt);
        data.setRatio(clueRatio);
        Long userCnt = sumDataDayPre.getLeadsUserCnt();
        Long userCnt1 = sumDataDayPre2.getLeadsUserCnt();
        String userRatio = ratio1.getUserRatio();
        data1.setTitle("总用户量");
        data1.setPreTwoDay(userCnt1);
        data1.setPreOneDay(userCnt);
        data1.setRatio(userRatio);
        Float actualConsume = sumDataDayPre.getActualConsume();
        Float actualConsume1 = sumDataDayPre2.getActualConsume();
        String consumeRatio = ratio1.getConsumeRatio();
        data2.setTitle("总体消耗");
        data2.setPreTwoDay(actualConsume1);
        data2.setPreOneDay(actualConsume);
        data2.setRatio(consumeRatio);
        Double leadsCost = sumDataDayPre.getLeadsCost();
        Double leadsCost1 = sumDataDayPre2.getLeadsCost();
        String costRatio = ratio1.getLeadsCostRatio();
        data3.setTitle("线索成本");
        data3.setPreTwoDay(leadsCost1);
        data3.setPreOneDay(leadsCost);
        data3.setRatio(costRatio);
        dayReport.setTitle("总数据");
        datas.add(data);
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);
        dayReport.setData(datas);
        return dayReport;
    }

    /**
     * 根据时间日期,查询前两天的各个平台的总数据，并结合总量计算出环比，份额
     * @param date
     * @param date2
     * @return
     */
    @Override
    public List<Object> getPlatformDataDay(String date, String date2) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        Portion portion = new Portion();
        Ratio ratio = new Ratio();
        list.add("易车APP");
        list.add("报价APP");
        list.add("PCWAP");
        map.put("platformName",list.get(0));
        for (int i=0;i<=list.size()-1;i++){
            List<Data> datas = new ArrayList<>();
            DayReport dayReport = new DayReport();
            Data data = new Data();
            Data data1 = new Data();
            Data data2 = new Data();
            Data data3= new Data();
            if(i>0){
                map.replace("platformName",list.get(i));
            }
            map.put("date",date);
            GatherYicheAPP platformDataDay = displayDayReportMapper.getPlatformDataDay(map);
            platformDataDay.setLeadsCost(calculateLeadsCost(platformDataDay.getLeadsCnt(),20f));
            GatherYicheAPP sumDataDay = displayDayReportMapper.getSumDataDay(map);
            sumDataDay.setLeadsCost(calculateLeadsCost(sumDataDay.getLeadsCnt(),20f));
            Portion portion1 = CalculatePortionUtil.calculatePortionSum(portion, platformDataDay, sumDataDay);
            map.replace("date",date2);
            GatherYicheAPP platformDataDay1 = displayDayReportMapper.getPlatformDataDay(map);
            platformDataDay1.setLeadsCost(calculateLeadsCost(platformDataDay1.getLeadsCnt(),20f));
            Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, platformDataDay, platformDataDay1);
            Long leadsCnt = platformDataDay.getLeadsCnt();
            Long leadsCnt1 = platformDataDay1.getLeadsCnt();
            String clueRatio = ratio1.getClueRatio();
            String cluePortion = portion1.getCluePortion();
            data.setTitle("线索量");
            data.setPreTwoDay(leadsCnt1);
            data.setPreOneDay(leadsCnt);
            data.setRatio(clueRatio);
            data.setPortion(cluePortion);
            Long userCnt = platformDataDay.getLeadsUserCnt();
            Long userCnt1 = platformDataDay1.getLeadsUserCnt();
            String userRatio = ratio1.getUserRatio();
            String userPortion = portion1.getUserPortion();
            data1.setTitle("用户量");
            data1.setPreTwoDay(userCnt1);
            data1.setPreOneDay(userCnt);
            data1.setRatio(userRatio);
            data1.setPortion(userPortion);
            Float actualConsume = platformDataDay.getActualConsume();
            Float actualConsume1 = platformDataDay1.getActualConsume();
            String consumeRatio = ratio1.getConsumeRatio();
            String consumePortion = portion1.getConsumePortion();
            data2.setTitle("消耗");
            data2.setPreTwoDay(actualConsume1);
            data2.setPreOneDay(actualConsume);
            data2.setRatio(consumeRatio);
            data2.setPortion(consumePortion);
            Double leadsCost = platformDataDay.getLeadsCost();
            Double leadsCost1 = platformDataDay1.getLeadsCost();
            String costRatio = ratio1.getLeadsCostRatio();
            String costPortion = portion.getLeadsCostPortion();
            data3.setTitle("线索成本");
            data3.setPreTwoDay(leadsCost1);
            data3.setPreOneDay(leadsCost);
            data3.setRatio(costRatio);
            data3.setPortion(costPortion);
            datas.add(data);
            datas.add(data1);
            datas.add(data2);
            datas.add(data3);
            dayReport.setTitle(list.get(i));
            dayReport.setData(datas);
            list2.add(dayReport);
        }
        return list2;
    }

    @Override
    public Map<String, List<YichePlatform>> getplatformChannelDataDay(String platformName, String date, String date2) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("systemId","0");
        map.put("date",date);
        List<YichePlatform> yichePlatforms = displayDayReportMapper.getplatformChannelDataDay(map);
        for (int i = 0; i <=yichePlatforms.size()-1 ; i++) {
            yichePlatforms.get(i).setLeadsCost(calculateLeadsCost(yichePlatforms.get(i).getLeadsCnt(),yichePlatforms.get(i).getActualConsume()));
        }
        AddTotalUtil.addTotal(yichePlatforms,map.get("systemId"));
        map.replace("date",date2);
        List<YichePlatform> yichePlatforms1 = displayDayReportMapper.getplatformChannelDataDay(map);
        for (int i = 0; i <=yichePlatforms1.size()-1 ; i++) {
            yichePlatforms1.get(i).setLeadsCost(calculateLeadsCost(yichePlatforms1.get(i).getLeadsCnt(),yichePlatforms1.get(i).getActualConsume()));
        }
        AddTotalUtil.addTotal(yichePlatforms1,map.get("systemId"));
        List<YichePlatform> yichePlatformAndroid= CalculateRatioUtil.addCalculateRatio(yichePlatforms, yichePlatforms1);
        map1.put("android",yichePlatformAndroid);
        map.replace("systemId","1");
        map.replace("date",date);
        List<YichePlatform> yichePlatformsIos1 = displayDayReportMapper.getplatformChannelDataDay(map);
        for (int i = 0; i <=yichePlatformsIos1.size()-1 ; i++) {
            yichePlatformsIos1.get(i).setLeadsCost(calculateLeadsCost(yichePlatformsIos1.get(i).getLeadsCnt(),yichePlatformsIos1.get(i).getActualConsume()));
        }
        AddTotalUtil.addTotal(yichePlatformsIos1,map.get("systemId"));
        map.replace("date",date2);
        List<YichePlatform> yichePlatformsIos2 = displayDayReportMapper.getplatformChannelDataDay(map);
        for (int i = 0; i <=yichePlatformsIos2.size()-1 ; i++) {
            yichePlatformsIos2.get(i).setLeadsCost(calculateLeadsCost(yichePlatformsIos2.get(i).getLeadsCnt(),yichePlatformsIos2.get(i).getActualConsume()));
        }
        AddTotalUtil.addTotal(yichePlatformsIos2,map.get("systemId"));
        List<YichePlatform> yichePlatformsIos = CalculateRatioUtil.addCalculateRatio(yichePlatformsIos1, yichePlatformsIos2);
        map1.put("ios",yichePlatformsIos);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getPcwapchannelDataDay(String platformName, String date, String date2) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("terminalId","0");
        map.put("date",date);
        List<YichePlatform> pcwapchannelDataDaypc1 = displayDayReportMapper.getPcwapchannelDataDay(map);
        for (int i = 0; i <=pcwapchannelDataDaypc1.size()-1 ; i++) {
            pcwapchannelDataDaypc1.get(i).setLeadsCost(calculateLeadsCost(pcwapchannelDataDaypc1.get(i).getLeadsCnt(),pcwapchannelDataDaypc1.get(i).getActualConsume()));
        }
        map.replace("date",date2);
        List<YichePlatform> pcwapchannelDataDaypc2 = displayDayReportMapper.getPcwapchannelDataDay(map);
        for (int i = 0; i <=pcwapchannelDataDaypc2.size()-1 ; i++) {
            pcwapchannelDataDaypc2.get(i).setLeadsCost(calculateLeadsCost(pcwapchannelDataDaypc2.get(i).getLeadsCnt(),pcwapchannelDataDaypc2.get(i).getActualConsume()));
        }
        List<YichePlatform> pcwapchannelDataDaypc = CalculateRatioUtil.addCalculateRatioPcwap(pcwapchannelDataDaypc1, pcwapchannelDataDaypc2);
        map1.put("pc",pcwapchannelDataDaypc);
        map.replace("terminalId","1");
        map.replace("date",date);
        List<YichePlatform> pcwapchannelDataDayyd1 = displayDayReportMapper.getPcwapchannelDataDay(map);
        for (int i = 0; i <=pcwapchannelDataDayyd1.size()-1 ; i++) {
            pcwapchannelDataDayyd1.get(i).setLeadsCost(calculateLeadsCost(pcwapchannelDataDayyd1.get(i).getLeadsCnt(),pcwapchannelDataDayyd1.get(i).getActualConsume()));
        }
        map.replace("date",date2);
        List<YichePlatform> pcwapchannelDataDayyd2 = displayDayReportMapper.getPcwapchannelDataDay(map);
        for (int i = 0; i <=pcwapchannelDataDayyd2.size()-1 ; i++) {
            pcwapchannelDataDayyd2.get(i).setLeadsCost(calculateLeadsCost(pcwapchannelDataDayyd2.get(i).getLeadsCnt(),pcwapchannelDataDayyd2.get(i).getActualConsume()));
        }
        List<YichePlatform> pcwapchannelDataDayyd = CalculateRatioUtil.addCalculateRatioPcwap(pcwapchannelDataDayyd1, pcwapchannelDataDayyd2);
        map1.put("yd",pcwapchannelDataDayyd);
        return map1;

    }


    public double calculateLeadsCost(Long num1,Float num2) {
        double leadsCost = 0.00;
        if (num2 != null && num2 != 0) {
            leadsCost = num1 / num2;
            double v = DataCalculationUtils.doubleDeal(leadsCost);
            return v;
        }
        return leadsCost;
    }
}