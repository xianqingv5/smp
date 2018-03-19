package com.yiche.smp.common;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/13
 */
public class Portion  implements Serializable{
    private String cluePortion;

    private String userPortion;

    private String consumePortion;

    private String leadsCostPortion;

    public Portion(String cluePortion, String userPortion, String consumePortion, String leadsCostPortion) {
        this.cluePortion = cluePortion;
        this.userPortion = userPortion;
        this.consumePortion = consumePortion;
        this.leadsCostPortion = leadsCostPortion;
    }

    public Portion() {
    }

    public String getCluePortion() {
        return cluePortion;
    }

    public void setCluePortion(String cluePortion) {
        this.cluePortion = cluePortion;
    }

    public String getUserPortion() {
        return userPortion;
    }

    public void setUserPortion(String userPortion) {
        this.userPortion = userPortion;
    }

    public String getConsumePortion() {
        return consumePortion;
    }

    public void setConsumePortion(String consumePortion) {
        this.consumePortion = consumePortion;
    }

    public String getLeadsCostPortion() {
        return leadsCostPortion;
    }

    public void setLeadsCostPortion(String leadsCostPortion) {
        this.leadsCostPortion = leadsCostPortion;
    }
}
