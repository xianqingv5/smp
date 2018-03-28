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
import com.yiche.smp.core.service.DisplayMonthReportService;
import com.yiche.smp.mapper.DisplayMonthReportMapper;
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
public class DisplayMonthReportServiceImpl implements DisplayMonthReportService {
    @Autowired
    private DisplayMonthReportMapper displayMonthReportMapper;
    private Logger logger = LoggerFactory.getLogger(DisplayMonthReportServiceImpl.class);

    @Override
    public DayReport selectSumDatamonth(String month, String month1) {
        Long leadsCnt = 0l;
        Long leadsCnt1 = 0l;
        Long userCnt = 0l;
        Long userCnt1 = 0l;
        Float actualConsume = 0.0f;
        Float actualConsume1 = 0.0f;
        Double leadsCost = 0.0;
        Double leadsCost1 = 0.0;
        HashMap<String, String> map = new HashMap<>();
        map.put("month", month);
        Data data = new Data();
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();
        ArrayList<Data> datas = new ArrayList<>();
        DayReport dayReport = new DayReport();
        Ratio ratio = new Ratio();
        GatherYicheAPP sumConsumeDataMonth = displayMonthReportMapper.selectSumDataMonth(map);
        if (sumConsumeDataMonth == null) {
            logger.info("此月没数据");
        } else {
            if (sumConsumeDataMonth.getLeadsCnt() != null) {
                leadsCnt = sumConsumeDataMonth.getLeadsCnt();
            }
            if (sumConsumeDataMonth.getActualConsume() != null) {
                actualConsume = sumConsumeDataMonth.getActualConsume();
            }
            if (sumConsumeDataMonth.getLeadsUserCnt() != null) {
                userCnt = sumConsumeDataMonth.getLeadsUserCnt();
            }
            if (sumConsumeDataMonth.getLeadsCost() != null) {
                leadsCost = sumConsumeDataMonth.getLeadsCost();
            }
        }
        map.replace("month", month1);
        GatherYicheAPP sumConsumeDataMonth1 = displayMonthReportMapper.selectSumDataMonth(map);
        if (sumConsumeDataMonth1 == null) {
            logger.info("此月没数据");
        } else {
            if (sumConsumeDataMonth1.getLeadsCnt() != null) {
                leadsCnt1 = sumConsumeDataMonth1.getLeadsCnt();
            }
            if (sumConsumeDataMonth1.getActualConsume() != null) {
                actualConsume1 = sumConsumeDataMonth1.getActualConsume();
            }
            if (sumConsumeDataMonth1.getLeadsUserCnt() != null) {
                userCnt1 = sumConsumeDataMonth1.getLeadsUserCnt();
            }
            if (sumConsumeDataMonth1.getLeadsCost() != null) {
                leadsCost1 = sumConsumeDataMonth1.getLeadsCost();
            }
        }
        if (sumConsumeDataMonth == null && sumConsumeDataMonth1 == null) {
            return dayReport;
        }
        Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, sumConsumeDataMonth, sumConsumeDataMonth1);
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

    @Override
    public List<DayReport> getPlatformDatamonth(String month, String month1) {
        Map<String, String> map = new HashMap<>();
        List<DayReport> list2 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Portion portion = new Portion();
        Ratio ratio = new Ratio();
        list.add("PCWAP");
        list.add("报价APP");
        list.add("易车APP");
        list.add("第三方");
        map.put("platformName", list.get(0));
        for (int i = 0; i <= list.size() - 1; i++) {
            Long leadsCnt = 0l;
            Long leadsCnt1 = 0l;
            Long userCnt = 0l;
            Long userCnt1 = 0l;
            Float actualConsume1 = 0f;
            Float actualConsume = 0f;
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
            map.put("month", month);
            GatherYicheAPP platformDataMonth = displayMonthReportMapper.selectPlatformDataMonth(map);
            if (platformDataMonth == null) {
                logger.info("此月没有数据");
            } else {
                if (platformDataMonth.getLeadsCnt() != null) {
                    leadsCnt = platformDataMonth.getLeadsCnt();
                }
                if (platformDataMonth.getLeadsUserCnt() != null) {
                    userCnt = platformDataMonth.getLeadsUserCnt();
                }
                if (platformDataMonth.getActualConsume() != null) {
                    actualConsume = platformDataMonth.getActualConsume();
                }
                if (platformDataMonth.getLeadsCost() != null) {
                    leadsCost = platformDataMonth.getLeadsCost();
                }
            }
            GatherYicheAPP sumDataMonth = displayMonthReportMapper.selectSumDataMonth(map);
            Portion portion1 = CalculatePortionUtil.calculatePortionSum(portion, platformDataMonth, sumDataMonth);
            map.replace("month", month1);
            GatherYicheAPP platformDataMonth1 = displayMonthReportMapper.selectPlatformDataMonth(map);
            if (platformDataMonth1 == null) {
                logger.info("此月没有数据");
            } else {
                if (platformDataMonth1.getLeadsCnt() != null) {
                    leadsCnt1 = platformDataMonth1.getLeadsCnt();
                }
                if (platformDataMonth1.getLeadsUserCnt() != null) {
                    userCnt1 = platformDataMonth1.getLeadsUserCnt();
                }
                if (platformDataMonth1.getActualConsume() != null) {
                    actualConsume1 = platformDataMonth1.getActualConsume();
                }
                if (platformDataMonth1.getLeadsCost() != null) {
                    leadsCost1 = platformDataMonth1.getLeadsCost();
                }
            }
            Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, platformDataMonth, platformDataMonth1);
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
    public Map<String, List<YichePlatform>> getplatformChannelDataMonth(String platformName, String month, String month1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName", platformName);
        map.put("systemId", "0");
        map.put("month", month);
        List<YichePlatform> yichePlatformsMonth = displayMonthReportMapper.selectplatformChannelDataMonth(map);
        AddTotalUtil.addTotal(yichePlatformsMonth, map.get("systemId"));
        map.replace("month", month1);
        List<YichePlatform> yichePlatformsMonth1 = displayMonthReportMapper.selectplatformChannelDataMonth(map);
        AddTotalUtil.addTotal(yichePlatformsMonth1, map.get("systemId"));
        List<YichePlatform> yichePlatformAndroidMonth = CalculateRatioUtil.addCalculateRatioWeek(yichePlatformsMonth, yichePlatformsMonth1);
        map1.put("android", yichePlatformAndroidMonth);
        map.replace("systemId", "1");
        map.replace("month", month);
        List<YichePlatform> yichePlatformsMonthIos1 = displayMonthReportMapper.selectplatformChannelDataMonth(map);
        AddTotalUtil.addTotal(yichePlatformsMonthIos1, map.get("systemId"));
        map.replace("month", month1);
        List<YichePlatform> yichePlatformsMonthIos2 = displayMonthReportMapper.selectplatformChannelDataMonth(map);
        AddTotalUtil.addTotal(yichePlatformsMonthIos2, map.get("systemId"));
        List<YichePlatform> yichePlatformsMonthIos = CalculateRatioUtil.addCalculateRatioWeek(yichePlatformsMonthIos1, yichePlatformsMonthIos2);
        map1.put("ios", yichePlatformsMonthIos);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getPcwapchannelDataMonth(String platformName, String month, String month1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName", platformName);
        map.put("terminalId", "0");
        map.put("month", month);
        List<YichePlatform> pcwapchannelDataMonthpc1 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        map.replace("month", month1);
        List<YichePlatform> pcwapchannelDataMonthpc2 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        List<YichePlatform> pcwapchannelDataMonthpc = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataMonthpc1, pcwapchannelDataMonthpc2);
        map1.put("pc", pcwapchannelDataMonthpc);
        map.replace("terminalId", "1");
        map.replace("month", month);
        List<YichePlatform> pcwapchannelDataMonthyd1 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        map.replace("month", month1);
        List<YichePlatform> pcwapchannelDataMonthyd2 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        List<YichePlatform> pcwapchannelDataMonthyd = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataMonthyd1, pcwapchannelDataMonthyd2);
        map1.put("yd", pcwapchannelDataMonthyd);
        map.replace("terminalId", "2");
        map.replace("month", month);
        List<YichePlatform> pcwapchannelDataMonthqt1 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        map.replace("month", month1);
        List<YichePlatform> pcwapchannelDataMonthqt2 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        List<YichePlatform> pcwapchannelDataMonthqt = CalculateRatioUtil.addCalculateRatioPcwapWeek(pcwapchannelDataMonthqt1, pcwapchannelDataMonthqt2);
        map1.put("qt", pcwapchannelDataMonthqt);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getThirdPartychannelDataMonth(String platformName, String month, String month1) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName", platformName);
        map.put("month", month);
        List<YichePlatform> thirdPartychannelDataMonth1 = displayMonthReportMapper.selectThirdPartychannelDataMonth(map);
        map.replace("month", month1);
        List<YichePlatform> thirdPartychannelDataMonth2 = displayMonthReportMapper.selectThirdPartychannelDataMonth(map);
        List<YichePlatform> thirdPartychannelDataMonth = CalculateRatioUtil.addCalculateRatioPcwapWeek(thirdPartychannelDataMonth1, thirdPartychannelDataMonth2);
        map1.put("dsf", thirdPartychannelDataMonth);
        return map1;
    }
}
