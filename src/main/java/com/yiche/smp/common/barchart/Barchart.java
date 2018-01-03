package com.yiche.smp.common.barchart;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:柱状图
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class Barchart implements Serializable{
    private static final long serialVersionUID = -3773993511650109528L;

    private com.yiche.smp.common.barchart.Legend legend;

    private List<Series> series;

    private List<Data> xAxis;

    private YAxis yAxis;


    public Barchart(Legend legend, List <Series> series, List <Data> xAxis, YAxis yAxis) {
        this.legend = legend;
        this.series = series;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Barchart() {
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public List <Series> getSeries() {
        return series;
    }

    public void setSeries(List <Series> series) {
        this.series = series;
    }

    public List <Data> getxAxis() {
        return xAxis;
    }

    public void setxAxis(List <Data> xAxis) {
        this.xAxis = xAxis;
    }

    public YAxis getyAxis() {
        return yAxis;
    }

    public void setyAxis(YAxis yAxis) {
        this.yAxis = yAxis;
    }

    @Override
    public String toString() {
        return "Barchart{" +
                "legend=" + legend +
                ", series=" + series +
                ", xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                '}';
    }
}
