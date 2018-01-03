package com.yiche.smp.common.channelPictureChart;

import java.io.Serializable;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Tbody2 implements Serializable{
    private static final long serialVersionUID = 5985110185624544959L;
    private String channelName;
    private double indexScorePrev;
    private double indexScoreNext;
    private double numberScorePrev;
    private double numberScoreNext;
    private double qualityScorePrev;
    private double qualityScoreNext;
    private double efficiencyScorePrev;
    private double efficiencyScoreNext;
    private int rank;
    private Object wave;

    public Tbody2() {
    }

    public Tbody2(String channelName, double indexScorePrev, double indexScoreNext, double numberScorePrev, double numberScoreNext, double qualityScorePrev, double qualityScoreNext, double efficiencyScorePrev, double efficiencyScoreNext, int rank, Object wave) {
        this.channelName = channelName;
        this.indexScorePrev = indexScorePrev;
        this.indexScoreNext = indexScoreNext;
        this.numberScorePrev = numberScorePrev;
        this.numberScoreNext = numberScoreNext;
        this.qualityScorePrev = qualityScorePrev;
        this.qualityScoreNext = qualityScoreNext;
        this.efficiencyScorePrev = efficiencyScorePrev;
        this.efficiencyScoreNext = efficiencyScoreNext;
        this.rank = rank;
        this.wave = wave;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public double getIndexScorePrev() {
        return indexScorePrev;
    }

    public void setIndexScorePrev(double indexScorePrev) {
        this.indexScorePrev = indexScorePrev;
    }

    public double getIndexScoreNext() {
        return indexScoreNext;
    }

    public void setIndexScoreNext(double indexScoreNext) {
        this.indexScoreNext = indexScoreNext;
    }

    public double getNumberScorePrev() {
        return numberScorePrev;
    }

    public void setNumberScorePrev(double numberScorePrev) {
        this.numberScorePrev = numberScorePrev;
    }

    public double getNumberScoreNext() {
        return numberScoreNext;
    }

    public void setNumberScoreNext(double numberScoreNext) {
        this.numberScoreNext = numberScoreNext;
    }

    public double getQualityScorePrev() {
        return qualityScorePrev;
    }

    public void setQualityScorePrev(double qualityScorePrev) {
        this.qualityScorePrev = qualityScorePrev;
    }

    public double getQualityScoreNext() {
        return qualityScoreNext;
    }

    public void setQualityScoreNext(double qualityScoreNext) {
        this.qualityScoreNext = qualityScoreNext;
    }

    public double getEfficiencyScorePrev() {
        return efficiencyScorePrev;
    }

    public void setEfficiencyScorePrev(double efficiencyScorePrev) {
        this.efficiencyScorePrev = efficiencyScorePrev;
    }

    public double getEfficiencyScoreNext() {
        return efficiencyScoreNext;
    }

    public void setEfficiencyScoreNext(double efficiencyScoreNext) {
        this.efficiencyScoreNext = efficiencyScoreNext;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Object getWave() {
        return wave;
    }

    public void setWave(Object wave) {
        this.wave = wave;
    }

    @Override
    public String toString() {
        return "Tbody2{" +
                "channelName='" + channelName + '\'' +
                ", indexScorePrev=" + indexScorePrev +
                ", indexScoreNext=" + indexScoreNext +
                ", numberScorePrev=" + numberScorePrev +
                ", numberScoreNext=" + numberScoreNext +
                ", qualityScorePrev=" + qualityScorePrev +
                ", qualityScoreNext=" + qualityScoreNext +
                ", efficiencyScorePrev=" + efficiencyScorePrev +
                ", efficiencyScoreNext=" + efficiencyScoreNext +
                ", rank=" + rank +
                ", wave=" + wave +
                '}';
    }
}
