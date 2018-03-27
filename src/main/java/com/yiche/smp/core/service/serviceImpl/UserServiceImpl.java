package com.yiche.smp.core.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiche.smp.common.CluesTrend.THead;
import com.yiche.smp.common.uploadexcel.ReplaceVo;
import com.yiche.smp.core.service.UserService;

import com.yiche.smp.domain.User;
import com.yiche.smp.domain.UserExample;
import com.yiche.smp.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userMapper;

	@Override
	public List<ReplaceVo> selectUser() {
		UserExample example = new UserExample();
		//example.createCriteria().andRoleEqualTo(1);
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(11);
		example.createCriteria().andRoleIn(values);
		List<User> list = userMapper.selectByExample(example);
		 List <ReplaceVo> lists = new ArrayList <>();
		for (User user : list) {
			
			lists.add(new ReplaceVo(user.getUserid(), user.getUsername()));
		}
		return lists;
	}

	@Override
	public List<User> selectUserByRole() {
		UserExample example = new UserExample();
		//example.createCriteria().andRoleEqualTo(1);
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(11);
		example.createCriteria().andRoleIn(values);
		List<User> list = userMapper.selectByExample(example);
		return list;
	}

}
