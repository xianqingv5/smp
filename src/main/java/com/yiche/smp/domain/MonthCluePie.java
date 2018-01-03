package com.yiche.smp.domain;

public class MonthCluePie {
    private Integer cluePieId;

    private Double conformMarketTrend;

    private Double upMarketTrend;

    private Double underMaketTrendShopUp;

    private Double underMaketTrendClueUpInsufficient;

    private Double underMaketTrendClueGlide;

    private String dataDate;

    public Integer getCluePieId() {
        return cluePieId;
    }

    public void setCluePieId(Integer cluePieId) {
        this.cluePieId = cluePieId;
    }

    public Double getConformMarketTrend() {
        return conformMarketTrend;
    }

    public void setConformMarketTrend(Double conformMarketTrend) {
        this.conformMarketTrend = conformMarketTrend;
    }

    public Double getUpMarketTrend() {
        return upMarketTrend;
    }

    public void setUpMarketTrend(Double upMarketTrend) {
        this.upMarketTrend = upMarketTrend;
    }

    public Double getUnderMaketTrendShopUp() {
        return underMaketTrendShopUp;
    }

    public void setUnderMaketTrendShopUp(Double underMaketTrendShopUp) {
        this.underMaketTrendShopUp = underMaketTrendShopUp;
    }

    public Double getUnderMaketTrendClueUpInsufficient() {
        return underMaketTrendClueUpInsufficient;
    }

    public void setUnderMaketTrendClueUpInsufficient(Double underMaketTrendClueUpInsufficient) {
        this.underMaketTrendClueUpInsufficient = underMaketTrendClueUpInsufficient;
    }

    public Double getUnderMaketTrendClueGlide() {
        return underMaketTrendClueGlide;
    }

    public void setUnderMaketTrendClueGlide(Double underMaketTrendClueGlide) {
        this.underMaketTrendClueGlide = underMaketTrendClueGlide;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}