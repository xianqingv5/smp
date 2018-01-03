package com.yiche.smp.api;

import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.core.service.KeyIndexCompareService;
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
 * funtion:渠道质量评估
 *
 * @Author wangyb
 * @Date 2017/12/11
 */
@RestController
@Api("关键环比数据")
public class KeyIndexCompareController {

    @Autowired
    private KeyIndexCompareService keyIndexCompareService;

    @ApiOperation("关键环比数据")
    @RequestMapping(value = "/intelligent/getImportIndexData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    public ResultResponse keyIndexCompare(@RequestBody Map <? extends String, ? extends String> map) {
        if (CollectionUtil.notEmpty(map)) {
            String platform = map.get("platName");
            String monthData = map.get("monthData");
            if (StringUtil.notNull(platform) && StringUtil.notNull(monthData)) {
                Map <String, Object> data = keyIndexCompareService.keyTargetCompare(platform, monthData);
                HashMap <String, Object> stringObjectHashMap = new HashMap <>();
                stringObjectHashMap.put("data", data);
                return ResultResponse.success(stringObjectHashMap);
            }
        }
        return ResultResponse.error();
    }
}
