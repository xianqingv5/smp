package com.yiche.smp.core.service;

import com.yiche.smp.common.put.in.strategy.table.Data;

public interface PutInStrategyService {

    Data getPutStrategyTable();

    com.yiche.smp.common.put.in.strategy.chart.Data getPutStrategyChart();
}
