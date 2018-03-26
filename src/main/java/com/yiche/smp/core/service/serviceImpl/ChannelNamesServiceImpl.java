package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.Channel;
import com.yiche.smp.core.service.ChannelNamesService;
import com.yiche.smp.mapper.ChannelNamesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/9
 */
@Service
public class ChannelNamesServiceImpl implements ChannelNamesService {

    @Autowired
    private ChannelNamesMapper channelNamesMapper;

    @Override
    public List<Channel> selectChannelNames(String platformName) {
        Map<String, String> map = new HashMap<>();
        //如果为全部的话，将platformName赋值为空
        if("全部".equals(platformName)){
            platformName=null;
        }
        map.put("platformName",platformName);
        List<Channel> channels = channelNamesMapper.selectChannelNames(map);
        return channels;
    }
}
