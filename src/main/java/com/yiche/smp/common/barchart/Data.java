package com.yiche.smp.common.barchart;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/13
 */
public class Data implements Serializable {
    private static final long serialVersionUID = 5906521086956141451L;

    private List <String> data;

    public Data(List <String> data) {
        this.data = data;
    }

    public Data() {
    }

    public List <String> getData() {
        return data;
    }

    public void setData(List <String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}
