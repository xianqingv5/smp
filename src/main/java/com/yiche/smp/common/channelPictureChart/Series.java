package com.yiche.smp.common.channelPictureChart;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Series implements Serializable{
    private static final long serialVersionUID = -8256148833775234558L;
    private String type;
    private List <PictureData> data;

    public Series() {
    }

    public Series(String type, List <PictureData> data) {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List <PictureData> getData() {
        return data;
    }

    public void setData(List <PictureData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Series{" +
                "type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
