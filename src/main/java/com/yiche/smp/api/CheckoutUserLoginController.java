package com.yiche.smp.api;

import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.UserLoginService;
import com.yiche.smp.domain.UserPower;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/6
 */
@RestController
@Api("用户信息")
public class CheckoutUserLoginController {

    private Logger logger = LoggerFactory.getLogger(CheckoutUserLoginController.class);

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "/intelligent/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("用户登录接口")
    public ResultResponse userLogin(@RequestBody UserPower userFrom, HttpSession session) {
        try {
            if (userFrom != null) {
                UserPower userPower = userLoginService.checkoutUserLogin(userFrom);
                //if
                if (userPower != null) {
                    userPower.setPassword(null);
                    session.setAttribute("user", userPower);
                    session.setAttribute(userPower.getToken(), userPower);
                    session.setMaxInactiveInterval(1 * 60 * 30);
                    //此易车域名正确
                    return ResultResponse.success(userPower);
                }
            }
        } catch (IOException e) {
            logger.error("内部错误");
            e.printStackTrace();
        }
        return ResultResponse.error("登陆失败");
    }

    @RequestMapping(value = "/intelligent/loginOut", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8")
    @ApiOperation(value = "用户登出接口")
    public ResultResponse loginOut(HttpSession session, @RequestBody Map<String, String> map) {
        //清空session缓存;
        session.invalidate();
        session.setMaxInactiveInterval(0);
        return ResultResponse.success();
    }
}
