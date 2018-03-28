package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.DayReport.Data;
import com.yiche.smp.common.DayReport.DayReport;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Portion;
import com.yiche.smp.common.Ratio;
import com.yiche.smp.common.YichePlatform;
import com.yiche.smp.common.util.AddTotalUtil;
import com.yiche.smp.common.util.CalculatePortionUtil;
import com.yiche.smp.common.util.CalculateRatioUtil;
import com.yiche.smp.core.service.DisplayWeekReportService;
import com.yiche.smp.mapper.DisplayWeekReportMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/16
 */
@Service
public class DisplayWeekReportServiceImpl implements DisplayWeekReportService{
    @Autowired
    private DisplayWeekReportMapper displayWeekReportMapper;
    private Logger logger = LoggerFactory.getLogger(DisplayWeekReportServiceImpl.class);
    @Override
    public DayReport selectSumDataWeek(String week,String week1) {
        Long leadsCnt = 0l;
        Long leadsCnt1 = 0l;
        Long userCnt = 0l;
        Long userCnt1 = 0l;
        Float actualConsume = 0.0f;
        Float actualConsume1 = 0.0f;
        Double leadsCost = 0.0;
        Double leadsCost1 = 0.0;
        HashMap<String, String> map = new HashMap<>();
        map.put("week",week);
        Data data = new Data();
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3= new Data();
        ArrayList<Data> datas = new ArrayList<>();
        DayReport dayReport = new DayReport();
        Ratio ratio = new Ratio();
        GatherYicheAPP sumConsumeDataWeek = displayWeekReportMapper.selectSumDataWeek(map);
        if (sumConsumeDataWeek==null){
            logger.info("此周没有数据");
        }else {
            if (sumConsumeDataWeek.getLeadsCnt()!=null){
                leadsCnt=sumConsumeDataWeek.getLeadsCnt();
            }
            if (sumConsumeDataWeek.getLeadsUserCnt()!=null){
                userCnt=sumConsumeDataWeek.getLeadsUserCnt();
            }
            if (sumConsumeDataWeek.getActualConsume()!=null){
                actualConsume=sumConsumeDataWeek.getActualConsume();
            }
            if (sumConsumeDataWeek.getLeadsCost()!=null){
                leadsCost=sumConsumeDataWeek.getLeadsCost();
            }
        }
        map.replace("week",week1);
        GatherYicheAPP sumConsumeDataWeek1 = displayWeekReportMapper.selectSumDataWeek(map);
        Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio,sumConsumeDataWeek,sumConsumeDataWeek1);
        if (sumConsumeDataWeek1==null){
            logger.info("此周没有数据");
        }else {
            if (sumConsumeDataWeek1.getLeadsCnt()!=null){
                leadsCnt1=sumConsumeDataWeek1.getLeadsCnt();
            }
            if (sumConsumeDataWeek1.getLeadsUserCnt()!=null){
                userCnt1=sumConsumeDataWeek1.getLeadsUserCnt();
            }
            if (sumConsumeDataWeek1.getActualConsume()!=null){
                actualConsume1=sumConsumeDataWeek1.getActualConsume();
            }
            if (sumConsumeDataWeek1.getLeadsCost()!=null){
                leadsCost1=sumConsumeDataWeek1.getLeadsCost();
            }
        }
        String clueRatio = ratio1.getClueRatio();
        data.setTitle("总线索量");
        data.setPreTwoDay(leadsCnt1);
        data.setPreOneDay(leadsCnt);
        data.setRatio(clueRatio);
        String userRatio = ratio1.getUserRatio();
        data1.setTitle("总用户量");
        data1.setPreTwoDay(userCnt1);
        data1.setPreOneDay(userCnt);
        data1.setRatio(userRatio);
        String consumeRatio = ratio1.getConsumeRatio();
        data2.setTitle("总体消耗");
        data2.setPreTwoDay(actualConsume1);
        data2.setPreOneDay(actualConsume);
        data2.setRatio(consumeRatio);
        String leadsCostRatio = ratio1.getLeadsCostRatio();
        data3.setTitle("线索成本");
        data3.setPreTwoDay(leadsCost1);
        data3.setPreOneDay(leadsCost);
        data3.setRatio(leadsCostRatio);
        dayReport.setTitle("总数据");
        datas.add(data);
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);
        dayReport.setData(datas);
        return dayReport;
    }

    @Override
    public List<DayReport> getPlatformDataWeek(String week,String week1) {
        Map<String, String> map = new HashMap<>();
        List<DayReport> list2 = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Portion portion = new Portion();
        Ratio ratio = new Ratio();
        list.add("PCWAP");
        list.add("报价APP");
        list.add("易车APP");
        list.add("第三方");
        map.put("platformName",list.get(0));
        for (int i=0;i<=list.size()-1;i++){
            Long leadsCnt = 0l;
            Long leadsCnt1=0l;
            Long userCnt=0l;
            Long userCnt1=0l;
            Float actualConsume1=0f;
            Float actualConsume=0f;
            Double leadsCost=0.0;
            Double leadsCost1=0.0;
            List<Data> datas = new ArrayList<>();
            DayReport dayReport = new DayReport();
            Data data = new Data();
            Data data1 = new Data();
            Data data2 = new Data();
            Data data3= new Data();
            if(i>0){
                map.replace("platformName",list.get(i));
            }
            map.put("week",week);
            GatherYicheAPP platformDataWeek = displayWeekReportMapper.selectPlatformDataWeek(map);
            if (platformDataWeek==null){
                logger.info("此月没有数据");
            }else {
                if (platformDataWeek.getLeadsCnt()!=null){
                    leadsCnt=platformDataWeek.getLeadsCnt();
                }
                if (platformDataWeek.getLeadsUserCnt()!=null){
                    userCnt=platformDataWeek.getLeadsUserCnt();
                }
                if (platformDataWeek.getActualConsume()!=null){
                    actualConsume=platformDataWeek.getActualConsume();
                }
                if (platformDataWeek.getLeadsCost()!=null){
                    leadsCost=platformDataWeek.getLeadsCost();
                }
            }
            GatherYicheAPP sumDataWeek = displayWeekReportMapper.selectSumDataWeek(map);
            Portion portion1 = CalculatePortionUtil.calculatePortionSum(portion, platformDataWeek, sumDataWeek);
            map.replace("week",week1);
            GatherYicheAPP platformDataWeek1 = displayWeekReportMapper.selectPlatformDataWeek(map);
            if (platformDataWeek1==null){
                logger.info("此月没有数据");
            }else {
                if (platformDataWeek1.getLeadsCnt()!=null){
                    leadsCnt1=platformDataWeek1.getLeadsCnt();
                }
                if (platformDataWeek1.getLeadsUserCnt()!=null){
                    userCnt1=platformDataWeek1.getLeadsUserCnt();
                }
                if (platformDataWeek1.getActualConsume()!=null){
                    actualConsume1=platformDataWeek1.getActualConsume();
                }
                if (platformDataWeek1.getLeadsCost()!=null){
                    leadsCost1=platformDataWeek1.getLeadsCost();
                }
            }
            Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, platformDataWeek, platformDataWeek1);
            String clueRatio = ratio1.getClueRatio();
            String cluePortion = portion1.getCluePortion();
            data.setTitle("线索量");
            data.setPreTwoDay(leadsCnt1);
            data.setPreOneDay(leadsCnt);
            data.setRatio(clueRatio);
            data.setPortion(cluePortion);
            String userRatio = ratio1.getUserRatio();
            String userPortion = portion1.getUserPortion();
            data1.setTitle("用户量");
            data1.setPreTwoDay(userCnt1);
            data1.setPreOneDay(userCnt);
            data1.setRatio(userRatio);
            data1.setPortion(userPortion);
            String consumeRatio = ratio1.getConsumeRatio();
            String consumePortion = portion1.getConsumePortion();
            data2.setTitle("消耗");
            data2.setPreTwoDay(actualConsume1);
            data2.setPreOneDay(actualConsume);
            data2.setRatio(consumeRatio);
            data2.setPortion(consumePortion);
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
    public Map<String, List<YichePlatform>> getplatformChannelDataWeek(String platformName,String week,String week1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("systemId","0");
        map.put("week",week);
        List<YichePlatform> yichePlatformsWeek = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeek,map.get("systemId"));
        map.replace("week",week1);
        List<YichePlatform> yichePlatformsWeek1 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeek1,map.get("systemId"));
        List<YichePlatform> yichePlatformAndroidWeek= CalculateRatioUtil.addCalculateRatioWeek(yichePlatformsWeek, yichePlatformsWeek1);
        map1.put("android",yichePlatformAndroidWeek);
        map.replace("systemId","1");
        map.replace("week",week);
        List<YichePlatform> yichePlatformsWeekIos1 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeekIos1,map.get("systemId"));
        map.replace("week",week1);
        List<YichePlatform> yichePlatformsWeekIos2 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeekIos2,map.get("systemId"));
        List<YichePlatform> yichePlatformsWeekIos = CalculateRatioUtil.addCalculateRatioWeek(yichePlatformsWeekIos1, yichePlatformsWeekIos2);
        map1.put("ios",yichePlatformsWeekIos);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getPcwapchannelDataWeek(String platformName,String week,String week1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("terminalId","0");
        map.put("week",week);
        List<YichePlatform> pcwapchannelDataWeekpc1 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        map.replace("week",week1);
        List<YichePlatform> pcwapchannelDataWeekpc2 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        List<YichePlatform> pcwapchannelDataWeekpc = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataWeekpc1, pcwapchannelDataWeekpc2);
        map1.put("pc",pcwapchannelDataWeekpc);
        map.replace("terminalId","1");
        map.replace("week",week);
        List<YichePlatform> pcwapchannelDataWeekyd1 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        map.replace("week",week1);
        List<YichePlatform> pcwapchannelDataWeekyd2 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        List<YichePlatform> pcwapchannelDataWeekyd = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataWeekyd1, pcwapchannelDataWeekyd2);
        map1.put("yd",pcwapchannelDataWeekyd);
        map.replace("terminalId","2");
        map.replace("week",week);
        List<YichePlatform> pcwapchannelDataWeekqt1 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        map.replace("week",week1);
        List<YichePlatform> pcwapchannelDataWeekqt2 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        List<YichePlatform> pcwapchannelDataWeekqt = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataWeekqt1, pcwapchannelDataWeekqt2);
        map1.put("qt",pcwapchannelDataWeekqt);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getThirdPartychannelDataWeek(String platformName, String week, String week1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("week",week);
        List<YichePlatform> thirdPartychannelDataWeek1 = displayWeekReportMapper.selectThirdPartychannelDataWeek(map);
        map.replace("week",week1);
        List<YichePlatform> thirdPartychannelDataWeek2 = displayWeekReportMapper.selectThirdPartychannelDataWeek(map);
        List<YichePlatform> thirdPartychannelDataWeek = CalculateRatioUtil.addCalculateRatioPcwapWeek(thirdPartychannelDataWeek1, thirdPartychannelDataWeek2);
        map1.put("dsf",thirdPartychannelDataWeek);
        return map1;
    }
}
