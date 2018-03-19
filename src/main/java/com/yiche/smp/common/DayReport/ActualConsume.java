package com.yiche.smp.common.DayReport;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/19
 */
public class ActualConsume implements Serializable {

    private String title;

    private Float preTwoDay;

    private Float preOneDay;

    private String actualConsumeRatio;

    private String actualConsumePortion;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPreTwoDay() {
        return preTwoDay;
    }

    public void setPreTwoDay(Float preTwoDay) {
        this.preTwoDay = preTwoDay;
    }

    public Float getPreOneDay() {
        return preOneDay;
    }

    public void setPreOneDay(Float preOneDay) {
        this.preOneDay = preOneDay;
    }

    public String getActualConsumeRatio() {
        return actualConsumeRatio;
    }

    public void setActualConsumeRatio(String actualConsumeRatio) {
        this.actualConsumeRatio = actualConsumeRatio;
    }

    public String getActualConsumePortion() {
        return actualConsumePortion;
    }

    public void setActualConsumePortion(String actualConsumePortion) {
        this.actualConsumePortion = actualConsumePortion;
    }
}
