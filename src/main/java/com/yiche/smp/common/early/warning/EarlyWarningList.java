package com.yiche.smp.common.early.warning;

import com.yiche.smp.common.StringUtil;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/25
 */
public class EarlyWarningList implements Serializable {

    private static final long serialVersionUID = -648189980626477734L;
    private Integer id;

    private String isTop;

    private String brandName;

    private String trendDecide;

    private String shopSellDifference;

    private String totalSellDifference;

    public EarlyWarningList(Integer id, String isTop, String brandName, String trendDecide, String shopSellDifference, String totalSellDifference) {
        this.id = id;
        this.isTop = isTop;
        this.brandName = brandName;
        this.trendDecide = trendDecide;
        this.shopSellDifference = shopSellDifference;
        this.totalSellDifference = totalSellDifference;
    }

    public EarlyWarningList() {
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

    @Override
    public String toString() {
        return "EarlyWarningList{" +
                "id=" + id +
                ", isTop='" + isTop + '\'' +
                ", brandName='" + brandName + '\'' +
                ", trendDecide='" + trendDecide + '\'' +
                ", shopSellDifference=" + shopSellDifference +
                ", totalSellDifference=" + totalSellDifference +
                '}';
    }
}
