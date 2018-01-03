package com.yiche.smp.common.linechart;

import java.util.Arrays;

/**
 * Created by Lenovo on 2017/12/12.
 */
public class TrendData {
    private Object[] data;
    private String name;
    private String type;
    private LineStyle lineStyle;
    public TrendData() {
    }

    public TrendData(Object[] data, String name, String type, LineStyle lineStyle) {
        this.data = data;
        this.name = name;
        this.type = type;
        this.lineStyle = lineStyle;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    @Override
    public String toString() {
        return "TrendData{" +
                "data=" + Arrays.toString(data) +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", lineStyle=" + lineStyle +
                '}';
    }
}
