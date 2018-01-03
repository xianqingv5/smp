package com.yiche.smp.common;

import org.junit.Test;

/**
 * 使用枚举类型来封装异常码和异常信息
 */
public enum UserRoot {
    USER_COMMON(0, "没有权限的普通用户", "无权限"), USER_BLSQCZ(1, "业务申请部门", "操作员"), USER_BLSQSH(2, "业务申请部门", "审核员"), USER_BLSSCZ(3, "补量实施部门", "操作员"), USER_BLSSFH(4, "补量实施部门", "复核员"), USER_FZBSQ(5, "反作弊", "申请员"), USER_FZBSS(6, "反作弊", "操作员");

    private String brand;
    private int code;
    private String station;

    private UserRoot(int code, String brand, String station) {
        this.code = code;
        this.brand = brand;
        this.station = station;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
}
