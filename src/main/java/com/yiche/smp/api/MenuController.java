package com.yiche.smp.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.UserRoot;
import com.yiche.smp.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取菜单栏数据
 */
@RestController
@Api(value = "菜单栏相关数据数据 ")
@RequestMapping("/intelligent")
public class MenuController {
    @Value(value = "classpath:/json/menuData.json")
    private Resource resource;
    private Logger logger = LoggerFactory.getLogger(MenuController.class);

    @RequestMapping(value = "/getMenuData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "获取菜单栏数据")
    public ResultResponse getMenuData(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Object resultData = null;
        BufferedReader br = null;
        try {
            //获取用户信息
            User user = (User) session.getAttribute("user");
            if (user == null) {
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
            }
            //获取用户角色
            Integer role = user.getRole();
            // 读取原始json文件
            br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            StringBuilder result = new StringBuilder();
            String s = "";
            while ((s = br.readLine()) != null) {
                result.append(s);
            }
            JSONObject dataJson = JSON.parseObject(result.toString());
            if (role == UserRoot.USER_BLSQCZ.getCode() || role == UserRoot.USER_BLSQSH.getCode()||role==UserRoot.USER_SJXZSH.getCode()||role==UserRoot.USER_SJXZSS.getCode()) {
                JSONArray data = dataJson.getJSONArray("data");// 找到data的json数组
                Map<String, Object> map = new HashMap<>();
                List<Object> list = new ArrayList<>();
                for (int i = 0; i < data.size(); i++) {
                    String name = data.getJSONObject(i).getString("name");
                    if ("销售数据分析".equals(name) || "补量".equals(name) || "预警".equals(name)||"数据修正".equals(name)||"业务数据上传".equals(name)) {
                        JSONObject jsonObject = data.getJSONObject(i);
                        list.add(jsonObject);
                    }
                }
                map.put("data", list);
                resultData = map;
            }
            /* else if(role==UserRoot.USER_SJXZSH.getCode()||role==UserRoot.USER_SJXZSS.getCode()){
            	JSONArray data = dataJson.getJSONArray("data");// 找到data的json数组
                Map<String, Object> map = new HashMap<>();
                List<Object> list = new ArrayList<>();
                for (int i = 0; i < data.size(); i++) {
                    String name = data.getJSONObject(i).getString("name");
                    if ("数据修正".equals(name) ) {
                        JSONObject jsonObject = data.getJSONObject(i);
                        list.add(jsonObject);
                    }
                }
                map.put("data", list);
                resultData = map;
            }*/
            else {
                resultData = dataJson;
            }
            ResultResponse.success();
            return ResultResponse.success(resultData);
        } catch (Exception e) {
            logger.error("获取菜单栏数据失败{" + e.getMessage() + "}");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                logger.error("读取菜单栏数据流关闭失败{" + e.getMessage() + "}");
            }
        }
        return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_ERROR);
    }


}
