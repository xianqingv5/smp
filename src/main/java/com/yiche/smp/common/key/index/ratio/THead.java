package com.yiche.smp.common.key.index.ratio;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/11
 */
public class THead implements Serializable{
    private static final long serialVersionUID = 6738677100738210334L;

    private String  label;

    private String  prop;

    public THead(String label, String prop) {
        this.label = label;
        this.prop = prop;
    }

    public THead() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "THead{" +
                "label='" + label + '\'' +
                ", prop='" + prop + '\'' +
                '}';
    }
}
