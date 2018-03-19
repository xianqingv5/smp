package com.yiche.smp.domain;

public class FileExcel {
    private Integer id;

    private String filename;

    private String fileload;

    private String user;

    private String createtime;

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

    public String getFileload() {
        return fileload;
    }

    public void setFileload(String fileload) {
        this.fileload = fileload == null ? null : fileload.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}