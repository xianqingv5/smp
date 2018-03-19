package com.yiche.smp.core.service;

import com.github.pagehelper.PageInfo;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/8
 */
public interface ChannelConsumeReportService {

    public PageInfo<GatherYicheAPP> getChannelConsumeReport(String platformName, String channelName, String startTime, String endTime, int isDetail, Integer pageno, Integer pagesize);
}
