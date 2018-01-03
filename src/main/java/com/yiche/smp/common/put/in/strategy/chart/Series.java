package com.yiche.smp.common.put.in.strategy.chart;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class Series implements Serializable {
    private static final long serialVersionUID = -9089682281764101600L;

    private String name;

    private String type;

    private String stack;

    private Boolean showSymbol;

    private List <String> data;

    public Series(String name, String type, String stack, Boolean showSymbol, List <String> data) {
        this.name = name;
        this.type = type;
        this.stack = stack;
        this.showSymbol = showSymbol;
        this.data = data;
    }

    public Series() {
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

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Boolean getShowSymbol() {
        return showSymbol;
    }

    public void setShowSymbol(Boolean showSymbol) {
        this.showSymbol = showSymbol;
    }

    public List <String> getData() {
        return data;
    }

    public void setData(List <String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", stack='" + stack + '\'' +
                ", showSymbol=" + showSymbol +
                ", data=" + data +
                '}';
    }
}
