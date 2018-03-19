package com.yiche.smp.core.service;

import java.util.List;

import com.yiche.smp.common.uploadexcel.ReplaceVo;
import com.yiche.smp.domain.User;


public interface UserService {

	 List<ReplaceVo> selectUser();

	List<User> selectUserByRole();
}
