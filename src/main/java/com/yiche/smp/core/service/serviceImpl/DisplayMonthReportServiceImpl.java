package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Portion;
import com.yiche.smp.common.Ratio;
import com.yiche.smp.common.YichePlatform;
import com.yiche.smp.common.util.AddTotalUtil;
import com.yiche.smp.common.util.CalculatePortionUtil;
import com.yiche.smp.common.util.CalculateRatioUtil;
import com.yiche.smp.core.service.DisplayMonthReportService;
import com.yiche.smp.mapper.DisplayMonthReportMapper;
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
    @Override
    public Map<String, Object> selectSumDatamonth() {
        HashMap<String, String> map = new HashMap<>();
        Map<String,Object> map1 = new HashMap<>();
        Ratio ratio = new Ratio();
        GatherYicheAPP sumConsumeDataMonth = displayMonthReportMapper.selectSumDataMonth(map);
        GatherYicheAPP sumConsumeDataMonth1 = displayMonthReportMapper.selectSumDataMonth(map);
        Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio,sumConsumeDataMonth,sumConsumeDataMonth1);
        map1.put("month",sumConsumeDataMonth);
        map1.put("lastmonth",sumConsumeDataMonth1);
        map1.put("ratio",ratio1);
        return map1;
    }

    @Override
    public Map<String, Object> getPlatformDatamonth() {
        Map<String, String> map = new HashMap<>();
        Map<String,Object> map1 = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        Portion portion = new Portion();
        Ratio ratio = new Ratio();
        list.add("易车APP");
        list.add("报价APP");
        list.add("PCWAP");
        map.put("platformName",list.get(0));
        for (int i=0;i<=list.size()-2;i++){
            if(i>0){
                map.replace("platformName",list.get(i));
            }
            map.put("month","");
            GatherYicheAPP platformDataMonth = displayMonthReportMapper.selectPlatformDataMonth(map);
            GatherYicheAPP sumDataMonth = displayMonthReportMapper.selectSumDataMonth(map);
            Portion portion1 = CalculatePortionUtil.calculatePortionSum(portion, platformDataMonth, sumDataMonth);
            map1.put("portion"+i,portion1);
            map.replace("month","");
            GatherYicheAPP platformDataMonth1 = displayMonthReportMapper.selectPlatformDataMonth(map);
            Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, platformDataMonth, platformDataMonth1);
            map1.put("one"+i,platformDataMonth);
            map1.put("two"+i,platformDataMonth1);
            map1.put("ratio"+i,ratio1);
        }
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getplatformChannelDataMonth(String platformName) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("systemId","0");
        map.put("month","");
        List<YichePlatform> yichePlatformsMonth = displayMonthReportMapper.selectplatformChannelDataMonth(map);
        AddTotalUtil.addTotal(yichePlatformsMonth,map.get("systemId"));
        map.replace("month","");
        List<YichePlatform> yichePlatformsMonth1 = displayMonthReportMapper.selectplatformChannelDataMonth(map);
        AddTotalUtil.addTotal(yichePlatformsMonth1,map.get("systemId"));
        List<YichePlatform> yichePlatformAndroidMonth= CalculateRatioUtil.addCalculateRatio(yichePlatformsMonth, yichePlatformsMonth1);
        map1.put("android",yichePlatformAndroidMonth);
        map.replace("systemId","1");
        map.replace("month","");
        List<YichePlatform> yichePlatformsMonthIos1 = displayMonthReportMapper.selectplatformChannelDataMonth(map);
        AddTotalUtil.addTotal(yichePlatformsMonthIos1,map.get("systemId"));
        map.replace("month","");
        List<YichePlatform> yichePlatformsMonthIos2 = displayMonthReportMapper.selectplatformChannelDataMonth(map);
        AddTotalUtil.addTotal(yichePlatformsMonthIos2,map.get("systemId"));
        List<YichePlatform> yichePlatformsMonthIos = CalculateRatioUtil.addCalculateRatio(yichePlatformsMonthIos1, yichePlatformsMonthIos2);
        map1.put("ios",yichePlatformsMonthIos);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getPcwapchannelDataMonth(String platformName) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("terminalId","0");
        map.put("month"," ");
        List<YichePlatform> pcwapchannelDataMonthpc1 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        map.replace("month"," ");
        List<YichePlatform> pcwapchannelDataMonthpc2 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        List<YichePlatform> pcwapchannelDataMonthpc = CalculateRatioUtil.addCalculateRatioPcwap(pcwapchannelDataMonthpc1, pcwapchannelDataMonthpc2);
        map1.put("pc",pcwapchannelDataMonthpc);
        map.replace("terminalId","1");
        map.replace("month"," ");
        List<YichePlatform> pcwapchannelDataMonthyd1 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        map.replace("month"," ");
        List<YichePlatform> pcwapchannelDataMonthyd2 = displayMonthReportMapper.selectPcwapchannelDataMonth(map);
        List<YichePlatform> pcwapchannelDataMonthyd = CalculateRatioUtil.addCalculateRatioPcwap(pcwapchannelDataMonthyd1, pcwapchannelDataMonthyd2);
        map1.put("yd",pcwapchannelDataMonthyd);
        return map1;
    }
}
