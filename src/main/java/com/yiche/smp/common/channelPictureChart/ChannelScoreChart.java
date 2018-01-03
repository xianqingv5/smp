package com.yiche.smp.common.channelPictureChart;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class ChannelScoreChart {
    private Title title;
    private Legend legend;
    private Radar radar;
    private List<Series> series;

    public ChannelScoreChart() {
    }

    public ChannelScoreChart(Title title, Legend legend, Radar radar, List<Series> series) {
        this.title = title;
        this.legend = legend;
        this.radar = radar;
        this.series = series;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    public List<Series> getSeries() {
        return series;
    }

    public void setSeries(List<Series> series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "ChannelScoreChart{" +
                "title=" + title +
                ", legend=" + legend +
                ", radar=" + radar +
                ", series=" + series +
                '}';
    }
}
