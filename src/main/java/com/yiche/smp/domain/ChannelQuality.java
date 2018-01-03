package com.yiche.smp.domain;

public class ChannelQuality {
    private Integer id;

    private String channelNumber;

    private String channelName;

    private Double indexScore;

    private Double numberScore;

    private Double qualityScore;

    private Double efficiencyScore;

    private Integer rank;

    private Double totalScore;

    private Integer rankShange;

    private Double scoreChange;

    private String monthTime;

    private Integer comeFrom;

    private String channelTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber == null ? null : channelNumber.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Double getIndexScore() {
        return indexScore;
    }

    public void setIndexScore(Double indexScore) {
        this.indexScore = indexScore;
    }

    public Double getNumberScore() {
        return numberScore;
    }

    public void setNumberScore(Double numberScore) {
        this.numberScore = numberScore;
    }

    public Double getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Double qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Double getEfficiencyScore() {
        return efficiencyScore;
    }

    public void setEfficiencyScore(Double efficiencyScore) {
        this.efficiencyScore = efficiencyScore;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getRankShange() {
        return rankShange;
    }

    public void setRankShange(Integer rankShange) {
        this.rankShange = rankShange;
    }

    public Double getScoreChange() {
        return scoreChange;
    }

    public void setScoreChange(Double scoreChange) {
        this.scoreChange = scoreChange;
    }

    public String getMonthTime() {
        return monthTime;
    }

    public void setMonthTime(String monthTime) {
        this.monthTime = monthTime == null ? null : monthTime.trim();
    }

    public Integer getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(Integer comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getChannelTime() {
        return channelTime;
    }

    public void setChannelTime(String channelTime) {
        this.channelTime = channelTime == null ? null : channelTime.trim();
    }
}