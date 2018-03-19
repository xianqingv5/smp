package com.yiche.smp.api;

import com.yiche.smp.common.Channel;
import com.yiche.smp.common.ReportCondition;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.ChannelNamesService;
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

/**
 * Created by xuhaiqiang on 2018/3/9
 */
@RestController
@Api("获得相应渠道的名称")
public class ChannelNamesController {

    private Logger logger = LoggerFactory.getLogger(ChannelNamesController.class);

    @Autowired
    private ChannelNamesService channelNamesService;

    @RequestMapping(value = "/intelligent/channelallnames", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("获取相应平台的所有渠道名称")
    public ResultResponse getChannelNames(@RequestBody ReportCondition reportCondition){
        if (reportCondition!=null){
            String platformName = reportCondition.getPlatformName();
            List<Channel> channels = channelNamesService.selectChannelNames(platformName);
            System.err.println(channels.size());
            return ResultResponse.success(channels);
        }
        return ResultResponse.error();
    }

}
