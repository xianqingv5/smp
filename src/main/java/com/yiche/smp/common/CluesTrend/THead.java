package com.yiche.smp.common.CluesTrend;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class THead implements Serializable{
    private static final long serialVersionUID = 6000749955395387381L;

    private String prop;

    private String label;

    private List<THead> children;

    private boolean fixed;

    public THead(String prop, String label, List <THead> children, boolean fixed) {
        this.prop = prop;
        this.label = label;
        this.children = children;
        this.fixed = fixed;
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

    public List <THead> getChildren() {
        return children;
    }

    public void setChildren(List <THead> children) {
        this.children = children;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    @Override
    public String toString() {
        return "THead{" +
                "prop='" + prop + '\'' +
                ", label='" + label + '\'' +
                ", children=" + children +
                ", fixed=" + fixed +
                '}';
    }
}
