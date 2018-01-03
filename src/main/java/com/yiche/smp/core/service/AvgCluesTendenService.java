package com.yiche.smp.core.service;

import com.yiche.smp.common.CluesTrend.ClueTrend;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public interface AvgCluesTendenService {

    ClueTrend getClueTrendData(String month);
}
