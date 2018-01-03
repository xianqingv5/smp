package com.yiche.smp.domain;

public class ChannelQualityOverview {
    private Integer id;

    private String scoreAfterData;

    private String scoreWaveDownData;

    private String scoreFrontData;

    private String scoreWaveUpData;

    private Integer comeFrom;

    private String monthData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScoreAfterData() {
        return scoreAfterData;
    }

    public void setScoreAfterData(String scoreAfterData) {
        this.scoreAfterData = scoreAfterData == null ? null : scoreAfterData.trim();
    }

    public String getScoreWaveDownData() {
        return scoreWaveDownData;
    }

    public void setScoreWaveDownData(String scoreWaveDownData) {
        this.scoreWaveDownData = scoreWaveDownData == null ? null : scoreWaveDownData.trim();
    }

    public String getScoreFrontData() {
        return scoreFrontData;
    }

    public void setScoreFrontData(String scoreFrontData) {
        this.scoreFrontData = scoreFrontData == null ? null : scoreFrontData.trim();
    }

    public String getScoreWaveUpData() {
        return scoreWaveUpData;
    }

    public void setScoreWaveUpData(String scoreWaveUpData) {
        this.scoreWaveUpData = scoreWaveUpData == null ? null : scoreWaveUpData.trim();
    }

    public Integer getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(Integer comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getMonthData() {
        return monthData;
    }

    public void setMonthData(String monthData) {
        this.monthData = monthData == null ? null : monthData.trim();
    }
}