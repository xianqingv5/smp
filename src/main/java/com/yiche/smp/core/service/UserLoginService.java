package com.yiche.smp.core.service;

import com.yiche.smp.domain.UserPower;

import java.io.IOException;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/6
 */
public interface UserLoginService {

    UserPower checkoutUserLogin(UserPower userFrom) throws IOException;
}
