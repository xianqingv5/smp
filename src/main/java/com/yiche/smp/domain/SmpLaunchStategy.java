package com.yiche.smp.domain;

public class SmpLaunchStategy {
    private Integer launchStategyId;

    private String advertType;

    private String channelTrait;

    private String commerceFestival;

    private String carShowStategy;

    private String month;
    private String quarterData;
    private String yearData;

    public String getQuarterData() {
        return quarterData;
    }

    public void setQuarterData(String quarterData) {
        this.quarterData = quarterData;
    }

    public String getYearData() {
        return yearData;
    }

    public void setYearData(String yearData) {
        this.yearData = yearData;
    }

    public Integer getLaunchStategyId() {
        return launchStategyId;
    }

    public void setLaunchStategyId(Integer launchStategyId) {
        this.launchStategyId = launchStategyId;
    }

    public String getAdvertType() {
        return advertType;
    }

    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public String getChannelTrait() {
        return channelTrait;
    }

    public void setChannelTrait(String channelTrait) {
        this.channelTrait = channelTrait == null ? null : channelTrait.trim();
    }

    public String getCommerceFestival() {
        return commerceFestival;
    }

    public void setCommerceFestival(String commerceFestival) {
        this.commerceFestival = commerceFestival == null ? null : commerceFestival.trim();
    }

    public String getCarShowStategy() {
        return carShowStategy;
    }

    public void setCarShowStategy(String carShowStategy) {
        this.carShowStategy = carShowStategy == null ? null : carShowStategy.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }
}