package com.yiche.smp.core.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.core.service.ChannelConsumeReportService;
import com.yiche.smp.mapper.ChannelConsumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/8
 */
@Service
public class ChannelConsumeReportServiceImpl implements ChannelConsumeReportService {

    @Autowired
    private ChannelConsumeMapper channelConsumeMapper;

    @Override
    public PageInfo<GatherYicheAPP> getChannelConsumeReport(String platformName, String channelName, String startTime, String endTime, int isDetail, Integer pageno, Integer pagesize) {
        Map<String, Object> map = new HashMap<>();
        PageInfo<GatherYicheAPP> gatherYicheAPPPageInfo = new PageInfo<>();
        if ("全部".equals(platformName)) {
            platformName = null;
        }
        if ("全部".equals(channelName)) {
            channelName = null;
        }
        map.put("platformName", platformName);
        map.put("channelName", channelName);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        if (isDetail == 1) {
            PageHelper.startPage(pageno, pagesize);
            List<GatherYicheAPP> channelSumConsume = channelConsumeMapper.getChannelSumConsume(map);
            gatherYicheAPPPageInfo = new PageInfo<>(channelSumConsume);
        } else {
            PageHelper.startPage(pageno, pagesize);
            List<GatherYicheAPP> channelDetailConsume = channelConsumeMapper.getChannelDetailConsume(map);
            gatherYicheAPPPageInfo = new PageInfo<>(channelDetailConsume);
        }
        return gatherYicheAPPPageInfo;
    }
}
