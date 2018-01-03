package com.yiche.smp.common.CluesTrend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yiche.smp.common.copy.CopyShopAvgClus;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClueTrend implements Serializable {
    private static final long serialVersionUID = -2326286765304738059L;

    private List <THead> tHead;

    private List <CopyShopAvgClus> tBody;

    public ClueTrend(List <THead> tHead, List <CopyShopAvgClus> tBody) {
        this.tHead = tHead;
        this.tBody = tBody;
    }

    public ClueTrend() {
    }

    public List <THead> gettHead() {
        return tHead;
    }

    public void settHead(List <THead> tHead) {
        this.tHead = tHead;
    }

    public List <CopyShopAvgClus> gettBody() {
        return tBody;
    }

    public void settBody(List <CopyShopAvgClus> tBody) {
        this.tBody = tBody;
    }

    @Override
    public String toString() {
        return "ClueTrend{" +
                "tHead=" + tHead +
                ", tBody=" + tBody +
                '}';
    }
}
