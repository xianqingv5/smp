package com.yiche.smp.common.channelPictureChart;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/11.
 */
public class Table2 {
    private List<Head> tHead;
    private List<Body> tBody;

    public Table2() {
    }

    public Table2(List<Head> tHead, List<Body> tBody) {
        this.tHead = tHead;
        this.tBody = tBody;
    }

    public List<Head> gettHead() {
        return tHead;
    }

    public void settHead(List<Head> tHead) {
        this.tHead = tHead;
    }

    public List<Body> gettBody() {
        return tBody;
    }

    public void settBody(List<Body> tBody) {
        this.tBody = tBody;
    }

    @Override
    public String toString() {
        return "Table2{" +
                "tHead=" + tHead +
                ", tBody=" + tBody +
                '}';
    }
}
