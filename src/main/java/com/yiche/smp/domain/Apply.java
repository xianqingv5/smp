package com.yiche.smp.domain;

import java.util.Date;

public class Apply {
    private Integer id;

    private String applyType;

    private String channelInfoName;

    private String channelInfoValue;

    private String sampleDemandName;

    private String sampleDemandValue;

    private String dataReferName;

    private String dataReferValue;

    private String enclosure;

    private String userId;

    private String branch;

    private Integer status;

    private String number;

    private String uploadFilePath;

    private Date createTime;

    private String filename;

    private String enclosureName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public String getChannelInfoName() {
        return channelInfoName;
    }

    public void setChannelInfoName(String channelInfoName) {
        this.channelInfoName = channelInfoName == null ? null : channelInfoName.trim();
    }

    public String getChannelInfoValue() {
        return channelInfoValue;
    }

    public void setChannelInfoValue(String channelInfoValue) {
        this.channelInfoValue = channelInfoValue == null ? null : channelInfoValue.trim();
    }

    public String getSampleDemandName() {
        return sampleDemandName;
    }

    public void setSampleDemandName(String sampleDemandName) {
        this.sampleDemandName = sampleDemandName == null ? null : sampleDemandName.trim();
    }

    public String getSampleDemandValue() {
        return sampleDemandValue;
    }

    public void setSampleDemandValue(String sampleDemandValue) {
        this.sampleDemandValue = sampleDemandValue == null ? null : sampleDemandValue.trim();
    }

    public String getDataReferName() {
        return dataReferName;
    }

    public void setDataReferName(String dataReferName) {
        this.dataReferName = dataReferName == null ? null : dataReferName.trim();
    }

    public String getDataReferValue() {
        return dataReferValue;
    }

    public void setDataReferValue(String dataReferValue) {
        this.dataReferValue = dataReferValue == null ? null : dataReferValue.trim();
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure == null ? null : enclosure.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getUploadFilePath() {
        return uploadFilePath;
    }

    public void setUploadFilePath(String uploadFilePath) {
        this.uploadFilePath = uploadFilePath == null ? null : uploadFilePath.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getEnclosureName() {
        return enclosureName;
    }

    public void setEnclosureName(String enclosureName) {
        this.enclosureName = enclosureName == null ? null : enclosureName.trim();
    }
}