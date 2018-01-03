package com.yiche.smp.common.barchart;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class Legend implements Serializable{
    private static final long serialVersionUID = 119662006027963343L;

    private List<String> data;

    public Legend(List <String> data) {
        this.data = data;
    }

    public Legend() {
    }

    public List <String> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Legend{" +
                "data=" + data +
                '}';
    }

    public void setData(List <String> data) {
        this.data = data;
    }
}
