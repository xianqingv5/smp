package com.yiche.smp.api;

import com.yiche.smp.common.*;
import com.yiche.smp.core.service.ConsumeDayEarlyWarningService;
import com.yiche.smp.domain.UserPower;
import com.yiche.smp.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/15
 */
@RestController
@Api("每天预警")
public class PlatformConsumeDayEarlyWarningController {

    private Logger logger = LoggerFactory.getLogger(PlatformConsumeDayEarlyWarningController.class);

    @Autowired
    private ConsumeDayEarlyWarningService consumeDayEarlyWarningService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value ="/intelligent/dayEarlyWarning", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台消耗每天预警")
    public ResultResponse showplatformConsumeDayEarlyingWarningData(HttpServletRequest request){
        HttpSession session = request.getSession();
        //从session中获取用户信息
        UserPower user = (UserPower) session.getAttribute("user");
        if (user == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
        }
        String platformName = userMapper.selectPlatformByUserId(user.getUserid());//通过用户的userI获取所对应的平台
        Map<String, String> date1 = getDate();
        String startTime = date1.get("startTime");//获取开始时间
        String month1 = date1.get("month1");//获取当前月
        LocalDate now = LocalDate.now();//获取当前时间,就是截止时间
        String date =now.toString();
        String endTime=date;
        Map<String, Object> map = consumeDayEarlyWarningService.getEarlyWarningData(platformName, startTime, endTime, month1);
        return ResultResponse.success(map);

    }
    @RequestMapping(value ="/intelligent/monthChannelConsume", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台消耗每天预警-当月渠道详细数据")
    public ResultResponse showMonthChannelConsumeData(HttpServletRequest request){
        HttpSession session = request.getSession();
        //从session中获取用户信息
        UserPower user = (UserPower) session.getAttribute("user");
        if (user == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
        }
        String platformName = userMapper.selectPlatformByUserId(user.getUserid());
        Calendar cal = Calendar.getInstance();
        int a=cal.get(Calendar.DAY_OF_MONTH);
        Map<String, String> date1 = getDate();
        String startTime = date1.get("startTime");
        String month1 = date1.get("month1");
        LocalDate now = LocalDate.now();
        String date =now.toString();
        String endTime=date;
        Map<String, Object> map = consumeDayEarlyWarningService.getMonthChannelConsumeData(platformName, startTime, endTime, month1, a);
        return ResultResponse.success(map);
    }


    @RequestMapping(value ="/intelligent/dayEarlyWarningData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台消耗每天预警-渠道详细数据")
    public ResultResponse showChannelConsumeDayEarlyingWarningData(@RequestBody ReportCondition reportCondition,HttpServletRequest request) {
        if (reportCondition!=null){
            String endTime1 = reportCondition.getEndTime();
            Map<String, Object> map = new HashMap<>();
            HttpSession session = request.getSession();
            //从session中获取用户信息
            UserPower user = (UserPower) session.getAttribute("user");
            if (user == null) {
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
            }
            String platformName = userMapper.selectPlatformByUserId(user.getUserid());
            String startTime=endTime1;
            String endTime=endTime1;
            List<GatherYicheAPP> channelConsumeData = consumeDayEarlyWarningService.getChannelConsumeData(platformName, startTime, endTime);
            map.put("data",channelConsumeData);
            return ResultResponse.success(map);
        }
        return ResultResponse.error("没有传递日期");
    }

    /**
     * 获取开始时间和当前月
     * @return
     */
    public Map<String,String> getDate(){
        HashMap<String, String> map = new HashMap<>();
        String startTime;
        String month1;
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH )+1;
        if (month>=10){
            startTime=year+"-"+month+"-01";
            month1=year+"-"+month;
        }else {
            startTime=year+"-0"+month+"-01";
            month1=year+"-0"+month;
        }
        map.put("startTime",startTime);
        map.put("month1",month1);
        return map;
    }
}
