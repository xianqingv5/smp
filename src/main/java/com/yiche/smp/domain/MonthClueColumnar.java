package com.yiche.smp.domain;

public class MonthClueColumnar {
    private Integer clueColumnarId;

    private Integer conformMarketTrend;

    private Integer upMarketTrend;

    private Integer underMaketTrendShopUp;

    private Integer underMaketTrendClueUpInsufficient;

    private Integer underMaketTrendClueGlide;

    private String dataDate;

    public Integer getClueColumnarId() {
        return clueColumnarId;
    }

    public void setClueColumnarId(Integer clueColumnarId) {
        this.clueColumnarId = clueColumnarId;
    }

    public Integer getConformMarketTrend() {
        return conformMarketTrend;
    }

    public void setConformMarketTrend(Integer conformMarketTrend) {
        this.conformMarketTrend = conformMarketTrend;
    }

    public Integer getUpMarketTrend() {
        return upMarketTrend;
    }

    public void setUpMarketTrend(Integer upMarketTrend) {
        this.upMarketTrend = upMarketTrend;
    }

    public Integer getUnderMaketTrendShopUp() {
        return underMaketTrendShopUp;
    }

    public void setUnderMaketTrendShopUp(Integer underMaketTrendShopUp) {
        this.underMaketTrendShopUp = underMaketTrendShopUp;
    }

    public Integer getUnderMaketTrendClueUpInsufficient() {
        return underMaketTrendClueUpInsufficient;
    }

    public void setUnderMaketTrendClueUpInsufficient(Integer underMaketTrendClueUpInsufficient) {
        this.underMaketTrendClueUpInsufficient = underMaketTrendClueUpInsufficient;
    }

    public Integer getUnderMaketTrendClueGlide() {
        return underMaketTrendClueGlide;
    }

    public void setUnderMaketTrendClueGlide(Integer underMaketTrendClueGlide) {
        this.underMaketTrendClueGlide = underMaketTrendClueGlide;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}