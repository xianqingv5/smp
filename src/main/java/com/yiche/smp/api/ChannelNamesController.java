package com.yiche.smp.api;

import com.yiche.smp.common.Channel;
import com.yiche.smp.common.Platform1;
import com.yiche.smp.common.ReportCondition;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.ChannelNamesService;
import com.yiche.smp.mapper.ChannelNamesMapper;
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

import java.util.HashMap;
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
    @Autowired
    private ChannelNamesMapper channelNamesMapper;

    @RequestMapping(value = "/intelligent/channelallnames", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("获取相应平台的所有渠道名称")
    public ResultResponse getChannelNames(@RequestBody ReportCondition reportCondition){
        String platformName= reportCondition.getPlatformName();
        if (platformName!=null){
            List<Channel> channels = channelNamesService.selectChannelNames(platformName);
            System.err.println(channels.size());
            return ResultResponse.success(channels);
        }
        return ResultResponse.error();
    }

    @RequestMapping(value = "/intelligent/platformallnames", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("获取相应平台的所有平台名称")
    public ResultResponse getplatformNames(){
        //数据库没有全部的字段，通过对象设置进去。
        Platform1 platform1 = new Platform1();
        HashMap<String, List<Platform1>> map = new HashMap<>();
        List<Platform1> platform1s = channelNamesMapper.selectPlatformNames();
        platform1.setId(5);
        platform1.setPlatformName("全部");
        platform1s.add(platform1);
        map.put("data",platform1s);
        return ResultResponse.success(map);
    }

}
