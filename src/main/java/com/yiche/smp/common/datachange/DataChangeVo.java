package com.yiche.smp.common.datachange;

import java.util.List;

import com.yiche.smp.domain.ImpPlatform;
import com.yiche.smp.domain.User;

public class DataChangeVo {
	private List<User> applyUserList;
	private List<ImpPlatform> platFormList;
	public List<User> getApplyUserList() {
		return applyUserList;
	}
	public void setApplyUserList(List<User> applyUserList) {
		this.applyUserList = applyUserList;
	}
	public List<ImpPlatform> getPlatFormList() {
		return platFormList;
	}
	public void setPlatFormList(List<ImpPlatform> platFormList) {
		this.platFormList = platFormList;
	}
	@Override
	public String toString() {
		return "DataChangeVo [applyUserList=" + applyUserList + ", platFormList=" + platFormList + "]";
	}
	public DataChangeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataChangeVo(List<User> applyUserList, List<ImpPlatform> platFormList) {
		super();
		this.applyUserList = applyUserList;
		this.platFormList = platFormList;
	}
	
	
	
}
