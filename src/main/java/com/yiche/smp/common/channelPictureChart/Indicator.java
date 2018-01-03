package com.yiche.smp.common.channelPictureChart;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Indicator {
    private String name;
    private int max;

    public Indicator() {
    }

    public Indicator(String name, int max) {
        this.name = name;
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Indicator{" +
                "name='" + name + '\'' +
                ", max=" + max +
                '}';
    }
}
