package com.yiche.smp.domain;

import java.util.Date;

public class ImpChannelConsumeData {
    private Integer id;

    private String filename;

    private String savefilenmae;

    private Date uploadtime;

    private String operator;

    private String filepath;

    private Boolean status;

    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getSavefilenmae() {
        return savefilenmae;
    }

    public void setSavefilenmae(String savefilenmae) {
        this.savefilenmae = savefilenmae == null ? null : savefilenmae.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}