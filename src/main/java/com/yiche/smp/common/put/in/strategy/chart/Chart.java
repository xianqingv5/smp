package com.yiche.smp.common.put.in.strategy.chart;


import java.io.Serializable;
import java.util.List;

/**
 * 折线图
 */
public class Chart implements Serializable {
    private static final long serialVersionUID = -9174889066568363727L;

    private Tooltip tooltip;

    private Legend legend;

    private XAxis xAxis;

    private YAxis yAxis;

    private List <Series> series;

    public Chart(Tooltip tooltip, Legend legend, XAxis xAxis, YAxis yAxis, List <Series> series) {
        this.tooltip = tooltip;
        this.legend = legend;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.series = series;
    }

    public Chart() {
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public XAxis getxAxis() {
        return xAxis;
    }

    public void setxAxis(XAxis xAxis) {
        this.xAxis = xAxis;
    }

    public YAxis getyAxis() {
        return yAxis;
    }

    public void setyAxis(YAxis yAxis) {
        this.yAxis = yAxis;
    }

    public List <Series> getSeries() {
        return series;
    }

    public void setSeries(List <Series> series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "tooltip=" + tooltip +
                ", legend=" + legend +
                ", xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                ", series=" + series +
                '}';
    }
}
