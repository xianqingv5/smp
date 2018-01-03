package com.yiche.smp.common.linechart;

/**
 * Created by Lenovo on 2017/12/12.
 */
public class TextStyle {
    private int fontSize;

    public TextStyle() {
    }

    public TextStyle(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "TextStyle{" +
                "fontSize=" + fontSize +
                '}';
    }
}
