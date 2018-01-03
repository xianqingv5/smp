package com.yiche.smp.common.linechart;

import java.util.Arrays;

/**
 * Created by Lenovo on 2017/12/12.
 */
public class XAxisData {
    private String[] data;

    public XAxisData() {
    }

    public XAxisData(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "XAxisData{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
