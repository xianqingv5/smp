package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Portion;
import com.yiche.smp.common.Ratio;
import com.yiche.smp.common.YichePlatform;
import com.yiche.smp.common.util.AddTotalUtil;
import com.yiche.smp.common.util.CalculatePortionUtil;
import com.yiche.smp.common.util.CalculateRatioUtil;
import com.yiche.smp.core.service.DisplayWeekReportService;
import com.yiche.smp.mapper.DisplayWeekReportMapper;
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

    @Override
    public Map<String,Object> selectSumDataWeek() {
        HashMap<String, String> map = new HashMap<>();
        Map<String,Object> map1 = new HashMap<>();
        Ratio ratio = new Ratio();
        GatherYicheAPP sumConsumeDataWeek = displayWeekReportMapper.selectSumDataWeek(map);
        GatherYicheAPP sumConsumeDataWeek1 = displayWeekReportMapper.selectSumDataWeek(map);
        Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio,sumConsumeDataWeek,sumConsumeDataWeek1);
        map1.put("week",sumConsumeDataWeek);
        map1.put("lastweek",sumConsumeDataWeek1);
        map1.put("ratio",ratio1);
        return map1;
    }

    @Override
    public Map<String, Object> getPlatformDataWeek() {
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
            map.put("week","");
            GatherYicheAPP platformDataWeek = displayWeekReportMapper.selectPlatformDataWeek(map);
            GatherYicheAPP sumDataWeek = displayWeekReportMapper.selectSumDataWeek(map);
            Portion portion1 = CalculatePortionUtil.calculatePortionSum(portion, platformDataWeek, sumDataWeek);
            map1.put("portion"+i,portion1);
            map.replace("week","");
            GatherYicheAPP platformDataWeek1 = displayWeekReportMapper.selectPlatformDataWeek(map);
            Ratio ratio1 = CalculateRatioUtil.calculateRatioSum(ratio, platformDataWeek, platformDataWeek1);
            map1.put("one"+i,platformDataWeek);
            map1.put("two"+i,platformDataWeek1);
            map1.put("ratio"+i,ratio1);
        }
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getplatformChannelDataWeek(String platformName) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("systemId","0");
        map.put("week","");
        List<YichePlatform> yichePlatformsWeek = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeek,map.get("systemId"));
        map.replace("week","");
        List<YichePlatform> yichePlatformsWeek1 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeek1,map.get("systemId"));
        List<YichePlatform> yichePlatformAndroidWeek= CalculateRatioUtil.addCalculateRatio(yichePlatformsWeek, yichePlatformsWeek1);
        map1.put("android",yichePlatformAndroidWeek);
        map.replace("systemId","1");
        map.replace("week","");
        List<YichePlatform> yichePlatformsWeekIos1 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeekIos1,map.get("systemId"));
        map.replace("week","");
        List<YichePlatform> yichePlatformsWeekIos2 = displayWeekReportMapper.selectplatformChannelDataWeek(map);
        AddTotalUtil.addTotal(yichePlatformsWeekIos2,map.get("systemId"));
        List<YichePlatform> yichePlatformsWeekIos = CalculateRatioUtil.addCalculateRatio(yichePlatformsWeekIos1, yichePlatformsWeekIos2);
        map1.put("ios",yichePlatformsWeekIos);
        return map1;
    }

    @Override
    public Map<String, List<YichePlatform>> getPcwapchannelDataWeek(String platformName) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<YichePlatform>> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("terminalId","0");
        map.put("week"," ");
        List<YichePlatform> pcwapchannelDataWeekpc1 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        map.replace("week"," ");
        List<YichePlatform> pcwapchannelDataWeekpc2 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        List<YichePlatform> pcwapchannelDataWeekpc = CalculateRatioUtil.addCalculateRatioPcwap(pcwapchannelDataWeekpc1, pcwapchannelDataWeekpc2);
        map1.put("pc",pcwapchannelDataWeekpc);
        map.replace("terminalId","1");
        map.replace("week"," ");
        List<YichePlatform> pcwapchannelDataWeekyd1 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        map.replace("week"," ");
        List<YichePlatform> pcwapchannelDataWeekyd2 = displayWeekReportMapper.selectPcwapchannelDataWeek(map);
        List<YichePlatform> pcwapchannelDataWeekyd = CalculateRatioUtil.addCalculateRatioPcwap(pcwapchannelDataWeekyd1, pcwapchannelDataWeekyd2);
        map1.put("yd",pcwapchannelDataWeekyd);
        return map1;
    }
}
