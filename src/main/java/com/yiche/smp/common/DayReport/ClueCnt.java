package com.yiche.smp.common.DayReport;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/19
 */
public class ClueCnt implements Serializable {

    private String title;

    private Long preTwoDay;

    private Long preOneDay;

    private String clueRatio;

    private String cluePortion;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPreTwoDay() {
        return preTwoDay;
    }

    public void setPreTwoDay(Long preTwoDay) {
        this.preTwoDay = preTwoDay;
    }

    public Long getPreOneDay() {
        return preOneDay;
    }

    public void setPreOneDay(Long preOneDay) {
        this.preOneDay = preOneDay;
    }

    public String getClueRatio() {
        return clueRatio;
    }

    public void setClueRatio(String clueRatio) {
        this.clueRatio = clueRatio;
    }

    public String getCluePortion() {
        return cluePortion;
    }

    public void setCluePortion(String cluePortion) {
        this.cluePortion = cluePortion;
    }
}
