package com.yiche.smp.core.service;

import com.yiche.smp.common.boostVo.BoostVO;
import com.yiche.smp.domain.Boost;
import com.yiche.smp.domain.UserPower;

import java.util.List;

/**
 * funtion:补量申请的业务接口层
 *
 * @Author zhangjuanjuan
 * @Date 2017/12/6
 */
public interface BoostApplyService {
    //添加补量信息
    Integer addBoostApply(BoostVO boostApply, UserPower user);

    //补量申请页面列表展示
    List <Boost> selectBoostApplyList(UserPower user);

    //补量处理列表展示
    List <Boost> selectBoostHandelList(UserPower user);

    //根据ID查询信息
    Boost selectBoostById(Integer boostId);

    //修改审核信息
    int changeCheckMes(Boost boost, UserPower user);

    //重新申请补量信息【编辑信息】
    int boostReapply(BoostVO boost);

    //根据补量申请ID删除该条记录
    int dropBoostById(Boost boost);

    //再次提交申请表单回显
    BoostVO selectBoostVoById(Boost boost);
}
