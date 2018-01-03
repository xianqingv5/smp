package com.yiche.smp.common.channelPictureChart;

import java.util.Arrays;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class PictureData {
    private  String name;
    private double[] value;

    public PictureData() {
    }

    public PictureData(String name, double[] value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getValue() {
        return value;
    }

    public void setValue(double[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PictureData{" +
                "name='" + name + '\'' +
                ", value=" + Arrays.toString(value) +
                '}';
    }
}
