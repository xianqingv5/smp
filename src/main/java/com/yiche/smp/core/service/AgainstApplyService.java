package com.yiche.smp.core.service;

import com.yiche.smp.common.ApplyList;
import com.yiche.smp.domain.Apply;
import com.yiche.smp.domain.User;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/7.
 */
public interface AgainstApplyService {

    Integer SaveAgainstApply(Apply apply, User user);

    void updateByApply(Apply apply);

    Apply selectOneById(Integer id);

    List <ApplyList> selectAllByUserId(String userid);
}
