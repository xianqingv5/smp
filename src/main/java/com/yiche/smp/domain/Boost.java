package com.yiche.smp.domain;

import java.io.Serializable;
import java.util.List;

public class Boost implements Serializable{

    private static final long serialVersionUID = -8075224467912520676L;
    private Integer id;

    private String number;

    private String carmake;

    private String carbrand;

    private String carmodel;

    private String province;

    private String budgetdepartment;

    private Integer budgetvalue;

    private Integer clue;
    private String starttime;
    private String finishtime;

    private String linktype;

    private String linkurl;

    private String remark;

    private String userid;

    private String branch;

    private Integer status;

    private String uploadfilepath;
    //驳回理由
    private String refuseReason;
    //接收审核结果【true  false】
    private String checkResult;
    //申请时间
    private String applyTime;
    //申请的年份
    private String applyYear;
   //接收所选城市ID
    private String[] cityIds;
    //上传文件的原名
    private String fileName;
    //投放策略
    private String strategy;
    private List<City> cityList;


    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String[] getCityIds() {
        return cityIds;
    }

    public void setCityIds(String[] cityIds) {
        this.cityIds = cityIds;
    }

    public String getApplyYear() {
        return applyYear;
    }

    public void setApplyYear(String applyYear) {
        this.applyYear = applyYear;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake == null ? null : carmake.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel == null ? null : carmodel.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getBudgetdepartment() {
        return budgetdepartment;
    }

    public void setBudgetdepartment(String budgetdepartment) {
        this.budgetdepartment = budgetdepartment == null ? null : budgetdepartment.trim();
    }

    public Integer getBudgetvalue() {
        return budgetvalue;
    }

    public void setBudgetvalue(Integer budgetvalue) {
        this.budgetvalue = budgetvalue;
    }

    public Integer getClue() {
        return clue;
    }

    public void setClue(Integer clue) {
        this.clue = clue;
    }

    public String getLinktype() {
        return linktype;
    }

    public void setLinktype(String linktype) {
        this.linktype = linktype == null ? null : linktype.trim();
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl == null ? null : linkurl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUploadfilepath() {
        return uploadfilepath;
    }

    public void setUploadfilepath(String uploadfilepath) {
        this.uploadfilepath = uploadfilepath == null ? null : uploadfilepath.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }
}