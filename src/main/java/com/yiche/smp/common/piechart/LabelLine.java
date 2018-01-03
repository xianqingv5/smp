package com.yiche.smp.common.piechart;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class LabelLine implements Serializable{
    private static final long serialVersionUID = -5699557539900232486L;

    private Normal normal;

    public LabelLine(Normal normal) {
        this.normal = normal;
    }

    public LabelLine() {
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        return "LabelLine{" +
                "normal=" + normal +
                '}';
    }
}
