package com.yiche.smp.core.service;

import com.yiche.smp.common.EarlyWarningData;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.early.warning.EarlyWarning;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/15
 */
public interface ConsumeDayEarlyWarningService {

    public Map<String, Object> getEarlyWarningData(String platformId, String startTime, String endTime, String month);

    public List<GatherYicheAPP> getChannelConsumeData(String platformId, String startTime);

    public Map<String, Object> getMonthChannelConsumeData(String platformId, String startTime, String endTime, String month, int num);
}
