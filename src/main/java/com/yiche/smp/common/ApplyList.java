package com.yiche.smp.common;

import java.util.Date;

/**
 * Created by Lenovo on 2017/12/7.
 */
public class ApplyList {
    private int applyId;
    private String applyTime;
    private String applyNumber;
    private int status;

    public ApplyList() {
    }

    public ApplyList(int applyId, String applyTime, String applyNumber, int status) {
        this.applyId = applyId;
        this.applyTime = applyTime;
        this.applyNumber = applyNumber;
        this.status = status;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ApplyList{" +
                "applyId=" + applyId +
                ", applyTime='" + applyTime + '\'' +
                ", applyNumber='" + applyNumber + '\'' +
                ", status=" + status +
                '}';
    }
}
