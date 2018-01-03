package com.yiche.smp.common.channelPictureChart;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class TotalData {
    private ScoreData scoreAfterData;
    private ScoreData scoreWaveDownData;
    private ScoreData scoreFontData;
    private ScoreData scoreWaveUpData;

    public TotalData() {
    }

    public TotalData(ScoreData scoreAfterData, ScoreData scoreWaveDownData, ScoreData scoreFontData, ScoreData scoreWaveUpData) {
        this.scoreAfterData = scoreAfterData;
        this.scoreWaveDownData = scoreWaveDownData;
        this.scoreFontData = scoreFontData;
        this.scoreWaveUpData = scoreWaveUpData;
    }

    public ScoreData getScoreAfterData() {
        return scoreAfterData;
    }

    public void setScoreAfterData(ScoreData scoreAfterData) {
        this.scoreAfterData = scoreAfterData;
    }

    public ScoreData getScoreWaveDownData() {
        return scoreWaveDownData;
    }

    public void setScoreWaveDownData(ScoreData scoreWaveDownData) {
        this.scoreWaveDownData = scoreWaveDownData;
    }

    public ScoreData getScoreFontData() {
        return scoreFontData;
    }

    public void setScoreFontData(ScoreData scoreFontData) {
        this.scoreFontData = scoreFontData;
    }

    public ScoreData getScoreWaveUpData() {
        return scoreWaveUpData;
    }

    public void setScoreWaveUpData(ScoreData scoreWaveUpData) {
        this.scoreWaveUpData = scoreWaveUpData;
    }

    @Override
    public String toString() {
        return "TotalData{" +
                "scoreAfterData=" + scoreAfterData +
                ", scoreWaveDownData=" + scoreWaveDownData +
                ", scoreFontData=" + scoreFontData +
                ", scoreWaveUpData=" + scoreWaveUpData +
                '}';
    }
}
