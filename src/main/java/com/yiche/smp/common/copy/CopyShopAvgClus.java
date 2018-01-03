package com.yiche.smp.common.copy;

import com.yiche.smp.common.StringUtil;
import com.yiche.smp.domain.ShopAvgClues;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class CopyShopAvgClus implements Serializable {


    private static final long serialVersionUID = 558413167065208059L;

    private Integer id;

    private String isTop;

    private String brandName;

    private String trendDecide;

    private String shopSellDifference;

    private String totalSellDifference;

    private String sellYesteryearOwt;

    private String sell;

    private String sellCompare;

    private String storeCluesYesteryearOwt;

    private String storeClues;

    private String storeCluesCompare;

    private String allCluesYesteryearOwt;

    private String allClues;

    private String yicheCluesCompare;

    private String dealerDataYesteryearOwt;

    private String dealerData;

    private String shopCompare;

    private String baojiaAppYesteryearOwt;

    private String baojiaApp;

    private String baojiaAppCluesCompare;

    private String yicheAppYesteryearOwt;

    private String yicheApp;

    private String yicheAppCluesCompare;

    private String yichePcYesteryearOwt;

    private String yichePc;

    private String yichePcCluesCompare;

    private String yicheWapYesteryearOwt;

    private String yicheWap;

    private String yicheWapCluesCompare;

    private String otherYesteryearOwt;

    private String other;

    private String otherCluesCompare;

    private String cluesDate;

    public CopyShopAvgClus(Integer id, String isTop, String brandName, String trendDecide, String shopSellDifference, String totalSellDifference) {
        this.id = id;
        this.isTop = isTop;
        this.brandName = brandName;
        this.trendDecide = trendDecide;
        this.shopSellDifference = shopSellDifference;
        this.totalSellDifference = totalSellDifference;
    }

    public CopyShopAvgClus(Integer id, String isTop, String brandName, String trendDecide, String shopSellDifference, String totalSellDifference, String sellYesteryearOwt, String sell, String sellCompare, String storeCluesYesteryearOwt, String storeClues, String storeCluesCompare, String allCluesYesteryearOwt, String allClues, String yicheCluesCompare, String dealerDataYesteryearOwt, String dealerData, String shopCompare, String baojiaAppYesteryearOwt, String baojiaApp, String baojiaAppCluesCompare, String yicheAppYesteryearOwt, String yicheApp, String yicheAppCluesCompare, String yichePcYesteryearOwt, String yichePc, String yichePcCluesCompare, String yicheWapYesteryearOwt, String yicheWap, String yicheWapCluesCompare, String otherYesteryearOwt, String other, String otherCluesCompare, String cluesDate) {
        this.id = id;
        this.isTop = isTop;
        this.brandName = brandName;
        this.trendDecide = trendDecide;
        this.shopSellDifference = shopSellDifference;
        this.totalSellDifference = totalSellDifference;
        this.sellYesteryearOwt = sellYesteryearOwt;
        this.sell = sell;
        this.sellCompare = sellCompare;
        this.storeCluesYesteryearOwt = storeCluesYesteryearOwt;
        this.storeClues = storeClues;
        this.storeCluesCompare = storeCluesCompare;
        this.allCluesYesteryearOwt = allCluesYesteryearOwt;
        this.allClues = allClues;
        this.yicheCluesCompare = yicheCluesCompare;
        this.dealerDataYesteryearOwt = dealerDataYesteryearOwt;
        this.dealerData = dealerData;
        this.shopCompare = shopCompare;
        this.baojiaAppYesteryearOwt = baojiaAppYesteryearOwt;
        this.baojiaApp = baojiaApp;
        this.baojiaAppCluesCompare = baojiaAppCluesCompare;
        this.yicheAppYesteryearOwt = yicheAppYesteryearOwt;
        this.yicheApp = yicheApp;
        this.yicheAppCluesCompare = yicheAppCluesCompare;
        this.yichePcYesteryearOwt = yichePcYesteryearOwt;
        this.yichePc = yichePc;
        this.yichePcCluesCompare = yichePcCluesCompare;
        this.yicheWapYesteryearOwt = yicheWapYesteryearOwt;
        this.yicheWap = yicheWap;
        this.yicheWapCluesCompare = yicheWapCluesCompare;
        this.otherYesteryearOwt = otherYesteryearOwt;
        this.other = other;
        this.otherCluesCompare = otherCluesCompare;
        this.cluesDate = cluesDate;
    }

    public CopyShopAvgClus() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTrendDecide() {
        return trendDecide;
    }

    public void setTrendDecide(String trendDecide) {
        this.trendDecide = trendDecide;
    }

    public String getShopSellDifference() {
        return StringUtil.handleData(shopSellDifference);
    }

    public void setShopSellDifference(String shopSellDifference) {
        this.shopSellDifference = shopSellDifference;
    }

    public String getTotalSellDifference() {
        return StringUtil.handleData(totalSellDifference);
    }

    public void setTotalSellDifference(String totalSellDifference) {
        this.totalSellDifference = totalSellDifference;
    }

    public String getSellYesteryearOwt() {
        return StringUtil.handletoRound(sellYesteryearOwt);
    }

    public void setSellYesteryearOwt(String sellYesteryearOwt) {
        this.sellYesteryearOwt = sellYesteryearOwt;
    }

    public String getSell() {
        return StringUtil.handletoRound(sell);
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getSellCompare() {
        return StringUtil.handleData(sellCompare);
    }

    public void setSellCompare(String sellCompare) {
        this.sellCompare = sellCompare;
    }

    public String getStoreCluesYesteryearOwt() {
         return StringUtil.handletoRound(storeCluesYesteryearOwt);
    }

    public void setStoreCluesYesteryearOwt(String storeCluesYesteryearOwt) {
        this.storeCluesYesteryearOwt = storeCluesYesteryearOwt;
    }

    public String getStoreClues() {
        return StringUtil.handletoRound(storeClues);
    }

    public void setStoreClues(String storeClues) {
        this.storeClues = storeClues;
    }

    public String getStoreCluesCompare() {
        return StringUtil.handleData(storeCluesCompare);
    }

    public void setStoreCluesCompare(String storeCluesCompare) {
        this.storeCluesCompare = storeCluesCompare;
    }

    public String getAllCluesYesteryearOwt() {
        return StringUtil.handletoRound(allCluesYesteryearOwt);
    }

    public void setAllCluesYesteryearOwt(String allCluesYesteryearOwt) {
        this.allCluesYesteryearOwt = allCluesYesteryearOwt;
    }

    public String getAllClues() {
        return StringUtil.handletoRound(allClues);
    }

    public void setAllClues(String allClues) {
        this.allClues = allClues;
    }

    public String getYicheCluesCompare() {
        return StringUtil.handleData(yicheCluesCompare);
    }

    public void setYicheCluesCompare(String yicheCluesCompare) {
        this.yicheCluesCompare = yicheCluesCompare;
    }

    public String getDealerDataYesteryearOwt() {
        return StringUtil.handletoRound(dealerDataYesteryearOwt);
    }

    public void setDealerDataYesteryearOwt(String dealerDataYesteryearOwt) {
        this.dealerDataYesteryearOwt = dealerDataYesteryearOwt;
    }

    public String getDealerData() {
        return StringUtil.handletoRound(dealerData);
    }

    public void setDealerData(String dealerData) {
        this.dealerData = dealerData;
    }

    public String getShopCompare() {
        return StringUtil.handleData(shopCompare);
    }

    public void setShopCompare(String shopCompare) {
        this.shopCompare = shopCompare;
    }

    public String getBaojiaAppYesteryearOwt() {
        return StringUtil.handletoRound(baojiaAppYesteryearOwt);
    }

    public void setBaojiaAppYesteryearOwt(String baojiaAppYesteryearOwt) {
        this.baojiaAppYesteryearOwt = baojiaAppYesteryearOwt;
    }

    public String getBaojiaApp() {
        return StringUtil.handletoRound(baojiaApp);
    }

    public void setBaojiaApp(String baojiaApp) {
        this.baojiaApp = baojiaApp;
    }

    public String getBaojiaAppCluesCompare() {
        return StringUtil.handleData(baojiaAppCluesCompare);
    }

    public void setBaojiaAppCluesCompare(String baojiaAppCluesCompare) {
        this.baojiaAppCluesCompare = baojiaAppCluesCompare;
    }

    public String getYicheAppYesteryearOwt() {
        return StringUtil.handletoRound(yicheAppYesteryearOwt);
    }

    public void setYicheAppYesteryearOwt(String yicheAppYesteryearOwt) {
        this.yicheAppYesteryearOwt = yicheAppYesteryearOwt;
    }

    public String getYicheApp() {
        return StringUtil.handletoRound(yicheApp);
    }

    public void setYicheApp(String yicheApp) {
        this.yicheApp = yicheApp;
    }

    public String getYicheAppCluesCompare() {
        return StringUtil.handleData(yicheAppCluesCompare);
    }

    public void setYicheAppCluesCompare(String yicheAppCluesCompare) {
        this.yicheAppCluesCompare = yicheAppCluesCompare;
    }

    public String getYichePcYesteryearOwt() {
        return StringUtil.handletoRound(yichePcYesteryearOwt);
    }

    public void setYichePcYesteryearOwt(String yichePcYesteryearOwt) {
        this.yichePcYesteryearOwt = yichePcYesteryearOwt;
    }

    public String getYichePc() {
        return StringUtil.handletoRound(yichePc);
    }

    public void setYichePc(String yichePc) {
        this.yichePc = yichePc;
    }

    public String getYichePcCluesCompare() {
        return StringUtil.handleData(yichePcCluesCompare);
    }

    public void setYichePcCluesCompare(String yichePcCluesCompare) {
        this.yichePcCluesCompare = yichePcCluesCompare;
    }

    public String getYicheWapYesteryearOwt() {
        return StringUtil.handletoRound(yicheWapYesteryearOwt);
    }

    public void setYicheWapYesteryearOwt(String yicheWapYesteryearOwt) {
        this.yicheWapYesteryearOwt = yicheWapYesteryearOwt;
    }

    public String getYicheWap() {
        return StringUtil.handletoRound(yicheWap);
    }

    public void setYicheWap(String yicheWap) {
        this.yicheWap = yicheWap;
    }

    public String getYicheWapCluesCompare() {
        return StringUtil.handleData(yicheWapCluesCompare);
    }

    public void setYicheWapCluesCompare(String yicheWapCluesCompare) {
        this.yicheWapCluesCompare = yicheWapCluesCompare;
    }

    public String getOtherYesteryearOwt() {
        return StringUtil.handletoRound(otherYesteryearOwt);
    }

    public void setOtherYesteryearOwt(String otherYesteryearOwt) {
        this.otherYesteryearOwt = otherYesteryearOwt;
    }

    public String getOther() {
        return StringUtil.handletoRound(other);
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOtherCluesCompare() {
        return StringUtil.handleData(otherCluesCompare);
    }

    public void setOtherCluesCompare(String otherCluesCompare) {
        this.otherCluesCompare = otherCluesCompare;
    }

    public String getCluesDate() {
        return cluesDate;
    }

    public void setCluesDate(String cluesDate) {
        this.cluesDate = cluesDate;
    }

    @Override
    public String toString() {
        return "CopyShopAvgClus{" +
                "id=" + id +
                ", isTop='" + isTop + '\'' +
                ", brandName='" + brandName + '\'' +
                ", trendDecide='" + trendDecide + '\'' +
                ", shopSellDifference='" + shopSellDifference + '\'' +
                ", totalSellDifference='" + totalSellDifference + '\'' +
                ", sellYesteryearOwt='" + sellYesteryearOwt + '\'' +
                ", sell='" + sell + '\'' +
                ", sellCompare='" + sellCompare + '\'' +
                ", storeCluesYesteryearOwt='" + storeCluesYesteryearOwt + '\'' +
                ", storeClues='" + storeClues + '\'' +
                ", storeCluesCompare='" + storeCluesCompare + '\'' +
                ", allCluesYesteryearOwt='" + allCluesYesteryearOwt + '\'' +
                ", allClues='" + allClues + '\'' +
                ", yicheCluesCompare='" + yicheCluesCompare + '\'' +
                ", dealerDataYesteryearOwt='" + dealerDataYesteryearOwt + '\'' +
                ", dealerData='" + dealerData + '\'' +
                ", shopCompare='" + shopCompare + '\'' +
                ", baojiaAppYesteryearOwt='" + baojiaAppYesteryearOwt + '\'' +
                ", baojiaApp='" + baojiaApp + '\'' +
                ", baojiaAppCluesCompare='" + baojiaAppCluesCompare + '\'' +
                ", yicheAppYesteryearOwt='" + yicheAppYesteryearOwt + '\'' +
                ", yicheApp='" + yicheApp + '\'' +
                ", yicheAppCluesCompare='" + yicheAppCluesCompare + '\'' +
                ", yichePcYesteryearOwt='" + yichePcYesteryearOwt + '\'' +
                ", yichePc='" + yichePc + '\'' +
                ", yichePcCluesCompare='" + yichePcCluesCompare + '\'' +
                ", yicheWapYesteryearOwt='" + yicheWapYesteryearOwt + '\'' +
                ", yicheWap='" + yicheWap + '\'' +
                ", yicheWapCluesCompare='" + yicheWapCluesCompare + '\'' +
                ", otherYesteryearOwt='" + otherYesteryearOwt + '\'' +
                ", other='" + other + '\'' +
                ", otherCluesCompare='" + otherCluesCompare + '\'' +
                ", cluesDate='" + cluesDate + '\'' +
                '}';
    }



}
