package com.yiche.smp.domain;


public class ClueNumber {
    private Integer numid;

    private String numtypename;

    private String nummonthyear;

    private double numvalue;

    public Integer getNumid() {
        return numid;
    }

    public void setNumid(Integer numid) {
        this.numid = numid;
    }

    public String getNumtypename() {
        return numtypename;
    }

    public void setNumtypename(String numtypename) {
        this.numtypename = numtypename == null ? null : numtypename.trim();
    }

    public String getNummonthyear() {
        return nummonthyear;
    }

    public void setNummonthyear(String nummonthyear) {
        this.nummonthyear = nummonthyear;
    }

    public double getNumvalue() {
        return numvalue;
    }

    public void setNumvalue(double numvalue) {
        this.numvalue = numvalue;
    }
}