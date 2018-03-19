package com.yiche.smp.domain;

import java.io.Serializable;
import java.util.Date;

public class ApplyChannelChange implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String applyuser;

    private Integer status;

    private String applychannel;

    private String branch;

    private Date applystarttime;

    private Date applyendtime;

    private String filename;

    private String filepath;

    private String number;

    private String message;

    private Date createtime;

    private String refusereason;
    
    //是否通过审核
    private String dataCheck;

	public ApplyChannelChange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplyChannelChange(Integer id, String applyuser, Integer status, String applychannel, String branch,
			Date applystarttime, Date applyendtime, String filename, String filepath, String number, String message,
			Date createtime, String refusereason, String dataCheck) {
		super();
		this.id = id;
		this.applyuser = applyuser;
		this.status = status;
		this.applychannel = applychannel;
		this.branch = branch;
		this.applystarttime = applystarttime;
		this.applyendtime = applyendtime;
		this.filename = filename;
		this.filepath = filepath;
		this.number = number;
		this.message = message;
		this.createtime = createtime;
		this.refusereason = refusereason;
		this.dataCheck = dataCheck;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public void setApplyuser(String applyuser) {
		this.applyuser = applyuser;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getApplychannel() {
		return applychannel;
	}

	public void setApplychannel(String applychannel) {
		this.applychannel = applychannel;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Date getApplystarttime() {
		return applystarttime;
	}

	public void setApplystarttime(Date applystarttime) {
		this.applystarttime = applystarttime;
	}

	public Date getApplyendtime() {
		return applyendtime;
	}

	public void setApplyendtime(Date applyendtime) {
		this.applyendtime = applyendtime;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getRefusereason() {
		return refusereason;
	}

	public void setRefusereason(String refusereason) {
		this.refusereason = refusereason;
	}

	public String getDataCheck() {
		return dataCheck;
	}

	public void setDataCheck(String dataCheck) {
		this.dataCheck = dataCheck;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ApplyChannelChange [id=" + id + ", applyuser=" + applyuser + ", status=" + status + ", applychannel="
				+ applychannel + ", branch=" + branch + ", applystarttime=" + applystarttime + ", applyendtime="
				+ applyendtime + ", filename=" + filename + ", filepath=" + filepath + ", number=" + number
				+ ", message=" + message + ", createtime=" + createtime + ", refusereason=" + refusereason
				+ ", dataCheck=" + dataCheck + "]";
	}
    

}