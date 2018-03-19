package com.yiche.smp.domain;

public class ImpPlatform {
    private Integer id;

    private String platformname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlatformname() {
        return platformname;
    }

    public void setPlatformname(String platformname) {
        this.platformname = platformname == null ? null : platformname.trim();
    }
}