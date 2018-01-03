package com.yiche.smp.core.service;

import com.yiche.smp.common.channelPictureChart.Table2;
import com.yiche.smp.common.channelPictureChart.TotalData;

/**
 * Created by Lenovo on 2017/12/8.
 */
public interface ChannelQualityService {
    TotalData getTotalData(String platName, String monthData);

    Table2 getTotalScoreRank(String platName, String monthData);
}
