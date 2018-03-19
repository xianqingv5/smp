package com.yiche.smp.common;

public enum DataName {
	NameError(1,"平台名称无效"),DateError(2,"日期无效"),UserError(3,"不是有效的易车域账号"),DiffError(4,"请正确填写数据归属人帐号"),NobelongError(5,"请上传自己的数据文件"),ChooseError(6,"请选择正确的日期上传"),FileError(7,"文件内日期时间错误"),FileFormatError(8,"文件格式错误");
	private int code;
	private String msg;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private DataName(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	

}
