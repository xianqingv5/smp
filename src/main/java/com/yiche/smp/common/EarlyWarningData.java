package com.yiche.smp.common;

import com.yiche.smp.common.util.DataCalculationUtils;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/15
 */
public class EarlyWarningData implements Serializable {

    private String platformName;
    private Float dayBudget; //预算
    private Float actualConsume; //实际消耗
    private Long leadsCnt;
    private Double actualPrice; //实际单价
    private Double expectPrice; //预期线索量单价
    private String EarlyWarningMsg; //预警信息
    private String bt;
    private Double baseNumber; //基数
    private Long  monthDayAvgclueCnt;//去年当月日均线索量
    private String qfActualConsume;
    private String qfLeadsCnt;
    private String qfDayBudget;

    public EarlyWarningData() {
    }

    public EarlyWarningData(String platformName, Float dayBudget, Float actualConsume, Long leadsCnt, Double actualPrice, Double expectPrice, String earlyWarningMsg, String bt, Double baseNumber, Long monthDayAvgclueCnt) {
        this.platformName = platformName;
        this.dayBudget = dayBudget;
        this.actualConsume = actualConsume;
        this.leadsCnt = leadsCnt;
        this.actualPrice = actualPrice;
        this.expectPrice = expectPrice;
        EarlyWarningMsg = earlyWarningMsg;
        this.bt = bt;
        this.baseNumber = baseNumber;
        this.monthDayAvgclueCnt = monthDayAvgclueCnt;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Float getDayBudget() {
        return dayBudget;
    }

    public void setDayBudget(Float dayBudget) {
        this.dayBudget = dayBudget;
    }

    public Float getActualConsume() {
        return actualConsume;
    }

    public void setActualConsume(Float actualConsume) {
        this.actualConsume = actualConsume;
    }

    public Long getLeadsCnt() {
        return leadsCnt;
    }

    public void setLeadsCnt(Long leadsCnt) {
        this.leadsCnt = leadsCnt;
    }

    public Double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Double actualPrice) {
        this.actualPrice = DataCalculationUtils.doubleDeal2(actualPrice);
    }

    public Double getExpectPrice() {
        return expectPrice;
    }

    public void setExpectPrice(Double expectPrice) {
        this.expectPrice = DataCalculationUtils.doubleDeal2(expectPrice);
    }

    public String getEarlyWarningMsg() {
        return EarlyWarningMsg;
    }

    public void setEarlyWarningMsg(String earlyWarningMsg) {
        EarlyWarningMsg = earlyWarningMsg;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public Double getBaseNumber() {
        return baseNumber;
    }

    public void setBaseNumber(Double baseNumber) {
        this.baseNumber = baseNumber;
    }

    public Long getMonthDayAvgclueCnt() {
        return monthDayAvgclueCnt;
    }

    public void setMonthDayAvgclueCnt(Long monthDayAvgclueCnt) {
        this.monthDayAvgclueCnt = monthDayAvgclueCnt;
    }

    public String getQfActualConsume() {
        return qfActualConsume;
    }

    public void setQfActualConsume(String qfActualConsume) {
        this.qfActualConsume = qfActualConsume;
    }

    public String getQfLeadsCnt() {
        return qfLeadsCnt;
    }

    public void setQfLeadsCnt(String qfLeadsCnt) {
        this.qfLeadsCnt = qfLeadsCnt;
    }

    public String getQfDayBudget() {
        return qfDayBudget;
    }

    public void setQfDayBudget(String qfDayBudget) {
        this.qfDayBudget = qfDayBudget;
    }

    @Override
    public String toString() {
        return "EarlyWarningData{" +
                "platformName='" + platformName + '\'' +
                ", dayBudget=" + dayBudget +
                ", actualConsume=" + actualConsume +
                ", leadsCnt=" + leadsCnt +
                ", actualPrice=" + actualPrice +
                ", expectPrice=" + expectPrice +
                ", EarlyWarningMsg='" + EarlyWarningMsg + '\'' +
                ", bt='" + bt + '\'' +
                ", baseNumber=" + baseNumber +
                ", monthDayAvgclueCnt=" + monthDayAvgclueCnt +
                ", qfActualConsume='" + qfActualConsume + '\'' +
                ", qfLeadsCnt='" + qfLeadsCnt + '\'' +
                ", qfDayBudget='" + qfDayBudget + '\'' +
                '}';
    }
}
