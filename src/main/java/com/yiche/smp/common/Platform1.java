package com.yiche.smp.common;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/21
 */
public class Platform1 implements Serializable {

    private Integer id;

    private String platformName;

    public Platform1(Integer id, String platformName) {
        this.id = id;
        this.platformName = platformName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Platform1() {
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}
