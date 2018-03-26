package com.yiche.smp.api;

import com.yiche.smp.common.*;
import com.yiche.smp.common.DayReport.DayReport;
import com.yiche.smp.core.service.DisplayDayReportService;
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

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/9
 */

@RestController
@Api("日报展示")
public class DisplayDayReportController{

    private Logger logger = LoggerFactory.getLogger(DisplayDayReportController.class);
    @Autowired
    private DisplayDayReportService displayDayReportService;

    @RequestMapping(value = "/intelligent/dayreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台渠道日报展示功能")
    public ResultResponse showSumDayReportData(){
        Map<String, String> twoDay = getPreTwoDay();
        DayReport sumDataDay = displayDayReportService.getSumDataDay(twoDay.get("pre1"),twoDay.get("pre2"));
        return ResultResponse.success(sumDataDay);
    }

    @RequestMapping(value = "/intelligent/dayPlatformsumreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台总和日报展示功能")
    public ResultResponse showSumPlatformDayReportData(){
        Map<String, String> twoDay = getPreTwoDay();
        List<Object> platformDataDay = displayDayReportService.getPlatformDataDay(twoDay.get("pre1"),twoDay.get("pre2"));
        return ResultResponse.success(platformDataDay);
    }

    @RequestMapping(value = "/intelligent/dayPlatformreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("各个平台详细渠道日报展示功能")
    public ResultResponse showDayReportData(@RequestBody ReportCondition reportCondition) {
        String platformName = reportCondition.getPlatformName();
        if(platformName!=null){
            Map<String, String> twoDay = getPreTwoDay();
            Map<String, List<YichePlatform>> map = displayDayReportService.getplatformChannelDataDay(platformName,twoDay.get("pre1"),twoDay.get("pre2"));
            return ResultResponse.success(map);
        }
        return ResultResponse.error();
    }

    @RequestMapping(value = "/intelligent/dayPcwapreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("Pcwap平台详细渠道日报展示功能")
    public ResultResponse showDayPcwapReportData(@RequestBody ReportCondition reportCondition){
        String platformName = reportCondition.getPlatformName();
        if (platformName!=null){
            Map<String, String> twoDay = getPreTwoDay();
            Map<String, List<YichePlatform>> map = displayDayReportService.getPcwapchannelDataDay(platformName, twoDay.get("pre1"), twoDay.get("pre2"));
            return ResultResponse.success(map);
        }
        return ResultResponse.error();
    }

    /**
     * 日报的功能获取前两天的数据，根据java自带api获取当前日期，调用方法获取前两天日期
     * @return //返回前两天的集合
     */
    private Map<String,String> getPreTwoDay(){
        HashMap<String, String> map = new HashMap<>();
        //获取当前时间
        Date date = new Date();
        Date nowDate= DateParseUtil.getNextDay2(date);
        //获取前一天
        Date preDate1 = DateParseUtil.getNextDay1(nowDate);
        //获取前两天
        Date preDate2 = DateParseUtil.getNextDay1(preDate1);
        //转换成字符串
        String pre1 = DateParseUtil.dateTostring(preDate1, "yyyy-MM-dd");
        String pre2 = DateParseUtil.dateTostring(preDate2, "yyyy-MM-dd");
        map.put("pre1","2018-03-19");
        map.put("pre2","2018-03-18");
        return map;
    }




}
