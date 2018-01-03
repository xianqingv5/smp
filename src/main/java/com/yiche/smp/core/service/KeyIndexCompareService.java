package com.yiche.smp.core.service;

import com.yiche.smp.domain.KeyTargetCompare;

import java.util.List;
import java.util.Map;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/11
 */
public interface KeyIndexCompareService {
   /* @Deprecated
    Map <String, Object> keyIndexCompare(Integer platform, String date);*/

    Map <String, Object> keyTargetCompare(String platform, String date);
}
