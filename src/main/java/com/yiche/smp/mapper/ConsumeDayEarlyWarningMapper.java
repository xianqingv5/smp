package com.yiche.smp.mapper;

import com.yiche.smp.common.EarlyWarningData;
import com.yiche.smp.common.GatherYicheAPP;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/15
 */
@Repository
public interface ConsumeDayEarlyWarningMapper {

    List<EarlyWarningData> selectEarlyWarning(Map<String, String> map);

    List<EarlyWarningData> selectMonthChannelConsumeData(Map<String, String> map);

    List<GatherYicheAPP> getChannelDetailConsume(Map<String, String> map);
}
