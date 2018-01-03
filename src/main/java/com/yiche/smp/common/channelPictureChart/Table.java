package com.yiche.smp.common.channelPictureChart;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Table {
    private List<Children> tHead;
    private List<Object> tBody;

    public List<Children> gettHead() {
        return tHead;
    }

    public void settHead(List<Children> tHead) {
        this.tHead = tHead;
    }

    public List<Object> gettBody() {
        return tBody;
    }

    public void settBody(List<Object> tBody) {
        this.tBody = tBody;
    }

    public Table() {

    }

    public Table(List<Children> tHead, List<Object> tBody) {

        this.tHead = tHead;
        this.tBody = tBody;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tHead=" + tHead +
                ", tBody=" + tBody +
                '}';
    }
}
