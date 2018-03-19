package com.yiche.smp.api;

import com.yiche.smp.common.ReportCondition;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.YichePlatform;
import com.yiche.smp.core.service.DisplayWeekReportService;
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
    public ResultResponse showSumDayReportData(){

        Map<String, Object> map = displayWeekReportService.selectSumDataWeek();
        return ResultResponse.success(map);
    }
    @RequestMapping(value = "/intelligent/weekPlatformsumreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台总和周报展示功能")
    public ResultResponse showPlatformWeekReportData(){

        Map<String, Object> map = displayWeekReportService.getPlatformDataWeek();
        return ResultResponse.success(map);

    }

    @RequestMapping(value = "/intelligent/weekPlatformreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("各个平台详细渠道周报展示功能")
    public ResultResponse showDayReportData(@RequestBody ReportCondition reportCondition) {

        Map<String, List<YichePlatform>> map = displayWeekReportService.getplatformChannelDataWeek("易车APP");
        return  ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/weekPcwapreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("Pcwap平台详细渠道周报展示功能")
    public ResultResponse showDayPcwapReportData(@RequestBody ReportCondition reportCondition){
        if (reportCondition!=null){
            String platformName = reportCondition.getPlatformName();
            Map<String, List<YichePlatform>> map = displayWeekReportService.getPcwapchannelDataWeek(platformName);
            return ResultResponse.success(map);
        }
        return ResultResponse.error();
    }
}
