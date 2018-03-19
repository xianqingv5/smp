package com.yiche.smp.common;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/8
 */

public class GatherYicheAPP implements Serializable {

    private String platformName;

    private String channelName;

    private Long leadsCnt;

    private Long leadsUserCnt;

    private Float actualConsume;

    private String bt;

    private Double leadsCost;

    private Long newUserCnt;

    private Double newUserCost;

    private String application;

    public GatherYicheAPP(String platformName, String channelName, Long leadsCnt, Long leadsUserCnt, Float actualConsume, String bt) {
        this.platformName = platformName;
        this.channelName = channelName;
        this.leadsCnt = leadsCnt;
        this.leadsUserCnt = leadsUserCnt;
        this.actualConsume = actualConsume;
        this.bt = bt;
    }

    public GatherYicheAPP() {
    }

    public GatherYicheAPP(String channelName, Long leadsCnt, Long leadsUserCnt, Float actualConsume) {
        this.channelName = channelName;
        this.leadsCnt = leadsCnt;
        this.leadsUserCnt = leadsUserCnt;
        this.actualConsume = actualConsume;
    }

    public GatherYicheAPP(String platformName, String channelName, Long leadsCnt, Long leadsUserCnt, Float actualConsume) {
        this.platformName = platformName;
        this.channelName = channelName;
        this.leadsCnt = leadsCnt;
        this.leadsUserCnt = leadsUserCnt;
        this.actualConsume = actualConsume;
    }

    public GatherYicheAPP(String platformName, String channelName, Long leadsCnt, Long leadsUserCnt, Float accountConsume, String bt, Double leadsCost) {
        this.platformName = platformName;
        this.channelName = channelName;
        this.leadsCnt = leadsCnt;
        this.leadsUserCnt = leadsUserCnt;
        this.actualConsume = actualConsume;
        this.bt = bt;
        this.leadsCost = leadsCost;
    }

    public GatherYicheAPP(String platformName, String channelName, Long leadsCnt, Long leadsUserCnt, Float actualConsume, String bt, Double leadsCost, Long newUserCnt, Double newUserCost, String application) {
        this.platformName = platformName;
        this.channelName = channelName;
        this.leadsCnt = leadsCnt;
        this.leadsUserCnt = leadsUserCnt;
        this.actualConsume = actualConsume;
        this.bt = bt;
        this.leadsCost = leadsCost;
        this.newUserCnt = newUserCnt;
        this.newUserCost = newUserCost;
        this.application = application;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Long getLeadsCnt() {
        return leadsCnt;
    }

    public void setLeadsCnt(Long leadsCnt) {
        this.leadsCnt = leadsCnt;
    }

    public Long getLeadsUserCnt() {
        return leadsUserCnt;
    }

    public void setLeadsUserCnt(Long leadsUserCnt) {
        this.leadsUserCnt = leadsUserCnt;
    }

    public Float getActualConsume() {
        return actualConsume;
    }

    public void setActualConsume(Float actualConsume) {
        this.actualConsume = actualConsume;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Double getLeadsCost() {
        return leadsCost;
    }

    public void setLeadsCost(Double leadsCost) {
        this.leadsCost = leadsCost;
    }
    public Long getNewUserCnt() {
        return newUserCnt;
    }

    public void setNewUserCnt(Long newUserCnt) {
        this.newUserCnt = newUserCnt;
    }

    public Double getNewUserCost() {
        return newUserCost;
    }

    public void setNewUserCost(Double newUserCost) {
        this.newUserCost = newUserCost;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "GatherYicheAPP{" +
                "channelName='" + channelName + '\'' +
                ", leadsCnt=" + leadsCnt +
                ", leadsUserCnt=" + leadsUserCnt +
                ", actualConsume=" + actualConsume +
                '}';
    }

}
