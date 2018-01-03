package com.yiche.smp.common.early.warning;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/25
 */
public class ResultBrand implements Serializable{
    private static final long serialVersionUID = 5054720771643771613L;

    private Integer id;

    private String name;

    public ResultBrand(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ResultBrand() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ResultBrand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
