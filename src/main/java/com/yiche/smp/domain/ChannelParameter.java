package com.yiche.smp.domain;

import java.io.Serializable;

/**
 * Created by Lenovo on 2017/12/11.
 */
public class ChannelParameter implements Serializable{
    private static final long serialVersionUID = -9222706064653654514L;
    private String platName;
    private String monthData;
    private String brandName;

    public ChannelParameter() {
    }

    public ChannelParameter(String platName, String monthData, String brandName) {
        this.platName = platName;
        this.monthData = monthData;
        this.brandName = brandName;
    }

    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
    }

    public String getMonthData() {
        return monthData;
    }

    public void setMonthData(String monthData) {
        this.monthData = monthData;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "ChannelParameter{" +
                "platName='" + platName + '\'' +
                ", monthData='" + monthData + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
