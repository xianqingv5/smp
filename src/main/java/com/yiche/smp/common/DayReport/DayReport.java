package com.yiche.smp.common.DayReport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/19
 */
public class DayReport implements Serializable {
    private String title;

    private List<Data> data;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
