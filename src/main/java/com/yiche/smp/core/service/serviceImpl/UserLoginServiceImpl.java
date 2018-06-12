package com.yiche.smp.core.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.yiche.smp.common.Httpclient;
import com.yiche.smp.core.service.UserLoginService;
import com.yiche.smp.domain.User;
import com.yiche.smp.domain.UserPower;
import com.yiche.smp.mapper.UserMapper;
import com.yiche.webservice.LoginResult;
import com.yiche.webservice.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.UUID;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/6
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private Httpclient httpclient;

    @Override
    public UserPower checkoutUserLogin(UserPower userFrom) throws IOException {
        //check user is not exist
        UserPower userPower = null;
        //String s = httpclient.get(userFrom.getUsername(), userFrom.getPassword());
        LoginResult login = new LoginService().getLoginServiceSoap().login(userFrom.getUsername(),userFrom.getPassword());
        
        if("SUCCESS".equals(login.name())){
        	
        
      //  if (Integer.valueOf(JSON.parseObject(s).getString("code")) == 0) {
            //请求数据库获取此用户的信息
            User user = userMapper.selectByPrimaryKey(userFrom.getUsername());
            if (user != null) {
                userPower = new UserPower();
                userPower.setToken(UUID.randomUUID().toString().replace("-", ""));
                userPower.setUserid(user.getUserid());
                userPower.setUsername(user.getUsername());
                userPower.setRole(user.getRole());
                userPower.setBrand(user.getBrand());
            }
        }
        return userPower;
    }
}