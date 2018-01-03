package com.yiche.smp.common.euraka.data;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/14
 */
public class Data implements Serializable {
    private static final long serialVersionUID = 3331467071864293234L;

    private String id;

    private String name;

    public Data(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Data() {
    }

    public String getId() {
        return id;
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

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
