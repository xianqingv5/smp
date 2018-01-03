package com.yiche.smp.api;

import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.common.linechart.BrandName;
import com.yiche.smp.common.linechart.LineChart;
import com.yiche.smp.core.service.LineChartService;
import com.yiche.smp.domain.ChannelParameter;
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
import java.util.Map;

/**
 * Created by Lenovo on 2017/12/12.
 */
@RestController
@Api("品牌趋势折线图展示")
public class LineChartContrller {
    private Logger logger = LoggerFactory.getLogger(LineChartContrller.class);
    @Autowired
    private LineChartService lineChartService;

    @RequestMapping(value = "/intelligent/lineChart", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("查询展示品牌折现图")
    public ResultResponse getLineChart(@RequestBody ChannelParameter channelParameter) {
        if (channelParameter.getBrandName() == null || channelParameter.getMonthData() == null) {
            logger.error("查询展示品牌折现图传入的参数出现了空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        List <LineChart> lineCharts = lineChartService.getLineCharts(channelParameter.getBrandName(), channelParameter.getMonthData());
        HashMap <String, Object> map = new HashMap <>();
        map.put("data", lineCharts);
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/getBrandData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("初始化品牌列表")
    public ResultResponse getBrand(@RequestBody Map<String,Object> map1) {
        List <BrandName> brands = lineChartService.getBrands((String) map1.get("monthData"));
        List <BrandName> brandNames = StringUtil.chineseLineChartSort(brands);
        HashMap <String, Object> map = new HashMap <>();
        map.put("data", brandNames);
        return ResultResponse.success(map);
    }
}
