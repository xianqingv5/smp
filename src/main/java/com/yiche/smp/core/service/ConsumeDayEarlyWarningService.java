package com.yiche.smp.core.service;

import com.yiche.smp.common.EarlyWarningData;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.early.warning.EarlyWarning;

import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/15
 */
public interface ConsumeDayEarlyWarningService {

    public List<EarlyWarningData> getEarlyWarningData(String platformName, String startTime, String endTime, String month);

    public List<GatherYicheAPP> getChannelConsumeData(String platformName, String startTime, String endTime);

    public EarlyWarningData getMonthChannelConsumeData(String platformName, String startTime, String endTime, String month, int num);
}
