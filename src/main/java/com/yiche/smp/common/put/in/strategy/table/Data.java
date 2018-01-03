package com.yiche.smp.common.put.in.strategy.table;

import java.io.Serializable;
import java.util.List;

/**
 * 投放策略返回
 */
public class Data implements Serializable {

    private static final long serialVersionUID = 253922785030453220L;

    private List <THead> tHead;

    private List <TBody> tBody;

    public Data(List <THead> tHead, List <TBody> tBody) {
        this.tHead = tHead;
        this.tBody = tBody;
    }

    public Data() {
    }

    public List <THead> gettHead() {
        return tHead;
    }

    public void settHead(List <THead> tHead) {
        this.tHead = tHead;
    }

    public List <TBody> gettBody() {
        return tBody;
    }

    public void settBody(List <TBody> tBody) {
        this.tBody = tBody;
    }

    @Override
    public String toString() {
        return "Data{" +
                "tHead=" + tHead +
                ", tBody=" + tBody +
                '}';
    }
}
