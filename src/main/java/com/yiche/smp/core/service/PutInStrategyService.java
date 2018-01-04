package com.yiche.smp.core.service;

import com.yiche.smp.common.put.in.strategy.table.Data;
import com.yiche.smp.domain.SmpLaunchStategy;

public interface PutInStrategyService {

    Data getPutStrategyTable(SmpLaunchStategy smpLaunchStategy);

    com.yiche.smp.common.put.in.strategy.chart.Data getPutStrategyChart();
}
