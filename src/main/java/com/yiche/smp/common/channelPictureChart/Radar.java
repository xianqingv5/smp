package com.yiche.smp.common.channelPictureChart;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Radar {
    private List<Indicator> indicator;

    public Radar() {
    }

    public Radar(List<Indicator> indicator) {
        this.indicator = indicator;
    }

    public List<Indicator> getIndicator() {
        return indicator;
    }

    public void setIndicator(List<Indicator> indicator) {
        this.indicator = indicator;
    }

    @Override
    public String toString() {
        return "Radar{" +
                "indicator=" + indicator +
                '}';
    }
}
