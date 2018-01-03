package com.yiche.smp.common.linechart;

/**
 * Created by Lenovo on 2017/12/12.
 */
public class Trend {
    private String text;
    private String top;
    private String left;
    private TextStyle textStyle;

    public Trend() {

    }

    public Trend(String text, String top, String left, TextStyle textStyle) {
        this.text = text;
        this.top = top;
        this.left = left;
        this.textStyle = textStyle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    @Override
    public String toString() {
        return "Trend{" +
                "text='" + text + '\'' +
                ", top='" + top + '\'' +
                ", left='" + left + '\'' +
                ", textStyle=" + textStyle +
                '}';
    }
}
