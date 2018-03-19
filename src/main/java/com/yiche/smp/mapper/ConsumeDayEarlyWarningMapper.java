package com.yiche.smp.mapper;

import com.yiche.smp.common.EarlyWarningData;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/15
 */
@Repository
public interface ConsumeDayEarlyWarningMapper {

    public List<EarlyWarningData> selectEarlyWarning(Map<String, String> map);

    public EarlyWarningData selectMonthChannelConsumeData(Map<String, String> map);
}
