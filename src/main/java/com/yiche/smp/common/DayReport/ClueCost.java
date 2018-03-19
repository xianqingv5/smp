package com.yiche.smp.common.DayReport;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/19
 */
public class ClueCost implements Serializable {

    private String title;

    private Double preTwoDay;

    private Double preOneDay;

    private String clueCostRatio;

    private String clueCostPortion;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPreTwoDay() {
        return preTwoDay;
    }

    public void setPreTwoDay(Double preTwoDay) {
        this.preTwoDay = preTwoDay;
    }

    public Double getPreOneDay() {
        return preOneDay;
    }

    public void setPreOneDay(Double preOneDay) {
        this.preOneDay = preOneDay;
    }

    public String getClueCostRatio() {
        return clueCostRatio;
    }

    public void setClueCostRatio(String clueCostRatio) {
        this.clueCostRatio = clueCostRatio;
    }

    public String getClueCostPortion() {
        return clueCostPortion;
    }

    public void setClueCostPortion(String clueCostPortion) {
        this.clueCostPortion = clueCostPortion;
    }
}
