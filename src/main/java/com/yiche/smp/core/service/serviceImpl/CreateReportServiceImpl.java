package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.core.service.CreateReportService;
import com.yiche.smp.mapper.ChannelConsumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/13
 */
@Service
public class CreateReportServiceImpl implements CreateReportService {

    @Autowired
    private ChannelConsumeMapper channelConsumeMapper;

    @Override
    public List<GatherYicheAPP> getChannelConsumeData(String platformName, String channelName, String startTime, String endTime, int isDetail) {
        List<GatherYicheAPP> channelSumConsume = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
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
            channelSumConsume = channelConsumeMapper.getChannelSumConsume(map);
        }else {
            channelSumConsume = channelConsumeMapper.getChannelDetailConsume(map);
        }
        return channelSumConsume;

    }
}
