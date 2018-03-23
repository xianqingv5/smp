package com.yiche.smp.common.datachange;

import java.util.List;

import com.yiche.smp.domain.ApplyChannelChange;

public class DataRole {
private List<ApplyChannelChange> list;
private int role;
public List<ApplyChannelChange> getList() {
	return list;
}
public void setList(List<ApplyChannelChange> list) {
	this.list = list;
}
public int getRole() {
	return role;
}
public void setRole(int role) {
	this.role = role;
}

}
