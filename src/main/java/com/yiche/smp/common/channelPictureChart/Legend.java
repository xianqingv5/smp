package com.yiche.smp.common.channelPictureChart;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Legend {
    private List<String> data;

    public Legend(List<String> data) {
        this.data = data;
    }

    public Legend() {
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Legend{" +
                "data=" + data +
                '}';
    }
}
