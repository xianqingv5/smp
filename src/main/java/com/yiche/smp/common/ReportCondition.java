package com.yiche.smp.common;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/7
 */
public class ReportCondition implements Serializable {
    private String platformId;
    private String platformName;
    private String channelName;
    private String startTime;
    private String endTime;
    private int isDetail;//0是,1不是

    public ReportCondition(String platformName, String channelName, String startTime, String endTime, int isDetail) {
        this.platformName = platformName;
        this.channelName = channelName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isDetail = isDetail;
    }

    public ReportCondition() {
    }

    public ReportCondition(String channelName, String startTime, String endTime) {
        this.channelName = channelName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public ReportCondition(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getIsDetail() {
        return isDetail;
    }

    public void setIsDetail(int isDetail) {
        this.isDetail = isDetail;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    @Override
    public String toString() {
        return "ReportCondition{" +
                "platformName='" + platformName + '\'' +
                ", channelName='" + channelName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", isDetail=" + isDetail +
                '}';
    }
}
