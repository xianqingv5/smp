package com.yiche.smp.domain;

public class KeyTargetCompare {
    private Integer keyIndexId;

    private String keyType;

    private String detailName;

    private Double monthCompare;

    private String channelName;

    private Double channelCompare;

    private Integer platform;

    private String month;

    public Integer getKeyIndexId() {
        return keyIndexId;
    }

    public void setKeyIndexId(Integer keyIndexId) {
        this.keyIndexId = keyIndexId;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType == null ? null : keyType.trim();
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName == null ? null : detailName.trim();
    }

    public Double getMonthCompare() {
        return monthCompare;
    }

    public void setMonthCompare(Double monthCompare) {
        this.monthCompare = monthCompare;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Double getChannelCompare() {
        return channelCompare;
    }

    public void setChannelCompare(Double channelCompare) {
        this.channelCompare = channelCompare;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }
}