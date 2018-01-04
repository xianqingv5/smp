package com.yiche.smp.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.boostVo.BoostVO;
import com.yiche.smp.core.service.BoostApplyService;
import com.yiche.smp.core.service.CarDataService;
import com.yiche.smp.core.service.TerritoryService;
import com.yiche.smp.domain.Boost;
import com.yiche.smp.domain.City;
import com.yiche.smp.domain.UserPower;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * funtion:补量申请的控制层
 *
 * @Author zhangjuanjuan
 * @Date 2017/12/6
 */
@RestController
@Api(value = "补量申请相关的控制层")
@RequestMapping("/intelligent")
public class BoostApplyController {
    private Logger logger = LoggerFactory.getLogger(BoostApplyController.class);
    @Autowired
    private BoostApplyService boostApplyService;
    @Autowired
    private CarDataService carTypeService;
    @Autowired
    private TerritoryService territoryService;
    @Autowired
    private CarDataService carDataService;

    @RequestMapping(value = "/submitApplyForm", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "补量申请表单添加")
    public ResultResponse addBoostApply(@RequestBody BoostVO boostApply, HttpSession session) {
        try {
            if (boostApply == null) {
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            //从session中获取用户信息
            UserPower user = (UserPower) session.getAttribute("user");
            if (user == null) {
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
            }
            reSetBoost(boostApply);
            boostApply.setStarttime(boostApply.getStarttime().replaceAll("-", "/"));
            boostApply.setFinishtime(boostApply.getFinishtime().replaceAll("-", "/"));
            Integer result = boostApplyService.addBoostApply(boostApply, user);
            if (result != 0) {
                return ResultResponse.success();
            }
        } catch (Exception e) {
            logger.info("补量申请信息添加失败{" + e.getMessage() + "}");
        }
        return ResultResponse.fail(ErrorCodeMessage.APPLY_MESSAGE_ADD_ERROR);
    }


    @RequestMapping(value = "/selectBoostApplyList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "我的补量页列表查询")
    @ResponseBody
    public ResultResponse selectBoostApplyList(HttpSession session) {
        //获取用户信息
        UserPower user = (UserPower) session.getAttribute("user");
        if (user == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
        }
        List<Boost> boosts = boostApplyService.selectBoostApplyList(user);
        Map<String, Object> map = new HashMap<>();
        map.put("data", boosts);
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/selectBoostHandelList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "补量处理列表页的列表查询")
    @ResponseBody
    public ResultResponse selectBoostHandelList(HttpSession session) {
        //获取用户信息
        UserPower user = (UserPower) session.getAttribute("user");
        if (user == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
        }
        List<Boost> boosts = boostApplyService.selectBoostHandelList(user);
        Map<String, Object> map = new HashMap<>();
        map.put("data", boosts);
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/selectBoostById", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "查询补量申请详情")
    @ResponseBody
    public ResultResponse selectBoostDetailById(@RequestBody Boost bt) {
        Boost boost = boostApplyService.selectBoostById(bt.getId());
        Map<String, Object> map = new HashMap<>();
        map.put("data", boost);
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/boostCheck", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "补量申请信息审核")
    @ResponseBody
    public ResultResponse boostCheck(@RequestBody Boost boost, HttpSession session) {
        try {
            //获取用户信息
            UserPower user = (UserPower) session.getAttribute("user");
            if (user == null) {
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
            }
            boostApplyService.changeCheckMes(boost, user);
            return ResultResponse.success();
        } catch (Exception e) {
            logger.info("补量信息审核失败{" + e.getMessage() + "}");
        }
        return ResultResponse.fail(ErrorCodeMessage.APPLY_MESSAGE_CHECK_ERROR);
    }

    @RequestMapping(value = "/boostReapply", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "重新提交申请的接口")
    public ResultResponse boostReapply(@RequestBody BoostVO boost) {
        try {
            reSetBoost(boost);
            int i = boostApplyService.boostReapply(boost);
            if (i != 0) {
                return ResultResponse.success();
            }
        } catch (Exception e) {
            logger.info("补量信息重新提交申请失败{" + e.getMessage() + "}");
        }
        return ResultResponse.fail(ErrorCodeMessage.APPLY_MESSAGE_ADD_ERROR);
    }

    @RequestMapping(value = "/dropBoostById", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "根据补量申请ID删除该条记录")
    public ResultResponse dropBoost(@RequestBody Boost boost) {
        if (boost == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        try {
            int i = boostApplyService.dropBoostById(boost);
            if (i != 0) {
                return ResultResponse.success();
            }
        } catch (Exception e) {
            logger.info("根据补量申请ID删除该条记录失败{" + e.getMessage() + "}");
        }
        return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_ERROR);
    }

    @RequestMapping(value = "/getBoostVoById", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "获取再次申请表单回显数据")
    public ResultResponse getBoostVoById(@RequestBody Boost boost) {
        BoostVO bt = boostApplyService.selectBoostVoById(boost);
        Boost bst = bt;
        bst.setCarmake(bt.getCarMakeId());
        bst.setCarbrand(bt.getCarBrandId());
        bst.setCarmodel(bt.getCarModelId());
        bst.setProvince(bt.getProvinceId());
        List<City> cityList = bt.getCityList();
        String[] cityIds = null;
        if (cityList != null) {
            cityIds = new String[cityList.size()];
            for (int i = 0; i < cityList.size(); i++) {
                cityIds[i] = cityList.get(i).getName();
            }
        }
        bst.setCityIds(cityIds);
        Map<String, Object> map = new HashMap<>();
        map.put("data", bst);
        return ResultResponse.success(map);
    }


    private void reSetBoost(BoostVO boostApply) {
        String carmake = boostApply.getCarmake();
        String province1 = boostApply.getProvince();
        String carbrand = boostApply.getCarbrand();
        //查询所属的品牌
        String brandByid = carTypeService.findAllBrandData();
        boostApply.setCarBrandId(boostApply.getCarbrand());
        boostApply.setCarbrand(getJsonName(brandByid, carbrand));
        //查询品牌下所有的厂商
        String json = carTypeService.findAllCarTypeByid(carbrand);
        boostApply.setCarMakeId(carmake);
        boostApply.setCarmake(getJsonName(json, carmake));
        //查询厂商下所有的车系车型
        String CarTypeByid = carTypeService.findAllCarTypeByid(carmake);
        boostApply.setCarModelId(boostApply.getCarmodel());
        boostApply.setCarmodel(getJsonName(CarTypeByid, boostApply.getCarmodel()));
        //查询所有省份
        String province = territoryService.findProvince();
        boostApply.setProvinceId(province1);
        boostApply.setProvince(getJsonName(province, boostApply.getProvince()));
        //当前省级下的市级数据
        String allCarTypeByid = carDataService.findAllCarTypeByid(province1);
        boostApply.setCityList(getJsonCityName(allCarTypeByid, boostApply.getCityIds(), boostApply.getProvince(), boostApply.getProvinceId()));
    }

    private String getJsonName(String json, String id) {
        JSONArray jsonArray = JSON.parseObject(json).getJSONArray("data");
        for (int i = 0; i < jsonArray.size(); i++) {
            if (jsonArray.getJSONObject(i).getString("id").equals(id)) {
                return jsonArray.getJSONObject(i).getString("name");
            }
        }
        return null;
    }

    private List<City> getJsonCityName(String json, String[] ids, String province, String provinceId) {
        List<City> list = new ArrayList<>();
        JSONArray jsonArray = JSON.parseObject(json).getJSONArray("data");
        if (jsonArray != null && jsonArray.size() > 0) {
            for (int i = 0; i < ids.length; i++) {
                for (int j = 0; j < jsonArray.size(); j++) {
                    if (jsonArray.getJSONObject(j).getString("id").equals(ids[i])) {
                        list.add(JSON.parseObject(jsonArray.getJSONObject(j).toJSONString(), City.class));
                        continue;
                    }
                }
            }
        } else {
            City city = new City();
            city.setId(provinceId);
            city.setName(province);
            list.add(city);
        }

        return list;
    }

}
