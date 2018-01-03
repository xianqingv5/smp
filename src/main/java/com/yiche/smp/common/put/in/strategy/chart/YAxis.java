package com.yiche.smp.common.put.in.strategy.chart;

import java.io.Serializable;

/**
 *
 */
public class YAxis implements Serializable {
    private static final long serialVersionUID = -7512924388829676022L;

    private String type;

    private String name;

    public YAxis(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public YAxis() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "YAxis{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
