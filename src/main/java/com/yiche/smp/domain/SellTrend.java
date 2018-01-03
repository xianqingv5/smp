package com.yiche.smp.domain;

public class SellTrend {
    private Integer id;

    private String monthdata;

    private String brand;

    private Double clueNumber;

    private Double dealerNumber;

    private Double storeClueNumber;

    private Double sellNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonthdata() {
        return monthdata;
    }

    public void setMonthdata(String monthdata) {
        this.monthdata = monthdata == null ? null : monthdata.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Double getClueNumber() {
        return clueNumber;
    }

    public void setClueNumber(Double clueNumber) {
        this.clueNumber = clueNumber;
    }

    public Double getDealerNumber() {
        return dealerNumber;
    }

    public void setDealerNumber(Double dealerNumber) {
        this.dealerNumber = dealerNumber;
    }

    public Double getStoreClueNumber() {
        return storeClueNumber;
    }

    public void setStoreClueNumber(Double storeClueNumber) {
        this.storeClueNumber = storeClueNumber;
    }

    public Double getSellNumber() {
        return sellNumber;
    }

    public void setSellNumber(Double sellNumber) {
        this.sellNumber = sellNumber;
    }
}