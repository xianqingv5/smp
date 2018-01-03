package com.yiche.smp.api;

import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.PutInStrategyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 投放策略
 */
@RestController
@Api("投放策略")
public class PutInStrategyController {

    @Autowired
    private PutInStrategyService putInStrategyService;

    @RequestMapping(value = "/intelligent/getPutStrategyTable", method = RequestMethod.POST)
    @ApiOperation("投放策略表格")
    public ResultResponse getPutStrategyTable() {
        return ResultResponse.success(putInStrategyService.getPutStrategyTable());
    }

    @RequestMapping(value = "/intelligent/getPutStrategyChart", method = RequestMethod.POST)
    @ApiOperation("投放策略折线图")
    public ResultResponse getPutStrategyChart() {
        return ResultResponse.success(putInStrategyService.getPutStrategyChart());
    }
}
