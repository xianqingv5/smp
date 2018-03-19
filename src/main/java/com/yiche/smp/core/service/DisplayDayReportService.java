package com.yiche.smp.core.service;

import com.yiche.smp.common.DayReport.DayReport;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.YichePlatform;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/9
 */
public interface DisplayDayReportService {

    public DayReport getSumDataDay(String date, String date2);

    public List<Object> getPlatformDataDay(String date, String date2);

    public Map<String, List<YichePlatform>> getplatformChannelDataDay(String platformName, String date, String date2);

    public Map<String, List<YichePlatform>> getPcwapchannelDataDay(String platformName, String date, String date2);
}
