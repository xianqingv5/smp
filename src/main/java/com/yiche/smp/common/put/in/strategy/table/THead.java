package com.yiche.smp.common.put.in.strategy.table;

import java.io.Serializable;

/**
 *
 */
public class THead implements Serializable {
    private static final long serialVersionUID = 598711345945419553L;

    private String prop;

    private String label;

    public THead(String prop, String label) {
        this.prop = prop;
        this.label = label;
    }

    public THead() {
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
        return "THead{" +
                "prop='" + prop + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
