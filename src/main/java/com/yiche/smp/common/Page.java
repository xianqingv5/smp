package com.yiche.smp.common;


import java.io.Serializable;
import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/7
 */
public class Page<T> extends ReportCondition{

    private Integer totalsize;
    private Integer totalno;
    private Integer pageno;
    private Integer pagesize;
    private List<T> datas;

    public Page() {
    }

    public Page(Integer totalsize, Integer totalno, Integer pageno, Integer pagesize, List<T> datas) {
        this.totalsize = totalsize;
        this.totalno = totalno;
        this.pageno = pageno;
        this.pagesize = pagesize;
        this.datas = datas;
    }

    public Page(String platformName, String channelName, String startTime, String endTime, int isDetail, Integer pageno, Integer pagesize) {
        super(platformName, channelName, startTime, endTime, isDetail);
        this.pageno = pageno;
        this.pagesize = pagesize;
    }

    public Integer getTotalsize() {
        return totalsize;
    }

    public void setTotalsize(Integer totalsize) {
        this.totalsize = totalsize;
    }

    public Integer getTotalno() {
        return totalno;
    }

    public void setTotalno(Integer totalno) {
        this.totalno = totalno;
    }

    public Integer getPageno() {
        return pageno;
    }

    public void setPageno(Integer pageno) {
        this.pageno = pageno;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "Page{" +
                "totalsize=" + totalsize +
                ", totalno=" + totalno +
                ", pageno=" + pageno +
                ", pagesize=" + pagesize +
                ", datas=" + datas +
                '}';
    }
}
