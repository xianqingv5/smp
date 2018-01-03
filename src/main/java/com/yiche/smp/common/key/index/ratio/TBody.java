package com.yiche.smp.common.key.index.ratio;

import io.swagger.models.auth.In;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/11
 */
public class TBody implements Serializable {
    private static final long serialVersionUID = -1362975046082279475L;

    private String indexCategory;

    private String detailName;
    /**
     * 月比趋势 0减 1加
     */
    private Integer monthTrend;
    /**
     * 月环比
     */
    private String compareValue;
    /**
     * 异变较大的渠道
     */
    private String changeChannel;

    private List <Integer> rowSpan;

    private List <Integer> isShow;

    public TBody(String indexCategory, String detailName, Integer monthTrend, String compareValue, String changeChannel, List <Integer> rowSpan, List <Integer> isShow) {
        this.indexCategory = indexCategory;
        this.detailName = detailName;
        this.monthTrend = monthTrend;
        this.compareValue = compareValue;
        this.changeChannel = changeChannel;
        this.rowSpan = rowSpan;
        this.isShow = isShow;
    }

    public TBody(String indexCategory, String detailName, Integer monthTrend, String compareValue, String changeChannel) {
        this.indexCategory = indexCategory;
        this.detailName = detailName;
        this.monthTrend = monthTrend;
        this.compareValue = compareValue;
        this.changeChannel = changeChannel;
    }

    public TBody() {
    }

    public String getIndexCategory() {
        return indexCategory;
    }

    public void setIndexCategory(String indexCategory) {
        this.indexCategory = indexCategory;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public Integer getMonthTrend() {
        return monthTrend;
    }

    public void setMonthTrend(Integer monthTrend) {
        this.monthTrend = monthTrend;
    }

    public String getCompareValue() {
        return compareValue;
    }

    public void setCompareValue(String compareValue) {
        this.compareValue = compareValue;
    }

    public String getChangeChannel() {
        return changeChannel;
    }

    public void setChangeChannel(String changeChannel) {
        this.changeChannel = changeChannel;
    }

    public List <Integer> getRowSpan() {
        return rowSpan;
    }

    public void setRowSpan(List <Integer> rowSpan) {
        this.rowSpan = rowSpan;
    }

    public List <Integer> getIsShow() {
        return isShow;
    }

    public void setIsShow(List <Integer> isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "TBody{" +
                "indexCategory='" + indexCategory + '\'' +
                ", detailName='" + detailName + '\'' +
                ", monthTrend=" + monthTrend +
                ", compareValue='" + compareValue + '\'' +
                ", changeChannel='" + changeChannel + '\'' +
                '}';
    }
}
