package com.yiche.smp.domain;

public class SmpStategyCost {
    private Integer stategyCostId;

    private String costChannelName;

    private String costMonth;

    private Double cost;

    public Integer getStategyCostId() {
        return stategyCostId;
    }

    public void setStategyCostId(Integer stategyCostId) {
        this.stategyCostId = stategyCostId;
    }

    public String getCostChannelName() {
        return costChannelName;
    }

    public void setCostChannelName(String costChannelName) {
        this.costChannelName = costChannelName == null ? null : costChannelName.trim();
    }

    public String getCostMonth() {
        return costMonth;
    }

    public void setCostMonth(String costMonth) {
        this.costMonth = costMonth == null ? null : costMonth.trim();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}