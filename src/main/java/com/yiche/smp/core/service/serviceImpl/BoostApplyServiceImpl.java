package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.BoostApplyStatus;
import com.yiche.smp.common.DateParseUtil;
import com.yiche.smp.common.UserRoot;
import com.yiche.smp.common.boostVo.BoostSequence;
import com.yiche.smp.common.boostVo.BoostVO;
import com.yiche.smp.core.service.BoostApplyService;
import com.yiche.smp.domain.Boost;
import com.yiche.smp.domain.City;
import com.yiche.smp.domain.UserPower;
import com.yiche.smp.mapper.BoostMapper;
import com.yiche.smp.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * funtion:补量申请的业务实现类
 *
 * @Author zhangjuanjuan
 * @Date 2017/12/6
 */
@Service
@Transactional
public class BoostApplyServiceImpl implements BoostApplyService {
    @Autowired
    private BoostMapper boostMapper;
    @Autowired
    private CityMapper cityMapper;

    @Override
    public Integer addBoostApply(BoostVO boostApply, UserPower user) {
        BoostSequence boostSequence = new BoostSequence(null, "申请单序号");
        //获取补量申请表中数据总条数
        List <Boost> boosts = boostMapper.selectByExample(null);
        if (boosts != null && boosts.size() > 0) {
            //获取最新一条
            Boost boost = boosts.get(boosts.size() - 1);
            if (DateParseUtil.dateTostring(new Date(), "yyyy").equals(boost.getApplyYear())) {
                //获取申请单序号
                boostMapper.createApplySeq(boostSequence);
            } else {
                //重置申请单号从1开始
                boostMapper.reTruncate();
                boostMapper.createApplySeq(boostSequence);
            }
        } else {
            //获取申请单序号
            boostMapper.createApplySeq(boostSequence);
        }
        //生成补量申请编号【不是主键】
        String boostId = "BL-" + DateParseUtil.dateTostring(new Date(), "yyyy-MM-") + boostSequence.getSeqId();
        boostApply.setNumber(boostId);
        boostApply.setUserid(user.getUserid());
        boostApply.setBranch(user.getBrand());
        boostApply.setRefuseReason("");
        //初始状态
        boostApply.setStatus(0);
        Date applyDate = new Date();
        boostApply.setApplyTime(DateParseUtil.dateTostring(applyDate, "yyyy-MM-dd"));
        boostApply.setApplyYear(DateParseUtil.dateTostring(applyDate, "yyyy"));
        int result = boostMapper.insertSelective(boostApply);
        List <City> cityList = boostApply.getCityList();
        if (cityList != null && cityList.size() > 0) {
            //设置申请编号
            for (int i = 0; i < cityList.size(); i++) {
                cityList.get(i).setBoostid(boostApply.getId());
            }
            //批量添加城市信息
            result = cityMapper.addCityList(cityList);

        }
        return result;
    }

    @Override
    public List <Boost> selectBoostApplyList(UserPower user) {
        if (user != null) {
            Integer role = user.getRole();
            //业务审核员
            if (role == UserRoot.USER_BLSQSH.getCode()||role==UserRoot.USER_ROOT.getCode()) {
                List <Boost> boosts = boostMapper.selectAppltDeptUnCheckList(user.getBrand());
                return boosts;
            } else if (role == UserRoot.USER_BLSSCZ.getCode()) {//实施部门操作员
                List <Boost> boosts = boostMapper.selectCarryDeptOptionUnCheckList();
                return boosts;
            } else if (role == UserRoot.USER_BLSSFH.getCode()) {//实施部门审核员
                List <Boost> boosts = boostMapper.selectCarryDeptAuditUnCheckList();
                return boosts;
            }
        }
        return null;
    }

    @Override
    public List <Boost> selectBoostHandelList(UserPower user) {
        if (user != null) {
            Integer role = user.getRole();
            if (role == UserRoot.USER_BLSQCZ.getCode()||role==UserRoot.USER_ROOT.getCode()) {
                List <Boost> boosts = boostMapper.selectOwnApplyList(user.getUserid());
                return boosts;
            } else if (role == UserRoot.USER_BLSQSH.getCode()) {
                List <Boost> boosts = boostMapper.selectAppltDeptCheckList(user.getBrand());
                return boosts;
            } else if (role == UserRoot.USER_BLSSCZ.getCode()) {
                List <Boost> boosts = boostMapper.selectCarryDeptOptionCheckList();
                return boosts;
            } else if (role == UserRoot.USER_BLSSFH.getCode()) {
                List <Boost> boosts = boostMapper.selectCarryDeptAuditCheckList();
                return boosts;
            }
        }
        return null;
    }

    @Override
    public Boost selectBoostById(Integer boostId) {
        Boost boost = boostMapper.selectByPrimaryKey(boostId);
        return boost;
    }

    @Override
    public int changeCheckMes(Boost boost, UserPower user) {
        String checkResult = boost.getCheckResult();
        Integer role = user.getRole();
        //获取用户角色
        if (role == UserRoot.USER_BLSQSH.getCode()||role==UserRoot.USER_ROOT.getCode()) {
            if ("true".equals(checkResult)) {
                boost.setStatus(BoostApplyStatus.APPLY_DEPT_CHECK_PASS.getCode());
            } else {
                boost.setStatus(BoostApplyStatus.APPLY_DEPT_CHECK_UNPASS.getCode());
            }

        } else if (role == UserRoot.USER_BLSSCZ.getCode()) {
            if ("true".equals(checkResult)) {
                boost.setStatus(BoostApplyStatus.CARRY_DEPT_OPTION_PASS.getCode());
            } else {
                boost.setStatus(BoostApplyStatus.CARRY_DEPT_OPTION_UNPASS.getCode());
            }

        } else if (role == UserRoot.USER_BLSSFH.getCode()) {
            if ("true".equals(checkResult)) {
                boost.setStatus(BoostApplyStatus.CARRY_DEPT_AUDIT_PASS.getCode());
            } else {
                boost.setStatus(BoostApplyStatus.CARRY_DEPT_AUDIT_UNPASS.getCode());
            }

        }
        int result = boostMapper.updateCheckMes(boost);
        return result;
    }

    @Override
    public int boostReapply(BoostVO boost) {
        int result = 0;
        if (boost != null) {
            boost.setStatus(0);
            Date applyDate = new Date();
            boost.setApplyTime(DateParseUtil.dateTostring(applyDate, "yyyy-MM-dd"));
            boost.setApplyYear(DateParseUtil.dateTostring(applyDate, "yyyy"));
            //重新申请时把这些置空
            boost.setUploadfilepath("");
            boost.setRefuseReason("");
            List <City> cityList = boost.getCityList();
            //修改对应的城市信息
            if (cityList != null && cityList.size() > 0) {
                //因为获取不到主键【所以把补量对应的源城市信息删除，重新添加 】
                cityMapper.deleteCityList(boost.getId());
                for (int i = 0; i < cityList.size(); i++) {
                    cityList.get(i).setBoostid(boost.getId());
                }
                result = cityMapper.addCityList(cityList);
            }
        }
        result = boostMapper.updateByPrimaryKeySelective(boost);
        return result;
    }

    @Override
    public int dropBoostById(Boost boost) {
        //删除补量申请ID对应的城市信息
        cityMapper.deleteCityList(boost.getId());
        //删除该条补量信息
        int result = boostMapper.deleteByPrimaryKey(boost.getId());
        return result;
    }

    @Override
    public BoostVO selectBoostVoById(Boost boost) {
        BoostVO bt = boostMapper.selectBoostVoById(boost);
        return bt;
    }
}
