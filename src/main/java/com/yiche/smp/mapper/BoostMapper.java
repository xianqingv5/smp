package com.yiche.smp.mapper;

import com.yiche.smp.common.boostVo.BoostSequence;
import com.yiche.smp.common.boostVo.BoostVO;
import com.yiche.smp.domain.Boost;
import com.yiche.smp.domain.BoostExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface BoostMapper {

    int countByExample(@Param("currentYear") String currentYear);
    //补量申请人员查看自己的申请列表
    List<Boost> selectOwnApplyList(@Param("userId")String userId);
    //申请部门审核岗查看该部门要审核【从未审核过】的列表
    List<Boost> selectAppltDeptUnCheckList(@Param("dept")String dept);
    //申请部门审核岗查看该部门审核【已审核过--通过】的列表
    List<Boost> selectAppltDeptCheckList(@Param("dept")String dept);
    //补量实施部门操作岗查询要审核【从未审核过】列表
    List<Boost> selectCarryDeptOptionUnCheckList();
    //补量实施部门操作岗查询审核【审核过--通过】列表
    List<Boost> selectCarryDeptOptionCheckList();
    //补量实施部门审核岗查看要处理列表【从未审核过】
    List<Boost> selectCarryDeptAuditUnCheckList();
    //补量实施部门审核岗查看处理【审核过---通过】列表
    List<Boost> selectCarryDeptAuditCheckList();
    //修改审核信息
    int updateCheckMes(Boost boost);
   //申请部门的操作岗重新申请【信息修改的方法】
    int updateByPrimaryKeySelective(BoostVO record);
    //根据补量申请ID删除该条记录
    int deleteByPrimaryKey(Integer id);
    //查看补量申请详情【根据补量ID】
    Boost selectByPrimaryKey(Integer id);
    //添加补量申请单
    int insertSelective(BoostVO record);
    //生成申请单序号
    int createApplySeq(BoostSequence boostSequence);
    //设置申请单序号从1开始生成
    int reTruncate();
   //再次申请表单回显
    BoostVO selectBoostVoById(Boost boost);
    int deleteByExample(BoostExample example);

    int insert(Boost record);



    List<Boost> selectByExample(BoostExample example);



    int updateByExampleSelective(@Param("record") Boost record, @Param("example") BoostExample example);

    int updateByExample(@Param("record") Boost record, @Param("example") BoostExample example);



    int updateByPrimaryKey(Boost record);
}