package com.yiche.smp.common.put.in.strategy.table;

import java.io.Serializable;

public class TBody implements Serializable {
    private static final long serialVersionUID = -5655105612980290595L;

    private String advType;

    private String channelInfo;

    private String shopStrategy;

    private String carStrategy;

    public TBody(String advType, String channelInfo, String shopStrategy, String carStrategy) {
        this.advType = advType;
        this.channelInfo = channelInfo;
        this.shopStrategy = shopStrategy;
        this.carStrategy = carStrategy;
    }

    public TBody() {
    }

    public String getAdvType() {
        return advType;
    }

    public void setAdvType(String advType) {
        this.advType = advType;
    }

    public String getChannelInfo() {
        return channelInfo;
    }

    public void setChannelInfo(String channelInfo) {
        this.channelInfo = channelInfo;
    }

    public String getShopStrategy() {
        return shopStrategy;
    }

    public void setShopStrategy(String shopStrategy) {
        this.shopStrategy = shopStrategy;
    }

    public String getCarStrategy() {
        return carStrategy;
    }

    public void setCarStrategy(String carStrategy) {
        this.carStrategy = carStrategy;
    }

    @Override
    public String toString() {
        return "TBody{" +
                "advType='" + advType + '\'' +
                ", channelInfo='" + channelInfo + '\'' +
                ", shopStrategy='" + shopStrategy + '\'' +
                ", carStrategy='" + carStrategy + '\'' +
                '}';
    }
}
