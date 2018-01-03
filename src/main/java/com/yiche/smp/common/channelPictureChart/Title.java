package com.yiche.smp.common.channelPictureChart;

/**
 * Created by Lenovo on 2017/12/8.
 */
public class Title {
    private String text;

    public Title() {
    }

    public Title(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Title{" +
                "text='" + text + '\'' +
                '}';
    }
}
