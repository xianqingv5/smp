package com.yiche.smp.common.DayReport;

/**
 * Created by xuhaiqiang on 2018/3/19
 */
public class Data {

    private String title;

    private Object preTwoDay;

    private Object preOneDay;

    private String ratio;

    private String portion;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getPreTwoDay() {
        return preTwoDay;
    }

    public void setPreTwoDay(Object preTwoDay) {
        this.preTwoDay = preTwoDay;
    }

    public Object getPreOneDay() {
        return preOneDay;
    }

    public void setPreOneDay(Object preOneDay) {
        this.preOneDay = preOneDay;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }
}
