package com.yiche.smp.core.service;

import com.yiche.smp.common.YichePlatform;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/16
 */
public interface DisplayMonthReportService {

    public Map<String,Object> selectSumDatamonth();

    public Map<String,Object> getPlatformDatamonth();

    public Map<String, List<YichePlatform>> getplatformChannelDataMonth(String platformName);

    public Map<String, List<YichePlatform>> getPcwapchannelDataMonth(String platformName);
}
