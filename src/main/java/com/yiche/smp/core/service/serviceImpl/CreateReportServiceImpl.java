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
    public List<GatherYicheAPP> getChannelConsumeData(String platformId, String channelName, String startTime, String endTime, int isDetail) {
        List<GatherYicheAPP> channelSumConsume;
        Map<String, Object> map = new HashMap<>();
        if ("5".equals(platformId)) {
            platformId = null;
        }
        if ("全部".equals(channelName)) {
            channelName = null;
        }
        map.put("platformId", platformId);
        map.put("channelName", channelName);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        if (isDetail == 0) {
            channelSumConsume = channelConsumeMapper.getChannelDetailConsume(map);
        }else {
            channelSumConsume = channelConsumeMapper.getChannelSumConsume(map);
        }
        return channelSumConsume;

    }
}
