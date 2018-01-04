package com.yiche.smp.api;

import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.OverViewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 获取线索数据分析概览的数据
 */
@RestController
@Api(value = "线索数据分析概览相关数据")
@RequestMapping("/intelligent")
public class OverViewController {

    @Autowired
    private OverViewService overViewService;

    // private Logger logger = LoggerFactory.getLogger(OverViewController.class);

    @RequestMapping(value = "/getOverView", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "获取每月线索数据分析概览数据")
    public ResultResponse getOverViewMonthData(@RequestBody Map<String, String> map) {
        if (map == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        Map<String, Object> overView = overViewService.selectOverViewByYearMonth(map.get("monthData"));
        return ResultResponse.success(overView);
    }
}
