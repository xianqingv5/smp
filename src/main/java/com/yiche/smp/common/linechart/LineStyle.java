package com.yiche.smp.common.linechart;

/**
 * Created by Lenovo on 2017/12/12.
 */
public class LineStyle {
    private Normal normal;

    public LineStyle(Normal normal) {
        this.normal = normal;
    }

    public LineStyle() {
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        return "LineStyle{" +
                "normal=" + normal +
                '}';
    }
}
