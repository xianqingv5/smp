package com.yiche.smp.common.channelPictureChart;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class ScoreData {
    private String channelScoreTitle;
    private String channelScoreDesc;
    private Table channelScoreTable;
    private List<ChannelScoreChart> channelScoreChart;

    public ScoreData() {
    }

    public ScoreData(String channelScoreTitle, String channelScoreDesc, Table channelScoreTable, List<ChannelScoreChart> channelScoreChart) {
        this.channelScoreTitle = channelScoreTitle;
        this.channelScoreDesc = channelScoreDesc;
        this.channelScoreTable = channelScoreTable;
        this.channelScoreChart = channelScoreChart;
    }

    public String getChannelScoreTitle() {
        return channelScoreTitle;
    }

    public void setChannelScoreTitle(String channelScoreTitle) {
        this.channelScoreTitle = channelScoreTitle;
    }

    public String getChannelScoreDesc() {
        return channelScoreDesc;
    }

    public void setChannelScoreDesc(String channelScoreDesc) {
        this.channelScoreDesc = channelScoreDesc;
    }

    public Table getChannelScoreTable() {
        return channelScoreTable;
    }

    public void setChannelScoreTable(Table channelScoreTable) {
        this.channelScoreTable = channelScoreTable;
    }

    public List<ChannelScoreChart> getChannelScoreChart() {
        return channelScoreChart;
    }

    public void setChannelScoreChart(List<ChannelScoreChart> channelScoreChart) {
        this.channelScoreChart = channelScoreChart;
    }

    @Override
    public String toString() {
        return "ScoreData{" +
                "channelScoreTitle='" + channelScoreTitle + '\'' +
                ", channelScoreDesc='" + channelScoreDesc + '\'' +
                ", channelScoreTable=" + channelScoreTable +
                ", channelScoreChart=" + channelScoreChart +
                '}';
    }
}
