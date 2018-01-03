package com.yiche.smp.common.early.warning;

import java.io.Serializable;

public class EarlyWarningPiece implements Serializable {
    private static final long serialVersionUID = 4938717565900763425L;

    private String warnTitle;

    private String warnNum;

    private String lastYear;

    private String lastYearNum;

    private String compareNum;

    public EarlyWarningPiece(String warnTitle, String warnNum, String lastYear, String lastYearNum, String compareNum) {
        this.warnTitle = warnTitle;
        this.warnNum = warnNum;
        this.lastYear = lastYear;
        this.lastYearNum = lastYearNum;
        this.compareNum = compareNum;
    }

    public EarlyWarningPiece() {
    }

    public String getWarnTitle() {
        return warnTitle;
    }

    public void setWarnTitle(String warnTitle) {
        this.warnTitle = warnTitle;
    }

    public String getWarnNum() {
        return warnNum;
    }

    public void setWarnNum(String warnNum) {
        this.warnNum = warnNum;
    }

    public String getLastYear() {
        return lastYear;
    }

    public void setLastYear(String lastYear) {
        this.lastYear = lastYear;
    }

    public String getLastYearNum() {
        return lastYearNum;
    }

    public void setLastYearNum(String lastYearNum) {
        this.lastYearNum = lastYearNum;
    }

    public String getCompareNum() {
        return compareNum;
    }

    public void setCompareNum(String compareNum) {
        this.compareNum = compareNum;
    }

    @Override
    public String toString() {
        return "EarlyWarningPiece{" +
                "warnTitle='" + warnTitle + '\'' +
                ", warnNum='" + warnNum + '\'' +
                ", lastYear='" + lastYear + '\'' +
                ", lastYearNum='" + lastYearNum + '\'' +
                ", compareNum='" + compareNum + '\'' +
                '}';
    }
}
