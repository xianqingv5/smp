package com.yiche.smp.common;

import java.util.List;
import java.util.Map;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/6
 */
public class CollectionUtil {

    private CollectionUtil() {
    }

    public static boolean notEmpty(Map map) {
        return map != null && !map.isEmpty() && map.size() > 0;
    }

    public static boolean listNotNull(List list) {
        return list != null && list.size() > 0 && !list.isEmpty();
    }
}
