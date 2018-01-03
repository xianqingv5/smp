package com.yiche.smp.common.linechart;

/**
 * Created by Lenovo on 2017/12/13.
 */
public class BrandName {
    private String name;
    private String id;
    private String carMakeType;

    public BrandName() {
    }

    public BrandName(String name, String id, String carMakeType) {
        this.name = name;
        this.id = id;
        this.carMakeType = carMakeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarMakeType() {
        return carMakeType;
    }

    public void setCarMakeType(String carMakeType) {
        this.carMakeType = carMakeType;
    }

    @Override
    public String toString() {
        return "BrandName{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", carMakeType='" + carMakeType + '\'' +
                '}';
    }
}
