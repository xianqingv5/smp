package com.yiche.smp.core.service;

import com.yiche.smp.common.DayReport.DayReport;
import com.yiche.smp.common.YichePlatform;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/16
 */
public interface DisplayMonthReportService {

    public DayReport selectSumDatamonth(String month, String month1);

    public List<DayReport> getPlatformDatamonth(String month, String month1);

    public Map<String, List<YichePlatform>> getplatformChannelDataMonth(String platformName,String month, String month1);

    public Map<String, List<YichePlatform>> getPcwapchannelDataMonth(String platformName,String month, String month1);

    public Map<String, List<YichePlatform>> getThirdPartychannelDataMonth(String platformName,String month, String month1);
}
