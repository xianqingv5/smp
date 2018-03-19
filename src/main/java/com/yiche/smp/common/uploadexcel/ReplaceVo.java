package com.yiche.smp.common.uploadexcel;



public class ReplaceVo {
	private String userid;
	private String username;
	
	public ReplaceVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ReplaceVo(String userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
