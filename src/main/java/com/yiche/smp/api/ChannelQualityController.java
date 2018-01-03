package com.yiche.smp.api;

import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.channelPictureChart.Table2;
import com.yiche.smp.common.channelPictureChart.TotalData;
import com.yiche.smp.core.service.ChannelQualityService;
import com.yiche.smp.domain.ChannelParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by Lenovo on 2017/12/8.
 */
@RestController
@Api("预警—渠道质量评估—得分、表现")
@PropertySource("classpath:uploadFile.properties")
public class ChannelQualityController {
    private Logger logger = LoggerFactory.getLogger(ChannelQualityController.class);
    @Autowired
    private ChannelQualityService channelQualityService;

    @RequestMapping(value = "/intelligent/getChannelScoreData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("渠道表现")
    public ResultResponse getChannelExpression(@RequestBody ChannelParameter channelParameter) {
        if (channelParameter.getPlatName() == null || channelParameter.getMonthData() == null) {
            logger.info("获取渠道表现时传参出现了空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        TotalData totalData = channelQualityService.getTotalData(channelParameter.getPlatName(), channelParameter.getMonthData());
        HashMap <String, Object> map = new HashMap <>();
        map.put("data", totalData);
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/getChannelRankData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("渠道综合得分排名")
    public ResultResponse getTotalScoreRank(@RequestBody ChannelParameter channelParameter) {
        if (channelParameter.getPlatName() == null || channelParameter.getMonthData() == null) {
            logger.info("渠道综合得分排名时传参出现了空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        Table2 table = channelQualityService.getTotalScoreRank(channelParameter.getPlatName(), channelParameter.getMonthData());
        HashMap <String, Object> map = new HashMap <>();
        if (table == null) {
            return ResultResponse.success(map.put("data", null));
        }
        map.put("data", table);
        return ResultResponse.success(map);
    }
}
