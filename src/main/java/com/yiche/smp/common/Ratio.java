package com.yiche.smp.common;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/13
 */
public class Ratio implements Serializable{

    private String clueRatio;

    private String userRatio;

    private String consumeRatio;

    private String leadsCostRatio;

    public Ratio(String clueRatio, String userRatio, String consumeRatio, String leadsCostRatio) {
        this.clueRatio = clueRatio;
        this.userRatio = userRatio;
        this.consumeRatio = consumeRatio;
        this.leadsCostRatio = leadsCostRatio;
    }

    public Ratio() {
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

    public String getConsumeRatio() {
        return consumeRatio;
    }

    public void setConsumeRatio(String consumeRatio) {
        this.consumeRatio = consumeRatio;
    }

    public String getLeadsCostRatio() {
        return leadsCostRatio;
    }

    public void setLeadsCostRatio(String leadsCostRatio) {
        this.leadsCostRatio = leadsCostRatio;
    }
}
