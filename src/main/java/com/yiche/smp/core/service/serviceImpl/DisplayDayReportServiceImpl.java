package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.api.DisplayDayReportController;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(DisplayDayReportServiceImpl.class);

    /**
     * 根据时间日期，查询前两天的日报总数据，并计算出环比
     *
     * @param date  //前一天
     * @param date2 //前两天
     * @return
     */
    @Override
    public DayReport getSumDataDay(String date, String date2) {
        Long leadsCnt = 0l;
        Long leadsCnt1 = 0l;
        String qfLeadsCnt="";
        String qfLeadsCnt1="";
        Float actualConsume = 0.0f;
        Float actualConsume1 = 0.0f;
        String qfActualConsume="";
        String qfActualConsume1="";
        String qfUserCnt="";
        String qfUserCnt1="";
        String qfLeadsCost="";
        String qfLeadsCost1="";
        Double leadsCost = 0.0;
        Double leadsCost1 = 0.0;
        Map<String, String> map = new HashMap<>();
        Data data = new Data();//用来封装数据格式
        Data data1 = new Data();//用来封装数据格式
        Data data2 = new Data();//用来封装数据格式
        Data data3 = new Data();//用来封装数据格式
        ArrayList<Data> datas = new ArrayList<>();
        DayReport dayReport = new DayReport();
        Ratio ratio = new Ratio();
        map.put("date", date);//获取前一天的数据
        GatherYicheAPP sumDataDayPre = displayDayReportMapper.getSumDataDay(map);
        if (sumDataDayPre == null) {
            logger.info("这一天没有数据");
        } else {
            if (sumDataDayPre.getLeadsCnt() != null) {
                leadsCnt = sumDataDayPre.getLeadsCnt();
            }
            if (sumDataDayPre.getActualConsume() != null) {
                actualConsume = sumDataDayPre.getActualConsume();
            }
            if (sumDataDayPre.getQfLeadsCnt()!=null){
                qfLeadsCnt=sumDataDayPre.getQfLeadsCnt();
            }
            if (sumDataDayPre.getQfActualConsume()!=null){
                qfActualConsume="￥"+sumDataDayPre.getQfActualConsume();
            }
            if (sumDataDayPre.getQfLeadsUserCnt()!=null){
                qfUserCnt=sumDataDayPre.getQfLeadsUserCnt();
            }
            sumDataDayPre.setLeadsCost(calculateLeadsCost(leadsCnt, actualConsume));//通过计算添加上线索成本属性
            qfLeadsCost = DataCalculationUtils.fmtMicrometer2(sumDataDayPre.getLeadsCost());
        }
        map.replace("date", date2);//通过替换日期，获取前两天的数据
        GatherYicheAPP sumDataDayPre1 = displayDayReportMapper.getSumDataDay(map);
        if (sumDataDayPre1 == null) {
            logger.info("这一天没有数据");
        } else {
            if (sumDataDayPre1.getLeadsCnt() != null) {
                leadsCnt1 = sumDataDayPre1.getLeadsCnt();
            }
            if (sumDataDayPre1.getActualConsume() != null) {
                actualConsume1 = sumDataDayPre1.getActualConsume();
            }
            if (sumDataDayPre1.getQfLeadsCnt()!=null){
                qfLeadsCnt1=sumDataDayPre1.getQfLeadsCnt();
            }
            if (sumDataDayPre1.getQfActualConsume()!=null){
                qfActualConsume1="￥"+sumDataDayPre1.getQfActualConsume();
            }
            if (sumDataDayPre1.getQfLeadsUserCnt()!=null){
                qfUserCnt1=sumDataDayPre1.getQfLeadsUserCnt();
            }
            sumDataDayPre1.setLeadsCost(calculateLeadsCost(leadsCnt1, actualConsume1));
            qfLeadsCost1 = DataCalculationUtils.fmtMicrometer2(sumDataDayPre1.getLeadsCost());
        }
        if (sumDataDayPre == null && sumDataDayPre1 == null) {
            return dayReport;
        }
        Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, sumDataDayPre, sumDataDayPre1);//计算环比
        String clueRatio = ratio1.getClueRatio();
        data.setTitle("总线索量(条)");//将总线索量封装到对应的格式里面
        data.setPreTwoDay(qfLeadsCnt1);
        data.setPreOneDay(qfLeadsCnt);
        data.setRatio(clueRatio);
        String userRatio = ratio1.getUserRatio();
        data1.setTitle("总用户量(个)");//将总用户量封装到对应的格式里面
        data1.setPreTwoDay(qfUserCnt1);
        data1.setPreOneDay(qfUserCnt);
        data1.setRatio(userRatio);
        String consumeRatio = ratio1.getConsumeRatio();
        data2.setTitle("总体消耗(元)");//将总体消耗封装到对应的格式里面
        data2.setPreTwoDay(qfActualConsume1);
        data2.setPreOneDay(qfActualConsume);
        data2.setRatio(consumeRatio);
        String costRatio = ratio1.getLeadsCostRatio();
        data3.setTitle("线索成本(元)");//将线索成本封装到对应的格式里面
        if ("0.00".equals(qfLeadsCost1)||"".equals(qfLeadsCost1)){
            data3.setPreTwoDay("");
        }else {
            data3.setPreTwoDay("￥"+qfLeadsCost1);
        }
        if ("0.00".equals(qfLeadsCost)||"".equals(qfLeadsCost)){
            data3.setPreOneDay("");
        }else {
            data3.setPreOneDay("￥"+qfLeadsCost);
        }
        data3.setRatio(costRatio);
        dayReport.setTitle("总数据");//将总数据封装到对应的格式里面
        datas.add(data);
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);
        dayReport.setData(datas);
        return dayReport;
    }

    /**
     * 根据时间日期,查询前两天的各个平台的总数据，并结合总量计算出环比，份额
     *
     * @param date  //前一天
     * @param date2 //前两天
     * @return
     */
    @Override
    public List<Object> getPlatformDataDay(String date, String date2) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        Portion portion = new Portion();
        Ratio ratio = new Ratio();
        list.add("PCWAP");
        list.add("报价APP");//将这些平台依此放进list里，为了依此获取对应平台的消耗财务数据
        list.add("易车APP");
        map.put("platformName", list.get(0));
        for (int i = 0; i <= list.size() - 1; i++) {
            Long leadsCnt = 0l;
            Long leadsCnt1 = 0l;
            Long leadsCnt2=0l;
            String qfLeadsCnt="";
            String qfLeadsCnt1="";
            Float actualConsume = 0.0f;
            Float actualConsume1 = 0.0f;
            Float actualConsume2 = 0.0f;
            String qfActualConsume="";
            String qfActualConsume1="";
            String qfUserCnt="";
            String qfUserCnt1="";
            String qfLeadsCost="";
            String qfLeadsCost1="";
            Double leadsCost = 0.0;
            Double leadsCost1 = 0.0;
            List<Data> datas = new ArrayList<>();
            DayReport dayReport = new DayReport();
            Data data = new Data();
            Data data1 = new Data();
            Data data2 = new Data();
            Data data3 = new Data();
            if (i > 0) {
                map.replace("platformName", list.get(i));
            }
            map.put("date", date);
            GatherYicheAPP platformDataDay = displayDayReportMapper.getPlatformDataDay(map);
            if (platformDataDay==null){
                logger.info("这一天没有数据");
            }else {
                if (platformDataDay.getLeadsCnt() != null) {
                    leadsCnt = platformDataDay.getLeadsCnt();
                }
                if (platformDataDay.getActualConsume() != null) {
                    actualConsume = platformDataDay.getActualConsume();
                }
                if (platformDataDay.getQfLeadsCnt()!=null){
                    qfLeadsCnt=platformDataDay.getQfLeadsCnt();
                }
                if (platformDataDay.getQfActualConsume()!=null){
                    qfActualConsume="￥"+platformDataDay.getQfActualConsume();
                }
                if (platformDataDay.getQfLeadsUserCnt()!=null){
                    qfUserCnt=platformDataDay.getQfLeadsUserCnt();
                }
                platformDataDay.setLeadsCost(calculateLeadsCost(leadsCnt, actualConsume));
                qfLeadsCost = DataCalculationUtils.fmtMicrometer2(platformDataDay.getLeadsCost());
            }
            GatherYicheAPP sumDataDay = displayDayReportMapper.getSumDataDay(map);
            if (sumDataDay == null) {
                logger.info("这一天没有数据");
            } else {
                if (sumDataDay.getLeadsCnt() != null) {
                    leadsCnt2 = sumDataDay.getLeadsCnt();
                }
                if (sumDataDay.getActualConsume() != null) {
                    actualConsume2 = sumDataDay.getActualConsume();
                }
                sumDataDay.setLeadsCost(calculateLeadsCost(leadsCnt2, actualConsume2));
            }
            Portion portion1 = CalculatePortionUtil.calculatePortionSum(portion, platformDataDay, sumDataDay);//计算对应平台占总量的份额
            map.replace("date", date2);
            GatherYicheAPP platformDataDay1 = displayDayReportMapper.getPlatformDataDay(map);
            if (platformDataDay1==null){
                logger.info("这一天没有数据");
            }else {
                if (platformDataDay1.getLeadsCnt() != null) {
                    leadsCnt1 = platformDataDay1.getLeadsCnt();
                }
                if (platformDataDay1.getActualConsume() != null) {
                    actualConsume1 = platformDataDay1.getActualConsume();
                }
                if (platformDataDay1.getQfLeadsCnt()!=null){
                    qfLeadsCnt1=platformDataDay1.getQfLeadsCnt();
                }
                if (platformDataDay1.getQfActualConsume()!=null){
                    qfActualConsume1="￥"+platformDataDay1.getQfActualConsume();
                }
                if (platformDataDay1.getQfLeadsUserCnt()!=null){
                    qfUserCnt1=platformDataDay1.getQfLeadsUserCnt();
                }
                platformDataDay1.setLeadsCost(calculateLeadsCost(leadsCnt1, actualConsume1));
                qfLeadsCost1 = DataCalculationUtils.fmtMicrometer2(platformDataDay1.getLeadsCost());
            }
            Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, platformDataDay, platformDataDay1);
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
            if ("0.00".equals(qfLeadsCost1)||"".equals(qfLeadsCost1)){
                data3.setPreTwoDay("");
            }else {
                data3.setPreTwoDay("￥"+qfLeadsCost1);
            }
            if ("0.00".equals(qfLeadsCost)||"".equals(qfLeadsCost)){
                data3.setPreOneDay("");
            }else {
                data3.setPreOneDay("￥"+qfLeadsCost);
            }
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

    /**
     * 获取易车APP,报价APP平台的对应日期的详细渠道数据
     *
     * @param platformName //平台名称
     * @param date         //前一天
     * @param date2        //前两天
     * @return
     */
    @Override
    public Map<String, List<YichePlatform>> getplatformChannelDataDay(String platformName, String date, String date2) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName", platformName);
        map.put("systemId", "0");//系统为安卓的
        map.put("date", date);//前一天的数据
        List<YichePlatform> yichePlatforms = displayDayReportMapper.getplatformChannelDataDay(map);
        for (int i = 0; i <= yichePlatforms.size() - 1; i++) {//遍历集合，计算添加上线索成本
            yichePlatforms.get(i).setLeadsCost(calculateLeadsCost(yichePlatforms.get(i).getLeadsCnt(), yichePlatforms.get(i).getActualConsume()));
        }
        AddTotalUtil.addTotal(yichePlatforms, map.get("systemId"));//添加对应系统的统计
        map.replace("date", date2);//前两天的数据
        List<YichePlatform> yichePlatforms1 = displayDayReportMapper.getplatformChannelDataDay(map);
        for (int i = 0; i <= yichePlatforms1.size() - 1; i++) {
            yichePlatforms1.get(i).setLeadsCost(calculateLeadsCost(yichePlatforms1.get(i).getLeadsCnt(), yichePlatforms1.get(i).getActualConsume()));
        }
        AddTotalUtil.addTotal(yichePlatforms1, map.get("systemId"));
        List<YichePlatform> yichePlatformAndroid = CalculateRatioUtil.addCalculateRatio(yichePlatforms, yichePlatforms1);
        map1.put("android", yichePlatformAndroid);
        map.replace("systemId", "1");//系统为IOS
        map.replace("date", date); //前一天的数据
        List<YichePlatform> yichePlatformsIos1 = displayDayReportMapper.getplatformChannelDataDay(map);
        for (int i = 0; i <= yichePlatformsIos1.size() - 1; i++) {
            yichePlatformsIos1.get(i).setLeadsCost(calculateLeadsCost(yichePlatformsIos1.get(i).getLeadsCnt(), yichePlatformsIos1.get(i).getActualConsume()));
        }
        AddTotalUtil.addTotal(yichePlatformsIos1, map.get("systemId"));
        map.replace("date", date2);//前两天的数据
        List<YichePlatform> yichePlatformsIos2 = displayDayReportMapper.getplatformChannelDataDay(map);
        for (int i = 0; i <= yichePlatformsIos2.size() - 1; i++) {
            yichePlatformsIos2.get(i).setLeadsCost(calculateLeadsCost(yichePlatformsIos2.get(i).getLeadsCnt(), yichePlatformsIos2.get(i).getActualConsume()));
        }
        AddTotalUtil.addTotal(yichePlatformsIos2, map.get("systemId"));
        List<YichePlatform> yichePlatformsIos = CalculateRatioUtil.addCalculateRatio(yichePlatformsIos1, yichePlatformsIos2);
        map1.put("ios", yichePlatformsIos);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getPcwapchannelDataDay(String platformName, String date, String date2) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName", platformName);
        map.put("terminalId", "0");
        map.put("date", date);
        List<YichePlatform> pcwapchannelDataDaypc1 = displayDayReportMapper.getPcwapchannelDataDay(map);
        for (int i = 0; i <= pcwapchannelDataDaypc1.size() - 1; i++) {
            pcwapchannelDataDaypc1.get(i).setLeadsCost(calculateLeadsCost(pcwapchannelDataDaypc1.get(i).getLeadsCnt(), pcwapchannelDataDaypc1.get(i).getActualConsume()));
        }
        map.replace("date", date2);
        List<YichePlatform> pcwapchannelDataDaypc2 = displayDayReportMapper.getPcwapchannelDataDay(map);
        for (int i = 0; i <= pcwapchannelDataDaypc2.size() - 1; i++) {
            pcwapchannelDataDaypc2.get(i).setLeadsCost(calculateLeadsCost(pcwapchannelDataDaypc2.get(i).getLeadsCnt(), pcwapchannelDataDaypc2.get(i).getActualConsume()));
        }
        List<YichePlatform> pcwapchannelDataDaypc = CalculateRatioUtil.addCalculateRatioPcwap(pcwapchannelDataDaypc1, pcwapchannelDataDaypc2);
        map1.put("pc", pcwapchannelDataDaypc);
        map.replace("terminalId", "1");
        map.replace("date", date);
        List<YichePlatform> pcwapchannelDataDayyd1 = displayDayReportMapper.getPcwapchannelDataDay(map);
        for (int i = 0; i <= pcwapchannelDataDayyd1.size() - 1; i++) {
            pcwapchannelDataDayyd1.get(i).setLeadsCost(calculateLeadsCost(pcwapchannelDataDayyd1.get(i).getLeadsCnt(), pcwapchannelDataDayyd1.get(i).getActualConsume()));
        }
        map.replace("date", date2);
        List<YichePlatform> pcwapchannelDataDayyd2 = displayDayReportMapper.getPcwapchannelDataDay(map);
        for (int i = 0; i <= pcwapchannelDataDayyd2.size() - 1; i++) {
            pcwapchannelDataDayyd2.get(i).setLeadsCost(calculateLeadsCost(pcwapchannelDataDayyd2.get(i).getLeadsCnt(), pcwapchannelDataDayyd2.get(i).getActualConsume()));
        }
        List<YichePlatform> pcwapchannelDataDayyd = CalculateRatioUtil.addCalculateRatioPcwap(pcwapchannelDataDayyd1, pcwapchannelDataDayyd2);
        map1.put("yd", pcwapchannelDataDayyd);
        return map1;

    }

    /**
     * 获取线索成本
     *
     * @param num1 //线索量
     * @param num2 //消耗
     * @return //线索成本
     */
    private double calculateLeadsCost(Long num1, Float num2) {
        double leadsCost = 0.00;
        if (num1 != null && num1 != 0) {
            leadsCost = num2 / num1;
            double v = DataCalculationUtils.doubleDeal2(leadsCost);
            return v;
        }
        return leadsCost;
    }
}
