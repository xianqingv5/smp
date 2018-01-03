package com.yiche.smp.common.barchart;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class Series implements Serializable{
    private static final long serialVersionUID = 1081748768706896551L;

    private List<String> data;

    private String name;

    private String type;

    private String stack;

    public Series(List <String> data, String name, String type, String stack) {
        this.data = data;
        this.name = name;
        this.type = type;
        this.stack = stack;
    }

    public Series() {
    }

    public List <String> getData() {
        return data;
    }

    public void setData(List <String> data) {
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

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "Series{" +
                "data=" + data +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", stack='" + stack + '\'' +
                '}';
    }
}
