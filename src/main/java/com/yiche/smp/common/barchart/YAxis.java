package com.yiche.smp.common.barchart;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class YAxis implements Serializable{
    private static final long serialVersionUID = -8321679435963201204L;

    private String name ;

    public YAxis(String name) {
        this.name = name;
    }

    public YAxis() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "YAxis{" +
                "name='" + name + '\'' +
                '}';
    }
}
