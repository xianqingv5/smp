package com.yiche.smp.common.put.in.strategy.chart;

import com.yiche.smp.common.StringUtil;
import java.io.Serializable;

/**
 *
 */
public class Tooltip implements Serializable {

    private static final long serialVersionUID = 9177384690446004332L;

    private String trigger;


    public Tooltip(String trigger) {
        this.trigger = trigger;
    }

    public Tooltip() {
    }

    public String getTrigger() {
        if (StringUtil.notNull(trigger)) {
            return trigger;
        }
        return "axis";
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    @Override
    public String toString() {
        return "Tooltip{" +
                "trigger='" + trigger + '\'' +
                '}';
    }
}
