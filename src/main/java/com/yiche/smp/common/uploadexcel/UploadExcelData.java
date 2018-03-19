package com.yiche.smp.common.uploadexcel;

public class UploadExcelData {
/**
 * 获取渠道上传文件的参数
 */
	private String opinion;
	private String userid;
	
	public UploadExcelData() {
		super();
		
	}
	public UploadExcelData(String opinion, String userid) {
		super();
		this.opinion = opinion;
		this.userid = userid;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
