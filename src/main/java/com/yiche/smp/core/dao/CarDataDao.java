package com.yiche.smp.core.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/5
 */
@FeignClient(value = "${report.server.name}")
public interface CarDataDao {
    @RequestMapping(value = "/metadata/enum/getDetailByPrefix/total?prefix=carmodel", method = RequestMethod.GET)
    String findAllCarType();

    @RequestMapping(value = "/metadata/enum/getInfoByPrefix/total?prefix=carmake", method = RequestMethod.GET)
    String findAllManufacturer();

    @RequestMapping(value = "/metadata/enum/getInfoByChildKey", method = RequestMethod.GET)
    String findBrandByid(@RequestParam(value = "childKey") String childKey);

    @RequestMapping(value = "/metadata/enum/getInfoByParentKey", method = RequestMethod.GET)
    String findAllCarTypeByid(@RequestParam(value = "parentKey") String parentKey);

    @RequestMapping(value = "/metadata/enum/getInfoByPrefix/total?prefix=carbrand", method = RequestMethod.GET)
    String findAllBrandData();
}
