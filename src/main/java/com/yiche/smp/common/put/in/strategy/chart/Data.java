package com.yiche.smp.common.put.in.strategy.chart;

import java.io.Serializable;

/**
 * 投放策略折线图返回实体
 */
public class Data implements Serializable {
    private static final long serialVersionUID = 4247532440584449904L;

    private Chart clueChart;

    private Chart costChart;

    public Data(Chart clueChart, Chart costChart) {
        this.clueChart = clueChart;
        this.costChart = costChart;
    }

    public Data() {
    }

    public Chart getClueChart() {
        return clueChart;
    }

    public void setClueChart(Chart clueChart) {
        this.clueChart = clueChart;
    }

    public Chart getCostChart() {
        return costChart;
    }

    public void setCostChart(Chart costChart) {
        this.costChart = costChart;
    }

    @Override
    public String toString() {
        return "Data{" +
                "clueChart=" + clueChart +
                ", costChart=" + costChart +
                '}';
    }
}
