package com.yiche.smp.common;

/**
 * funtion:平台
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public enum Platform {
    yiche("易车APP"),
    baojia("汽车报价大全APP");

    private String name;

    private Platform(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
