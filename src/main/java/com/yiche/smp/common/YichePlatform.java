package com.yiche.smp.common;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/12
 */
public class YichePlatform implements Serializable {

    private String platformName;

    private String channelName;

    private Long leadsCnt;

    private Long leadsUserCnt;

    private Float actualConsume;

    private String bt;

    private Double leadsCost;

    private Long newUserCnt;

    private Double newUserCost;

    private String clueRatio;

    private String userRatio;

    private String leadsCostRatio;

    private String newUserCntRatio;

    private String consumeRatio;

    private String systemId;

    private String terminal;

    public YichePlatform(String platformName, String channelName, Long leadsCnt, Long leadsUserCnt, Float actualConsume, String bt, Double leadsCost, Long newUserCnt, Double newUserCost, String clueRatio, String userRatio, String leadsCostRatio, String newUserCntRatio, String consumeRatio) {
        this.platformName = platformName;
        this.channelName = channelName;
        this.leadsCnt = leadsCnt;
        this.leadsUserCnt = leadsUserCnt;
        this.actualConsume = actualConsume;
        this.bt = bt;
        this.leadsCost = leadsCost;
        this.newUserCnt = newUserCnt;
        this.newUserCost = newUserCost;
        this.clueRatio = clueRatio;
        this.userRatio = userRatio;
        this.leadsCostRatio = leadsCostRatio;
        this.newUserCntRatio = newUserCntRatio;
        this.consumeRatio = consumeRatio;
    }

    public YichePlatform(String platformName, String channelName, Long leadsCnt, Long leadsUserCnt, Float accountConsume, String bt, Double leadsCost, Long newUserCnt, Double newUserCost) {
        this.platformName = platformName;
        this.channelName = channelName;
        this.leadsCnt = leadsCnt;
        this.leadsUserCnt = leadsUserCnt;
        this.actualConsume = accountConsume;
        this.bt = bt;
        this.leadsCost = leadsCost;
        this.newUserCnt = newUserCnt;
        this.newUserCost = newUserCost;
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

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
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

    public String getClueRatio() {
        return clueRatio;
    }

    public void setClueRatio(String clueRatio) {
        this.clueRatio = clueRatio;
    }

    public String getUserRatio() {
        return userRatio;
    }

    public void setUserRatio(String userRatio) {
        this.userRatio = userRatio;
    }

    public String getLeadsCostRatio() {
        return leadsCostRatio;
    }

    public void setLeadsCostRatio(String leadsCostRatio) {
        this.leadsCostRatio = leadsCostRatio;
    }

    public String getNewUserCntRatio() {
        return newUserCntRatio;
    }

    public void setNewUserCntRatio(String newUserCntRatio) {
        this.newUserCntRatio = newUserCntRatio;
    }

    public String getConsumeRatio() {
        return consumeRatio;
    }

    public void setConsumeRatio(String consumeRatio) {
        this.consumeRatio = consumeRatio;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public YichePlatform() {
    }

    public YichePlatform(String platformName, String channelName, Long leadsCnt, Long leadsUserCnt, Float actualConsume, String bt, Double leadsCost, Long newUserCnt, Double newUserCost, String clueRatio, String userRatio, String leadsCostRatio, String newUserCntRatio, String consumeRatio, String systemId, String terminal) {
        this.platformName = platformName;
        this.channelName = channelName;
        this.leadsCnt = leadsCnt;
        this.leadsUserCnt = leadsUserCnt;
        this.actualConsume = actualConsume;
        this.bt = bt;
        this.leadsCost = leadsCost;
        this.newUserCnt = newUserCnt;
        this.newUserCost = newUserCost;
        this.clueRatio = clueRatio;
        this.userRatio = userRatio;
        this.leadsCostRatio = leadsCostRatio;
        this.newUserCntRatio = newUserCntRatio;
        this.consumeRatio = consumeRatio;
        this.systemId = systemId;
        this.terminal = terminal;
    }
}
