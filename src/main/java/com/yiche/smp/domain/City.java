package com.yiche.smp.domain;

import java.io.Serializable;

public class City implements Serializable{
    private static final long serialVersionUID = 2544985918513025882L;
    //主键
    private int primaryId;
    private String id;

    private String name;

    private Integer boostid;

    public String getId() {
        return id;
    }

    public int getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(int primaryId) {
        this.primaryId = primaryId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBoostid() {
        return boostid;
    }

    public void setBoostid(Integer boostid) {
        this.boostid = boostid;
    }

}