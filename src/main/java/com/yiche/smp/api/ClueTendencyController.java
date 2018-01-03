package com.yiche.smp.api;

import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.barchart.Barchart;
import com.yiche.smp.common.piechart.Piechart;
import com.yiche.smp.core.service.ClueTendencyService;
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
 * funtion:店均线索趋势
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
@RestController
@Api("柱状图饼图店均线索趋势")
public class ClueTendencyController {
    @Autowired
    private ClueTendencyService clueTendencyService;

    @RequestMapping(value = "/intelligent/barchart", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("根据年月查询店均线索趋势柱状图")
    private ResultResponse selectDataByMonth(@RequestBody Map <String, String> map) {
        if (CollectionUtil.notEmpty(map)) {
            String monthData = map.get("monthData");
            Barchart clueTendencyColumnar = clueTendencyService.selectDataByDate(monthData);
            Map <String, Object> result = new HashMap <>();
            result.put("data", clueTendencyColumnar);
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @RequestMapping(value = "/intelligent/piechart", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("根据年月查询店均线索趋势饼图")
    private ResultResponse selectDatatoPiechart(@RequestBody Map <String, String> map) {
        if (CollectionUtil.notEmpty(map)) {
            String monthData = map.get("monthData");
            Piechart piechart = clueTendencyService.selectDatatoPiechart(monthData);
            Map <String, Object> result = new HashMap <>();
            result.put("data", piechart);
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }
}
