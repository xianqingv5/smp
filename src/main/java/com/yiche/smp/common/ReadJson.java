/**
 *
 */
package com.yiche.smp.common;

import java.io.InputStream;

import com.alibaba.fastjson.JSON;

/**
 * 说明:json处理
 *
 * @author wangyubing
 * @version 1.0
 * <p>
 * 2017年11月7日下午4:14:33
 */
public class ReadJson {

    private ReadJson() {
    }

    //获取配置文件实体
    public static String readConfig(String jsonName) {
        InputStream inputStream = ReadJson.class.getClassLoader().getResourceAsStream(jsonName);
        if (inputStream != null) {
            String string = IOUtil.readAsString(inputStream, true);
            //序列化对象
            //httpConfig = JSON.parseObject(string, HttpConfig.class);
            return string;
        }
        return null;
    }
}
