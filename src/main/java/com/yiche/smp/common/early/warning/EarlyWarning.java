package com.yiche.smp.common.early.warning;

import com.yiche.smp.common.CluesTrend.THead;
import com.yiche.smp.common.copy.CopyShopAvgClus;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/25
 */
public class EarlyWarning implements Serializable {
    private static final long serialVersionUID = -7192559374798697525L;

    private List <THead> tHead;

    private List <EarlyWarningList> tBody;

    public EarlyWarning(List <THead> tHead, List <EarlyWarningList> tBody) {
        this.tHead = tHead;
        this.tBody = tBody;
    }

    public EarlyWarning() {
    }

    public List <THead> gettHead() {
        return tHead;
    }

    public void settHead(List <THead> tHead) {
        this.tHead = tHead;
    }

    public List <EarlyWarningList> gettBody() {
        return tBody;
    }

    public void settBody(List <EarlyWarningList> tBody) {
        this.tBody = tBody;
    }

    @Override
    public String toString() {
        return "EarlyWarning{" +
                "tHead=" + tHead +
                ", tBody=" + tBody +
                '}';
    }
}
