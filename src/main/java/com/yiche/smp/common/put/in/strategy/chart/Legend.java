package com.yiche.smp.common.put.in.strategy.chart;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class Legend implements Serializable {
    private static final long serialVersionUID = -6109720396513774379L;

    private List <String> data;

    public Legend(List <String> data) {
        this.data = data;
    }

    public Legend() {
    }

    public List <String> getData() {
        return data;
    }

    public void setData(List <String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Legend{" +
                "data=" + data +
                '}';
    }
}
