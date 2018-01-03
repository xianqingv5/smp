package com.yiche.smp.api;

import com.yiche.smp.common.*;
import com.yiche.smp.core.service.AgainstApplyService;
import com.yiche.smp.domain.Apply;
import com.yiche.smp.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lenovo on 2017/12/6.
 */
@RestController
@Api("反作弊检查申请")
@PropertySource("classpath:uploadFile.properties")
public class AgainstApplyController {
    private Logger logger = LoggerFactory.getLogger(AgainstApplyController.class);
    @Autowired
    private AgainstApplyService againstApplyService;

    @RequestMapping(value = "/intelligent/inspectApplyInitData",produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "初始化反作弊申请表的下拉框")
    public String getAllSelectData() {
        return ReadJson.readConfig("againstData.json");
    }

    @RequestMapping(value = "/intelligent/submitInspectForm", method = RequestMethod.POST)
    @ApiOperation("保存反作弊申请")
    public ResultResponse save(@RequestBody Apply apply, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null || apply == null) {
            logger.info("保存反作弊申请时用户没登录或者表格内容为空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        Integer id = againstApplyService.SaveAgainstApply(apply, user);
        if (id == null || id == 0) {
            logger.info("保存反作弊申请失败，数据数写入失败");
            return ResultResponse.fail(ErrorCodeMessage.APPLY_MESSAGE_ADD_ERROR);
        } else {
            return ResultResponse.success();
        }
    }

    @RequestMapping(value = "/intelligent/getInspectList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8",method = RequestMethod.POST)
    @ApiOperation("获取我的反作弊申请列表")
    public ResultResponse getAgainstApplyList(HttpServletRequest request) {
        //获取用户信息
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            logger.info("获取反作弊申请列表时session中没有拿到用户对象");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        List <ApplyList> applyLists = againstApplyService.selectAllByUserId(user.getUserid());
        if (applyLists == null) {
            logger.info("获取反作弊申请列表时查询列表得到空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_FUNCTION_NO_ACCESS);
        }
        HashMap <String, Object> map = new HashMap <>();
        map.put("data", applyLists);
        return ResultResponse.success(map);
    }

    @RequestMapping(value = "/intelligent/lookInspectDetail", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8",method = RequestMethod.POST)
    @ApiOperation("获取展示详情")
    public ResultResponse getAgainstApplyInfo(@RequestBody Apply apply) {
        if (apply == null) {
            logger.info("获取展示详情时传参为空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        Apply apply1 = againstApplyService.selectOneById(apply.getId());
        logger.info("详情内容：" + apply1.toString());
        HashMap <String, Object> map = new HashMap <>();
        map.put("data", apply1);
        return ResultResponse.success(map);
    }

}
