package com.yiche.smp.domain;

public class SmpStategyClue {
    private Integer stategyClueId;

    private String channelName;

    private String month;

    private Double clueNum;

    public Integer getStategyClueId() {
        return stategyClueId;
    }

    public void setStategyClueId(Integer stategyClueId) {
        this.stategyClueId = stategyClueId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public Double getClueNum() {
        return clueNum;
    }

    public void setClueNum(Double clueNum) {
        this.clueNum = clueNum;
    }
}