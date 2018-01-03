package com.yiche.smp.common.piechart;

import java.io.Serializable;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class Normal implements Serializable {
    private static final long serialVersionUID = -2781267113530107446L;
    String position = "inner";
    boolean show = false;

    public Normal(String position) {
        this.position = position;
    }

    public Normal(String position, boolean show) {
        this.position = position;
        this.show = show;
    }

    public Normal() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "Normal{" +
                "position='" + position + '\'' +
                ", show=" + show +
                '}';
    }

}
