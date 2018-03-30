package com.yiche.smp.api;

import com.yiche.smp.common.DayReport.DayReport;
import com.yiche.smp.common.ReportCondition;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.YichePlatform;
import com.yiche.smp.core.service.DisplayWeekReportService;
import com.yiche.smp.mapper.DisplayWeekReportMapper;
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

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/16
 */
@RestController
@Api("周报展示")
public class DisplayWeekReportController {

    private Logger logger = LoggerFactory.getLogger(DisplayWeekReportController.class);

    @Autowired
    private DisplayWeekReportService displayWeekReportService;

    @RequestMapping(value = "/intelligent/weekreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台渠道周报展示功能")
    public ResultResponse showSumDayReportData(@RequestBody ReportCondition reportCondition){
        String startTime = reportCondition.getStartTime();
        String s = startTime.substring(0, 4);
        String s1= startTime.substring(4);
        int i = Integer.parseInt(s1);
        String week=s+"年"+"第"+i+"周";
        String week1 = preWeek(s,i);
        DayReport map = displayWeekReportService.selectSumDataWeek(week,week1);
        return ResultResponse.success(map);
    }
    @RequestMapping(value = "/intelligent/weekPlatformsumreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台总和周报展示功能")
    public ResultResponse showPlatformWeekReportData(@RequestBody ReportCondition reportCondition){
        String startTime = reportCondition.getStartTime();
        String s = startTime.substring(0, 4);
        String s1= startTime.substring(4);
        int i = Integer.parseInt(s1);
        String week=s+"年"+"第"+i+"周";
        String week1 = preWeek(s,i);
        List<DayReport> map = displayWeekReportService.getPlatformDataWeek(week,week1);
        return ResultResponse.success(map);

    }

    @RequestMapping(value = "/intelligent/weekPlatformreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("各个平台详细渠道周报展示功能")
    public ResultResponse showDayReportData(@RequestBody ReportCondition reportCondition) {
        String startTime = reportCondition.getStartTime();
        String platformName = reportCondition.getPlatformName();
        String s = startTime.substring(0, 4);
        String s1= startTime.substring(4);
        int i = Integer.parseInt(s1);
        String week=s+"年"+"第"+i+"周";
        String week1 = preWeek(s,i);
        Map<String, List<YichePlatform>> map = displayWeekReportService.getplatformChannelDataWeek(platformName,week,week1);
        return  ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/weekPcwapreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("Pcwap平台详细渠道周报展示功能")
    public ResultResponse showWeekPcwapReportData(@RequestBody ReportCondition reportCondition){
        String platformName = reportCondition.getPlatformName();
        String startTime = reportCondition.getStartTime();
        String s = startTime.substring(0, 4);
        String s1= startTime.substring(4);
        int i = Integer.parseInt(s1);
        String week=s+"年"+"第"+i+"周";
        if (platformName!=null){
            String week1 = preWeek(s,i);
            Map<String, List<YichePlatform>> map = displayWeekReportService.getPcwapchannelDataWeek(platformName,week,week1);
            return ResultResponse.success(map);
        }
        return ResultResponse.error();
    }
    @RequestMapping(value = "/intelligent/weekThirdPartyreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("第三方平台详细渠道周报展示功能")
    public ResultResponse showWeekThirdPartyReportData(@RequestBody ReportCondition reportCondition) {
        String platformName = reportCondition.getPlatformName();
        String startTime = reportCondition.getStartTime();
        String s = startTime.substring(0, 4);
        String s1= startTime.substring(4);
        int i = Integer.parseInt(s1);
        String week=s+"年"+"第"+i+"周";
        if (platformName!=null){
            String week1 = preWeek(s,i);
            Map<String, List<YichePlatform>> map = displayWeekReportService.getThirdPartychannelDataWeek(platformName,week,week1);
            return ResultResponse.success(map);
        }
        return ResultResponse.error();
    }

    /**
     * 获取选中周期的上一周
     * @param s,i
     * @return
     */
    public String preWeek(String s,int i){
        String week1=s+"年"+"第"+(i-1)+"周";
        return week1;
    }
}
