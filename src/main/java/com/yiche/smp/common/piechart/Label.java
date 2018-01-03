package com.yiche.smp.common.piechart;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class Label implements Serializable {
    private static final long serialVersionUID = -9012910104769332061L;

    private Normal normal;

    public Label(Normal normal) {
        this.normal = normal;
    }

    public Label() {
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        return "Label{" +
                "normal=" + normal +
                '}';
    }
}
