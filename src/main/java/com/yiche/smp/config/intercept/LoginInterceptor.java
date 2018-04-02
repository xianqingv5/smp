package com.yiche.smp.config.intercept;

import com.alibaba.fastjson.JSON;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.domain.UserPower;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * funtion:登录拦截器
 *
 * @Author wangyb
 * @Date 2017/12/14
 */
public class LoginInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //check user login
    	
        HttpSession session = request.getSession();
        UserPower user = (UserPower) session.getAttribute("user");
        if (user != null) {
            return true;
        }
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            ResultResponse result = new ResultResponse(8888, "被拦截", new Object());
            writer = response.getWriter();
            writer.print(JSON.toJSONString(result));
        } catch (IOException e) {
            logger.error("response error", e);
        } finally {
            if (writer != null)
                writer.close();
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    		
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
