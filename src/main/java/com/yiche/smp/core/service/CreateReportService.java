package com.yiche.smp.core.service;

import com.yiche.smp.common.GatherYicheAPP;

import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/13
 */
public interface CreateReportService {

    public List<GatherYicheAPP> getChannelConsumeData(String platformName, String channelName, String startTime, String endTime, int isDetail);
}
