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
public class DisplayWeekReportServiceImpl implements DisplayWeekReportService {
    @Autowired
    private DisplayWeekReportMapper displayWeekReportMapper;
    private Logger logger = LoggerFactory.getLogger(DisplayWeekReportServiceImpl.class);

    @Override
    public DayReport selectSumDataWeek(String week, String week1) {
        String qfLeadsCnt="";
        String qfLeadsCnt1="";
        String qfUserCnt="";
        String qfUserCnt1="";
        String qfActualConsume="";
        String qfActualConsume1="";
        String qfLeadsCost="";
        String qfLeadsCost1="";
        HashMap<String, String> map = new HashMap<>();
        map.put("week", week);
        Data data = new Data();
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();
        ArrayList<Data> datas = new ArrayList<>();
        DayReport dayReport = new DayReport();
        Ratio ratio = new Ratio();
        GatherYicheAPP sumConsumeDataWeek = displayWeekReportMapper.selectSumDataWeek(map);
        if (sumConsumeDataWeek == null) {
            logger.info("此周没有数据");
        } else {
            if (sumConsumeDataWeek.getQfLeadsCnt()!=null){
                qfLeadsCnt=sumConsumeDataWeek.getQfLeadsCnt();
            }
            if (sumConsumeDataWeek.getQfLeadsUserCnt()!=null){
                qfUserCnt=sumConsumeDataWeek.getQfLeadsUserCnt();
            }
            if (sumConsumeDataWeek.getQfActualConsume()!=null){
                qfActualConsume="￥"+sumConsumeDataWeek.getQfActualConsume();
            }
            if (sumConsumeDataWeek.getQfLeadsCost()!=null){
                qfLeadsCost="￥"+sumConsumeDataWeek.getQfLeadsCost();
            }
        }
        map.replace("week", week1);
        GatherYicheAPP sumConsumeDataWeek1 = displayWeekReportMapper.selectSumDataWeek(map);
        if (sumConsumeDataWeek1 == null) {
            logger.info("此周没有数据");
        } else {
            if (sumConsumeDataWeek1.getQfLeadsCnt()!=null){
                qfLeadsCnt1=sumConsumeDataWeek1.getQfLeadsCnt();
            }
            if (sumConsumeDataWeek1.getQfLeadsUserCnt()!=null){
                qfUserCnt1=sumConsumeDataWeek1.getQfLeadsUserCnt();
            }
            if (sumConsumeDataWeek1.getQfActualConsume()!=null){
                qfActualConsume1="￥"+sumConsumeDataWeek1.getQfActualConsume();
            }
            if (sumConsumeDataWeek1.getQfLeadsCost()!=null){
                qfLeadsCost1="￥"+sumConsumeDataWeek1.getQfLeadsCost();
            }
        }
        if (sumConsumeDataWeek == null && sumConsumeDataWeek1 == null) {
            return dayReport;
        }
        Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, sumConsumeDataWeek, sumConsumeDataWeek1);
        String clueRatio = ratio1.getClueRatio();
        data.setTitle("总线索量(条)");
        data.setPreTwoDay(qfLeadsCnt1);
        data.setPreOneDay(qfLeadsCnt);
        data.setRatio(clueRatio);
        String userRatio = ratio1.getUserRatio();
        data1.setTitle("总用户量(个)");
        data1.setPreTwoDay(qfUserCnt1);
        data1.setPreOneDay(qfUserCnt);
        data1.setRatio(userRatio);
        String consumeRatio = ratio1.getConsumeRatio();
        data2.setTitle("总体消耗(元)");
        data2.setPreTwoDay(qfActualConsume1);
        data2.setPreOneDay(qfActualConsume);
        data2.setRatio(consumeRatio);
        String leadsCostRatio = ratio1.getLeadsCostRatio();
        data3.setTitle("线索成本(元)");
        data3.setPreTwoDay(qfLeadsCost1);
        data3.setPreOneDay(qfLeadsCost);
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
    public List<DayReport> getPlatformDataWeek(String week, String week1) {
        Map<String, String> map = new HashMap<>();
        List<DayReport> list2 = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Portion portion = new Portion();
        Ratio ratio = new Ratio();
        list.add("PCWAP");
        list.add("报价APP");
        list.add("易车APP");
        list.add("第三方");
        map.put("platformName", list.get(0));
        for (int i = 0; i <= list.size() - 1; i++) {
            String qfLeadsCnt="";
            String qfLeadsCnt1="";
            String qfUserCnt="";
            String qfUserCnt1="";
            String qfActualConsume="";
            String qfActualConsume1="";
            String qfLeadsCost="";
            String qfLeadsCost1="";
            List<Data> datas = new ArrayList<>();
            DayReport dayReport = new DayReport();
            Data data = new Data();
            Data data1 = new Data();
            Data data2 = new Data();
            Data data3 = new Data();
            if (i > 0) {
                map.replace("platformName", list.get(i));
            }
            map.put("week", week);
            GatherYicheAPP platformDataWeek = displayWeekReportMapper.selectPlatformDataWeek(map);
            if (platformDataWeek == null) {
                logger.info("此月没有数据");
            } else {
                if (platformDataWeek.getQfLeadsCnt()!=null){
                    qfLeadsCnt=platformDataWeek.getQfLeadsCnt();
                }
                if (platformDataWeek.getQfLeadsUserCnt()!=null){
                    qfUserCnt=platformDataWeek.getQfLeadsUserCnt();
                }
                if (platformDataWeek.getQfActualConsume()!=null){
                    qfActualConsume="￥"+platformDataWeek.getQfActualConsume();
                }
                if (platformDataWeek.getQfLeadsCost()!=null){
                    qfLeadsCost="￥"+platformDataWeek.getQfLeadsCost();
                }
            }
            GatherYicheAPP sumDataWeek = displayWeekReportMapper.selectSumDataWeek(map);
            Portion portion1 = CalculatePortionUtil.calculatePortionSum(portion, platformDataWeek, sumDataWeek);
            map.replace("week", week1);
            GatherYicheAPP platformDataWeek1 = displayWeekReportMapper.selectPlatformDataWeek(map);
            if (platformDataWeek1 == null) {
                logger.info("此月没有数据");
            } else {
                if (platformDataWeek1.getQfLeadsCnt()!=null){
                    qfLeadsCnt1=platformDataWeek1.getQfLeadsCnt();
                }
                if (platformDataWeek1.getQfLeadsUserCnt()!=null){
                    qfUserCnt1=platformDataWeek1.getQfLeadsUserCnt();
                }
                if (platformDataWeek1.getQfActualConsume()!=null){
                    qfActualConsume1="￥"+platformDataWeek1.getQfActualConsume();
                }
                if (platformDataWeek1.getQfLeadsCost()!=null){
                    qfLeadsCost1="￥"+platformDataWeek1.getQfLeadsCost();
                }
            }
            Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, platformDataWeek, platformDataWeek1);
            String clueRatio = ratio1.getClueRatio();
            String cluePortion = portion1.getCluePortion();
            data.setTitle("线索量(条)");
            data.setPreTwoDay(qfLeadsCnt1);
            data.setPreOneDay(qfLeadsCnt);
            data.setRatio(clueRatio);
            data.setPortion(cluePortion);
            String userRatio = ratio1.getUserRatio();
            String userPortion = portion1.getUserPortion();
            data1.setTitle("用户量(个)");
            data1.setPreTwoDay(qfUserCnt1);
            data1.setPreOneDay(qfUserCnt);
            data1.setRatio(userRatio);
            data1.setPortion(userPortion);
            String consumeRatio = ratio1.getConsumeRatio();
            String consumePortion = portion1.getConsumePortion();
            data2.setTitle("消耗(元)");
            data2.setPreTwoDay(qfActualConsume1);
            data2.setPreOneDay(qfActualConsume);
            data2.setRatio(consumeRatio);
            data2.setPortion(consumePortion);
            String costRatio = ratio1.getLeadsCostRatio();
            String costPortion = portion.getLeadsCostPortion();
            data3.setTitle("线索成本(元)");
            data3.setPreTwoDay(qfLeadsCost1);
            data3.setPreOneDay(qfLeadsCost);
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
    public Map<String, List<YichePlatform>> getplatformChannelDataWeek(String platformName, String week, String week1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName", platformName);
        map.put("systemId", "0");
        map.put("week", week);
        List<YichePlatform> yichePlatformsWeek = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeek, map.get("systemId"));
        map.replace("week", week1);
        List<YichePlatform> yichePlatformsWeek1 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeek1, map.get("systemId"));
        List<YichePlatform> yichePlatformAndroidWeek = CalculateRatioUtil.addCalculateRatioWeek(yichePlatformsWeek, yichePlatformsWeek1);
        map1.put("android", yichePlatformAndroidWeek);
        map.replace("systemId", "1");
        map.replace("week", week);
        List<YichePlatform> yichePlatformsWeekIos1 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeekIos1, map.get("systemId"));
        map.replace("week", week1);
        List<YichePlatform> yichePlatformsWeekIos2 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeekIos2, map.get("systemId"));
        List<YichePlatform> yichePlatformsWeekIos = CalculateRatioUtil.addCalculateRatioWeek(yichePlatformsWeekIos1, yichePlatformsWeekIos2);
        map1.put("ios", yichePlatformsWeekIos);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getPcwapchannelDataWeek(String platformName, String week, String week1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName", platformName);
        map.put("terminalId", "0");
        map.put("week", week);
        List<YichePlatform> pcwapchannelDataWeekpc1 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        map.replace("week", week1);
        List<YichePlatform> pcwapchannelDataWeekpc2 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        List<YichePlatform> pcwapchannelDataWeekpc = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataWeekpc1, pcwapchannelDataWeekpc2);
        map1.put("pc", pcwapchannelDataWeekpc);
        map.replace("terminalId", "1");
        map.replace("week", week);
        List<YichePlatform> pcwapchannelDataWeekyd1 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        map.replace("week", week1);
        List<YichePlatform> pcwapchannelDataWeekyd2 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        List<YichePlatform> pcwapchannelDataWeekyd = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataWeekyd1, pcwapchannelDataWeekyd2);
        map1.put("yd", pcwapchannelDataWeekyd);
        map.replace("terminalId", "2");
        map.replace("week", week);
        List<YichePlatform> pcwapchannelDataWeekqt1 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        map.replace("week", week1);
        List<YichePlatform> pcwapchannelDataWeekqt2 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        List<YichePlatform> pcwapchannelDataWeekqt = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataWeekqt1, pcwapchannelDataWeekqt2);
        map1.put("qt", pcwapchannelDataWeekqt);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getThirdPartychannelDataWeek(String platformName, String week, String week1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName", platformName);
        map.put("week", week);
        List<YichePlatform> thirdPartychannelDataWeek1 = displayWeekReportMapper.selectThirdPartychannelDataWeek(map);
        map.replace("week", week1);
        List<YichePlatform> thirdPartychannelDataWeek2 = displayWeekReportMapper.selectThirdPartychannelDataWeek(map);
        List<YichePlatform> thirdPartychannelDataWeek = CalculateRatioUtil.addCalculateRatioPcwapWeek(thirdPartychannelDataWeek1, thirdPartychannelDataWeek2);
        map1.put("dsf", thirdPartychannelDataWeek);
        return map1;
    }
}
