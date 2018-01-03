package com.yiche.smp.api;

import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.common.early.warning.EarlyWarning;
import com.yiche.smp.common.early.warning.EarlyWarningPiece;
import com.yiche.smp.common.early.warning.ResultBrand;
import com.yiche.smp.common.euraka.data.Data;
import com.yiche.smp.core.service.EarlyWarningService;
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

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/25
 */
@RestController
@Api("预警模块")
public class EarlyWarningController {
    private Logger logger = LoggerFactory.getLogger(EarlyWarningController.class);
    @Autowired
    private EarlyWarningService earlyWarningService;

    @RequestMapping(value = "/intelligent/getWarnBrandData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("预警品牌接口")
    public ResultResponse findAllBrandNameByMonthData(@RequestBody Map <? super String, ? super Object> map) {
        try {
            if (CollectionUtil.notEmpty(map)) {
                String string = (String) map.get("monthData");
                if (StringUtil.notNull(string)) {
                    LinkedList <Data> resultBrands = earlyWarningService.findBrandNameByMonth(string);
                    LinkedList <Data> data = StringUtil.chineseSort(resultBrands);
                    map.clear();
                    map.put("data", data);
                    return ResultResponse.success(map);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultResponse.error();
        }
        return ResultResponse.error();
    }

    @RequestMapping(value = "/intelligent/getWarnClueData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("预警模块数据列表")
    public ResultResponse earlyWarningList(@RequestBody Map <? super String, ? super Object> map) {
        try {
            if (CollectionUtil.notEmpty(map)) {
                String string = (String) map.get("monthData");
                if (StringUtil.notNull(string)) {
                    EarlyWarning earlyWarning = earlyWarningService.earlyWarningList(string);
                    map.clear();
                    map.put("data", earlyWarning);
                    return ResultResponse.success(map);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultResponse.error();
        }
        return ResultResponse.error();
    }


    /*@RequestMapping(value = "/intelligent/getClueNumChart", method = RequestMethod.POST)
    @ApiOperation("预警模块柱状图")
    public ResultResponse earlyWarningBarchart(@RequestBody Map map) {
        try {
            if (CollectionUtil.notEmpty(map)) {
                String brandName = (String) map.get("brandName");
                String monthData = (String) map.get("monthData");
                if (StringUtil.notNull(monthData) && StringUtil.notNull(brandName)) {
                    Barchart barchart = earlyWarningService.earlyWarningBarchart(brandName, monthData);
                    map.clear();
                    map.put("data", barchart);
                    return ResultResponse.success(map);
                }
            }
        } catch (Exception e) {
            return ResultResponse.error();
        }
        return ResultResponse.error();
    }*/
    @RequestMapping(value = "/intelligent/getClueCompare", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("预警模块块图")
    public ResultResponse earlyWarningBarchart(@RequestBody Map <? super String, ? super Object> map) {
        try {
            if (CollectionUtil.notEmpty(map)) {
                String brandName = (String) map.get("brandName");
                String monthData = (String) map.get("monthData");
                if (StringUtil.notNull(monthData) && StringUtil.notNull(brandName)) {
                    List <EarlyWarningPiece> earlyWarnings = earlyWarningService.earlyWarningPieceList(brandName, monthData);
                    map.clear();
                    map.put("data", earlyWarnings);
                    return ResultResponse.success(map);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultResponse.error();
        }
        return ResultResponse.error();
    }
}
