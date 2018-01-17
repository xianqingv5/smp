package com.yiche.smp.api;

import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.AvgCluesTendenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
@RestController
@Api("每月店均线索趋势报表")
public class AvgCluesTendenController {

    @Autowired
    private AvgCluesTendenService avgCluesTendenService;

    @ApiOperation("每月店均线索趋势数据")
    @RequestMapping(value = "/intelligent/getClueTrendData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    public ResultResponse cluesTenden(@RequestBody Map<String, String> map) {
        if (CollectionUtil.notEmpty(map)) {
            String monthData = map.get("monthData");
            Map<String, Object> result = new HashMap<>();
            result.put("data", avgCluesTendenService.getClueTrendData(monthData));
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }
}
