package com.yiche.smp.common;

import java.io.Serializable;

/**
 * Created by xuhaiqiang on 2018/3/9
 */
public class Channel implements Serializable {

    private String platformName;
    private String channelName;

    public Channel(String platformName, String channelName) {
        this.platformName = platformName;
        this.channelName = channelName;
    }

    public Channel() {
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
