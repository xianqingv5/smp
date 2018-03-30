package com.yiche.smp.core.service;

import com.yiche.smp.common.Channel;

import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/9
 */
public interface ChannelNamesService {

    public List<Channel> selectChannelNames(String platformId);
}
