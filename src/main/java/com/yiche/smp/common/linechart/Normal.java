package com.yiche.smp.common.linechart;

/**
 * Created by Lenovo on 2017/12/12.
 */
public class Normal {
    private String color;
    private int width;

    public Normal() {
    }

    public Normal(String color, int width) {
        this.color = color;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Normal{" +
                "color='" + color + '\'' +
                ", width=" + width +
                '}';
    }
}
