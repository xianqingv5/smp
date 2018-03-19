package com.yiche.smp.api;

import com.yiche.smp.common.ReportCondition;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.YichePlatform;
import com.yiche.smp.core.service.DisplayMonthReportService;
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
@Api("月报展示")
public class DisplayMonthReportController {

    private Logger logger = LoggerFactory.getLogger(DisplayMonthReportController.class);

    @Autowired
    private DisplayMonthReportService displayMonthReportService;

    @RequestMapping(value = "/intelligent/monthreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台渠道月报展示功能")
    public ResultResponse showSumMonthReportData(){
        Map<String, Object> map = displayMonthReportService.selectSumDatamonth();
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/monthPlatformsumreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台总和月报展示功能")
    public ResultResponse showPlatformWeekReportData(){

        Map<String, Object> map = displayMonthReportService.getPlatformDatamonth();
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/monthPlatformreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("各个平台详细渠道月报展示功能")
    public ResultResponse showDayReportData(@RequestBody ReportCondition reportCondition) {

        Map<String, List<YichePlatform>> map = displayMonthReportService.getplatformChannelDataMonth("易车APP");
        return  ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/monthPcwapreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("Pcwap平台详细渠道月报展示功能")
    public ResultResponse showDayPcwapReportData(@RequestBody ReportCondition reportCondition){
        if (reportCondition!=null){
            String platformName = reportCondition.getPlatformName();
            Map<String, List<YichePlatform>> map = displayMonthReportService.getPcwapchannelDataMonth(platformName);
            return ResultResponse.success(map);
        }
        return ResultResponse.error();
    }


}
