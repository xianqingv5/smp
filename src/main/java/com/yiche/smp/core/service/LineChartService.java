package com.yiche.smp.core.service;

import com.yiche.smp.common.linechart.BrandName;
import com.yiche.smp.common.linechart.LineChart;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/12.
 */
public interface LineChartService {
    List <LineChart> getLineCharts(String brandName, String monthData);

    List <BrandName> getBrands(String monthData);
}
