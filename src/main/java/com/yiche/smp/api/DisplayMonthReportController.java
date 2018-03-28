package com.yiche.smp.api;

import com.yiche.smp.common.DayReport.DayReport;
import com.yiche.smp.common.ReportCondition;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.YichePlatform;
import com.yiche.smp.core.service.DisplayMonthReportService;
import com.yiche.smp.mapper.DisplayMonthReportMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
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
    public ResultResponse showSumMonthReportData(@RequestBody ReportCondition reportCondition){
        String startTime = reportCondition.getStartTime();
        System.err.println("a"+"-"+startTime);
        String month=startTime;
        String month1 = preMonth(month);
        DayReport map = displayMonthReportService.selectSumDatamonth(month,month1);
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/monthPlatformsumreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("平台总和月报展示功能")
    public ResultResponse showPlatformWeekReportData(@RequestBody ReportCondition reportCondition){
        String startTime = reportCondition.getStartTime();
        System.err.println("b"+"-"+startTime);
        String month=startTime;
        String month1 = preMonth(month);
        List<DayReport> map = displayMonthReportService.getPlatformDatamonth(month,month1);
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/monthPlatformreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("各个平台详细渠道月报展示功能")
    public ResultResponse showMonthReportData(@RequestBody ReportCondition reportCondition) {
        String platformName = reportCondition.getPlatformName();
        String startTime = reportCondition.getStartTime();
        System.err.println("c"+"-"+startTime);
        String month=startTime;
        if (platformName!=null){
            String month1 = preMonth(month);
            Map<String, List<YichePlatform>> map = displayMonthReportService.getplatformChannelDataMonth("易车APP",month,month1);
            return  ResultResponse.success(map);
        }
        return ResultResponse.error();
    }

    @RequestMapping(value = "/intelligent/monthPcwapreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("Pcwap平台详细渠道月报展示功能")
    public ResultResponse showMonthPcwapReportData(@RequestBody ReportCondition reportCondition){
        String platformName = reportCondition.getPlatformName();
        String startTime = reportCondition.getStartTime();
        System.err.println("d"+"-"+startTime);
        String month=startTime;
        if (platformName!=null){
            String month1 = preMonth(month);
            Map<String, List<YichePlatform>> map = displayMonthReportService.getPcwapchannelDataMonth(platformName,month,month1);
            return ResultResponse.success(map);
        }
        return ResultResponse.error();
    }

    @RequestMapping(value = "/intelligent/monthThirdPartyreport", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("第三方平台详细渠道月报展示功能")
    public ResultResponse showThirdPartyReportData(@RequestBody ReportCondition reportCondition){
        String platformName = reportCondition.getPlatformName();
        String startTime = reportCondition.getStartTime();
        System.err.println("e"+"-"+startTime);
        String month=startTime;
        if (platformName!=null){
            String month1 = preMonth(month);
                        Map<String, List<YichePlatform>> map = displayMonthReportService.getThirdPartychannelDataMonth(platformName,month,month1);
            return ResultResponse.success(map);
        }
        return ResultResponse.error();
    }

    /**
     * 获取选中月份的之前一个月
     * @param month
     * @return
     */
    public  String preMonth(String month){
        String month1;
        Integer i = Integer.parseInt(month.substring(4));
        Integer year = Integer.parseInt(month.substring(0,4));
        if (i==1){
            month1=year-1+"12";
            return month1;
        }if (i>10){
            month1=year+""+(i-1);
            return month1;
        }else {
            month1=year+"0"+(i-1);
            return month1;
        }
    }


}
