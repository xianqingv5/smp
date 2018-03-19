package com.yiche.smp.api;

import com.github.pagehelper.PageInfo;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Page;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.ChannelConsumeReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.formula.functions.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/8
 */
@RestController
@Api("渠道消耗财务报表展示2")
public class ChannelConsumeReportController2 {

    private Logger logger = LoggerFactory.getLogger(ChannelConsumeReportController2.class);
    @Autowired
    private ChannelConsumeReportService channelConsumeReportService;

    @RequestMapping(value = "/intelligent/pageinfochannelconsume", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("渠道报表展示功能")
    public ResultResponse displayChannelConsumeReport(@RequestBody Page<T> page){
        if (page!=null){
            String platformName = page.getPlatformName();
            if (platformName==null){
                logger.info("查询数据时传参时平台名为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            //获取channelName
            String channelName = page.getChannelName();
            if (channelName==null){
                logger.info("查询数据导出报表时传参时渠道名为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            //获取开始时间
            String startTime = page.getStartTime();
            if (startTime==null){
                logger.info("查询数据时传参时开始时间为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            //获取结束时间
            String endTime = page.getEndTime();
            if (endTime==null){
                logger.info("查询数据时传参时结束时间为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            int isDetail = page.getIsDetail();
            Integer pageno = page.getPageno();
            Integer pagesize = page.getPagesize();

            PageInfo<GatherYicheAPP> channelConsumeReport = channelConsumeReportService.getChannelConsumeReport(platformName, channelName, startTime, endTime, isDetail, pageno, pagesize);
            return ResultResponse.success(channelConsumeReport);
        }
        return ResultResponse.error();
    }
}
