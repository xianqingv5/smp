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
    /**
     * 用于求汇总的渠道财务报表
     * @param map
     * @return
     */
    List<GatherYicheAPP> getChannelSumConsume(Map<String, Object> map);

    /**
     * 用于求明细的渠道财务报表
     * @param map
     * @return
     */
    List<GatherYicheAPP> getChannelDetailConsume(Map<String, Object> map);
}
