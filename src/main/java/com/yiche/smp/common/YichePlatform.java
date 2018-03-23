package com.yiche.smp.common;

import com.yiche.smp.common.util.DataCalculationUtils;

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

    private String terminalId;

    private String weekDetail;//周期描述

    private Integer cooperationDay;//合作天数

    private String week;//周

    private String month;//月

    private String platformId;

    private Double leadsUserCost;//用户成本

    private String channelNamePath;//渠道路径

    private String channelId;

    public YichePlatform() {
    }

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
        if (actualConsume==null){
            actualConsume=0.0f;
        }
        return DataCalculationUtils.floatDeal(actualConsume);
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
        if (leadsCost == null) {
            leadsCost=0.0;
        }
        return DataCalculationUtils.doubleDeal2(leadsCost);
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
        if (newUserCost==null){
            newUserCost=0.0;
        }
        return DataCalculationUtils.doubleDeal2(newUserCost);
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

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getWeekDetail() {
        return weekDetail;
    }

    public void setWeekDetail(String weekDetail) {
        this.weekDetail = weekDetail;
    }

    public Integer getCooperationDay() {
        return cooperationDay;
    }

    public void setCooperationDay(Integer cooperationDay) {
        this.cooperationDay = cooperationDay;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public Double getLeadsUserCost() {
        if (leadsUserCost==null){
            leadsUserCost=0.0;
        }
        return DataCalculationUtils.doubleDeal2(leadsUserCost);
    }

    public void setLeadsUserCost(Double leadsUserCost) {
        this.leadsUserCost = leadsUserCost;
    }

    public String getChannelNamePath() {
        return channelNamePath;
    }

    public void setChannelNamePath(String channelNamePath) {
        this.channelNamePath = channelNamePath;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public YichePlatform(String platformName, String channelName, Long leadsCnt, Long leadsUserCnt, Float actualConsume, String bt, Double leadsCost, Long newUserCnt, Double newUserCost, String clueRatio, String userRatio, String leadsCostRatio, String newUserCntRatio, String consumeRatio, String systemId, String terminalId, String weekDetail, Integer cooperationDay) {
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
        this.terminalId = terminalId;
        this.weekDetail = weekDetail;
        this.cooperationDay = cooperationDay;
    }

    @Override
    public String toString() {
        return "YichePlatform{" +
                "platformName='" + platformName + '\'' +
                ", channelName='" + channelName + '\'' +
                ", leadsCnt=" + leadsCnt +
                ", leadsUserCnt=" + leadsUserCnt +
                ", actualConsume=" + actualConsume +
                ", bt='" + bt + '\'' +
                ", leadsCost=" + leadsCost +
                ", newUserCnt=" + newUserCnt +
                ", newUserCost=" + newUserCost +
                ", clueRatio='" + clueRatio + '\'' +
                ", userRatio='" + userRatio + '\'' +
                ", leadsCostRatio='" + leadsCostRatio + '\'' +
                ", newUserCntRatio='" + newUserCntRatio + '\'' +
                ", consumeRatio='" + consumeRatio + '\'' +
                ", systemId='" + systemId + '\'' +
                ", terminalId='" + terminalId + '\'' +
                ", weekDetail='" + weekDetail + '\'' +
                ", cooperationDay=" + cooperationDay +
                ", week='" + week + '\'' +
                ", month='" + month + '\'' +
                ", platformId='" + platformId + '\'' +
                ", leadsUserCost=" + leadsUserCost +
                ", channelNamePath='" + channelNamePath + '\'' +
                ", channelId='" + channelId + '\'' +
                '}';
    }
}
