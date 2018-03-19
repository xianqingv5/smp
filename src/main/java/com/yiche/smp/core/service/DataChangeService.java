package com.yiche.smp.core.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import com.yiche.smp.common.datachange.ApplyData;
import com.yiche.smp.domain.ApplyChannelChange;
import com.yiche.smp.domain.User;
import com.yiche.smp.domain.UserPower;

public interface DataChangeService {

	Integer applyDataSubmit(ApplyData applyData, Map<String,String> map, HttpSession session);

	List<ApplyChannelChange> selectAllByUserId(User user);

	ApplyChannelChange selectOneById(int a);

	//List<ApplyChannelChange> selectBoostHandelList(User user);
	  //修改审核信息
	int changeCheckMes(ApplyChannelChange applyChannelChange, User user);

}
