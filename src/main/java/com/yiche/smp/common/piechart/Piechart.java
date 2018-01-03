package com.yiche.smp.common.piechart;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:饼状图
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class Piechart implements Serializable{
    private static final long serialVersionUID = -5260881203092412667L;

    private Legend legend;

    private List<Series> series;

    public Piechart(Legend legend, List <Series> series) {
        this.legend = legend;
        this.series = series;
    }

    public Piechart() {
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

    @Override
    public String toString() {
        return "Piechart{" +
                "legend=" + legend +
                ", series=" + series +
                '}';
    }
}
