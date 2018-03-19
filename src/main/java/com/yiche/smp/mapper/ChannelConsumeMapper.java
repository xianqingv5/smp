package com.yiche.smp.mapper;

import com.yiche.smp.common.GatherYicheAPP;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/8
 */
@Repository
public interface ChannelConsumeMapper {

    public List<GatherYicheAPP> getChannelSumConsume(Map<String, Object> map);

    public List<GatherYicheAPP> getChannelDetailConsume(Map<String, Object> map);
}
