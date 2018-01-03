package com.yiche.smp.common.linechart;

/**
 * Created by Lenovo on 2017/12/12.
 */
public class YAxisType {
    private String name;
    private String type;

    public YAxisType() {
    }

    public YAxisType(String name, String type) {
        this.name = name;
        this.type = type;
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

    @Override
    public String toString() {
        return "YAxisType{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
