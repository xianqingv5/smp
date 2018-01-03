package com.yiche.smp.common.channelPictureChart;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Children {
    private String prop;
    private String label;
    private List<Children> children;

    public Children(String prop, String label, List<Children> children) {
        this.prop = prop;
        this.label = label;
        this.children = children;
    }

    public Children() {
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

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Children{" +
                "prop='" + prop + '\'' +
                ", label='" + label + '\'' +
                ", children=" + children +
                '}';
    }
}
