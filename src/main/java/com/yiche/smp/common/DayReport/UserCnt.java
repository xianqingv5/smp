package com.yiche.smp.common.DayReport;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/19
 */
public class UserCnt implements Serializable{

    private String title;

    private Long preTwoDay;

    private Long preOneDay;

    private String UserCntRatio;

    private String UserCntPortion;

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

    public String getUserCntRatio() {
        return UserCntRatio;
    }

    public void setUserCntRatio(String userCntRatio) {
        UserCntRatio = userCntRatio;
    }

    public String getUserCntPortion() {
        return UserCntPortion;
    }

    public void setUserCntPortion(String userCntPortion) {
        UserCntPortion = userCntPortion;
    }
}
