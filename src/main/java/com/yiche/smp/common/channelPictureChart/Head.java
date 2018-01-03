package com.yiche.smp.common.channelPictureChart;

/**
 * Created by Lenovo on 2017/12/11.
 */
public class Head {
    private String prop;
    private String label;

    public Head() {
    }

    public Head(String prop, String label) {
        this.prop = prop;
        this.label = label;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Head{" +
                "prop='" + prop + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
