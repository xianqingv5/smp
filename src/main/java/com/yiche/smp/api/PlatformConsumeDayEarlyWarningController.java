package com.yiche.smp.api;

import com.yiche.smp.common.EarlyWarningData;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.ConsumeDayEarlyWarningService;
import com.yiche.smp.domain.UserPower;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/15
 */
@RestController
@Api("每天预警")
public class PlatformConsumeDayEarlyWarningController {

    private Logger logger = LoggerFactory.getLogger(PlatformConsumeDayEarlyWarningController.class);

    @Autowired
    private ConsumeDayEarlyWarningService consumeDayEarlyWarningService;

    @RequestMapping(value ="/intelligent/dayEarlyWarning", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台消耗每天预警")
    public ResultResponse showplatformConsumeDayEarlyingWarningData(HttpServletRequest request){
        HttpSession session = request.getSession();
        //从session中获取用户信息
        UserPower user = (UserPower) session.getAttribute("user");
        if (user == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
        }
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH )+1;
        LocalDate now = LocalDate.now();
        String date =now.toString();
        String startTime=year+"-0"+month+"-01";
        String endTime=date;
        String month1=year+"-0"+month;

        List<EarlyWarningData> earlyWarningData = consumeDayEarlyWarningService.getEarlyWarningData("易车APP", startTime, endTime, month1);

        return ResultResponse.success(earlyWarningData);

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
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH )+1;
        int a=cal.get(Calendar.DAY_OF_MONTH);
        LocalDate now = LocalDate.now();
        String date =now.toString();
        String startTime=year+"-0"+month+"-01";
        String endTime=date;
        String month1=year+"-0"+month;
        EarlyWarningData consumeData = consumeDayEarlyWarningService.getMonthChannelConsumeData("易车APP", startTime, endTime, month1, a);
        return ResultResponse.success(consumeData);
    }


    @RequestMapping(value ="/intelligent/dayEarlyWarningData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台消耗每天预警-渠道详细数据")
    public ResultResponse showChannelConsumeDayEarlyingWarningData(HttpServletRequest request) {
        HttpSession session = request.getSession();
        //从session中获取用户信息
        UserPower user = (UserPower) session.getAttribute("user");
        if (user == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
        }
        LocalDate now = LocalDate.now();
        String date =now.toString();
        String startTime=date;
        String endTime=date;
        List<GatherYicheAPP> channelConsumeData = consumeDayEarlyWarningService.getChannelConsumeData("易车APP", startTime, endTime);
        return ResultResponse.success(channelConsumeData);
    }

/*    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH )+1;
        int a=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(a);

    }*/
}
