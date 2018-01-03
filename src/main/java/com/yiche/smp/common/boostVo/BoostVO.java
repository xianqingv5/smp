package com.yiche.smp.common.boostVo;

import com.yiche.smp.domain.Boost;

public class BoostVO extends Boost{
    private String carMakeId;
    private String carBrandId;
    private String carModelId;
    private String provinceId;
    //接收所选城市ID
    private String[] cityIds;

    public BoostVO() {
    }

    @Override
    public String[] getCityIds() {
        return cityIds;
    }

    @Override
    public void setCityIds(String[] cityIds) {
        this.cityIds = cityIds;
    }

    public String getCarMakeId() {
        return carMakeId;
    }

    public void setCarMakeId(String carMakeId) {
        this.carMakeId = carMakeId;
    }

    public String getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(String carBrandId) {
        this.carBrandId = carBrandId;
    }

    public String getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(String carModelId) {
        this.carModelId = carModelId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
}
