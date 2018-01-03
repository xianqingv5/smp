package com.yiche.smp.common.piechart;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class PieData implements Serializable {

    private static final long serialVersionUID = -9080195441397091313L;

    private String name;

    private String value;

    public PieData(String value, String name) {
        this.name = name;
        this.value = value;
    }

    public PieData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PieData{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
