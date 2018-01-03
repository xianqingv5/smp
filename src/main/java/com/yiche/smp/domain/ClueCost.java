package com.yiche.smp.domain;

public class ClueCost {
    private Integer costid;

    private String costtypename;

    private String costmonthyear;

    private double costvalue;

    public Integer getCostid() {
        return costid;
    }

    public void setCostid(Integer costid) {
        this.costid = costid;
    }

    public String getCosttypename() {
        return costtypename;
    }

    public void setCosttypename(String costtypename) {
        this.costtypename = costtypename == null ? null : costtypename.trim();
    }

    public String getCostmonthyear() {
        return costmonthyear;
    }

    public void setCostmonthyear(String costmonthyear) {
        this.costmonthyear = costmonthyear;
    }

    public double getCostvalue() {
        return costvalue;
    }

    public void setCostvalue(double costvalue) {
        this.costvalue = costvalue;
    }
}