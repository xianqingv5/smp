package com.yiche.smp.common.cluecost;

/**
 * 线索及成本数据分析【柱状图纵坐标数据】
 */
public class ClueBarCraphYaxisData {
    private String name;
    private int min;
    private int max;
    private int yAxisIndex;
    private double interval;

    public ClueBarCraphYaxisData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(int yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    public double getInterval() {
        return interval;
    }

    public void setInterval(double interval) {
        this.interval = interval;
    }
}
