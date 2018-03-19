package com.yiche.smp.mapper;

import com.yiche.smp.common.Channel;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/9
 */

@Repository
public interface ChannelNamesMapper {

    public List<Channel> selectChannelNames(Map<String, String> map);
}
