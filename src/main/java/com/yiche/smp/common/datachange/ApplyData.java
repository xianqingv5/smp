package com.yiche.smp.common.datachange;

import java.util.Date;

public class ApplyData {
	private String userid;
	private String platform;
	private String startTime;
	private String  endTime;
	private String message;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ApplyData [userid=" + userid + ", platform=" + platform + ", startTime=" + startTime + ", endTime="
				+ endTime + ", message=" + message + "]";
	}
	public ApplyData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplyData(String userid, String platform, String startTime, String endTime, String message) {
		super();
		this.userid = userid;
		this.platform = platform;
		this.startTime = startTime;
		this.endTime = endTime;
		this.message = message;
	}
	

}
