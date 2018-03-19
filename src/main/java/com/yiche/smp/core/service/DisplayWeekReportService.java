package com.yiche.smp.core.service;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.YichePlatform;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/16
 */
public interface DisplayWeekReportService {

    public Map<String,Object> selectSumDataWeek();

    public Map<String,Object> getPlatformDataWeek();

    public Map<String, List<YichePlatform>> getplatformChannelDataWeek(String platformName);

    public Map<String, List<YichePlatform>> getPcwapchannelDataWeek(String platformName);
}
