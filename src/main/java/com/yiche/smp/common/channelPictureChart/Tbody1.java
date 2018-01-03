package com.yiche.smp.common.channelPictureChart;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Tbody1 {
    private String channelName;
    private double indexScore;
    private double numberScore;
    private double qualityScore;
    private double efficiencyScore;
    private int rank;

    public Tbody1() {
    }

    public Tbody1(String channelName, double indexScore, double numberScore, double qualityScore, double efficiencyScore, int rank) {
        this.channelName = channelName;
        this.indexScore = indexScore;
        this.numberScore = numberScore;
        this.qualityScore = qualityScore;
        this.efficiencyScore = efficiencyScore;
        this.rank = rank;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public double getIndexScore() {
        return indexScore;
    }

    public void setIndexScore(double indexScore) {
        this.indexScore = indexScore;
    }

    public double getNumberScore() {
        return numberScore;
    }

    public void setNumberScore(double numberScore) {
        this.numberScore = numberScore;
    }

    public double getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(double qualityScore) {
        this.qualityScore = qualityScore;
    }

    public double getEfficiencyScore() {
        return efficiencyScore;
    }

    public void setEfficiencyScore(double efficiencyScore) {
        this.efficiencyScore = efficiencyScore;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Tbody1{" +
                "channelName='" + channelName + '\'' +
                ", indexScore=" + indexScore +
                ", numberScore=" + numberScore +
                ", qualityScore=" + qualityScore +
                ", efficiencyScore=" + efficiencyScore +
                ", rank=" + rank +
                '}';
    }
}
