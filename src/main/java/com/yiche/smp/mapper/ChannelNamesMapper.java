package com.yiche.smp.mapper;

import com.yiche.smp.common.Channel;
import com.yiche.smp.common.Platform1;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/9
 */

@Repository
public interface ChannelNamesMapper {
    /**
     * 获取对应平台下的所有渠道
     * @param map
     * @return
     */
    List<Channel> selectChannelNames(Map<String, String> map);

    /**
     * 获取部门下的所有平台名称
     * @return
     */
    List<Platform1> selectPlatformNames();
}
