package com.yiche.smp.common.put.in.strategy.chart;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class XAxis implements Serializable {
    private static final long serialVersionUID = -6014854589855616667L;

    private String type;

    private Boolean boundaryGap;

    private List <String> data;

    public XAxis(String type, Boolean boundaryGap, List <String> data) {
        this.type = type;
        this.boundaryGap = boundaryGap;
        this.data = data;
    }

    public XAxis() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getBoundaryGap() {
        return boundaryGap;
    }

    public void setBoundaryGap(Boolean boundaryGap) {
        this.boundaryGap = boundaryGap;
    }

    public List <String> getData() {
        return data;
    }

    public void setData(List <String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "XAxis{" +
                "type='" + type + '\'' +
                ", boundaryGap=" + boundaryGap +
                ", data=" + data +
                '}';
    }
}
