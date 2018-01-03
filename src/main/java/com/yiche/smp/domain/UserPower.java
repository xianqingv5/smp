package com.yiche.smp.domain;

import java.io.Serializable;

/**
 * funtion:用户登录返回
 *
 * @Author wangyb
 * @Date 2017/12/11
 */
public class UserPower extends User implements Serializable {
    private static final long serialVersionUID = 4590842284280593396L;

    private String token;

    private String password;

    public UserPower() {
    }

    public UserPower(String token, String password) {
        this.token = token;
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserPower{" +
                "token='" + token + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
