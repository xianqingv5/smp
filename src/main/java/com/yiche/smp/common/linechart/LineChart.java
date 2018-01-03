package com.yiche.smp.common.linechart;

/**
 * Created by Lenovo on 2017/12/12.
 */
public class LineChart {
    private Trend title;
    private TrendData series;
    private XAxisData xAxis;
    private YAxisType yAxis;

    public LineChart() {
    }

    public LineChart(Trend title, TrendData series, XAxisData xAxis, YAxisType yAxis) {
        this.title = title;
        this.series = series;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Trend getTitle() {
        return title;
    }

    public void setTitle(Trend title) {
        this.title = title;
    }

    public TrendData getSeries() {
        return series;
    }

    public void setSeries(TrendData series) {
        this.series = series;
    }

    public XAxisData getxAxis() {
        return xAxis;
    }

    public void setxAxis(XAxisData xAxis) {
        this.xAxis = xAxis;
    }

    public YAxisType getyAxis() {
        return yAxis;
    }

    public void setyAxis(YAxisType yAxis) {
        this.yAxis = yAxis;
    }

    @Override
    public String toString() {
        return "LineChart{" +
                "title=" + title +
                ", series=" + series +
                ", xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                '}';
    }
}
