package com.yiche.smp.mapper;

import com.yiche.smp.domain.ApplyChannelChange;
import com.yiche.smp.domain.ApplyChannelChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyChannelChangeMapper {
    int countByExample(ApplyChannelChangeExample example);

    int deleteByExample(ApplyChannelChangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplyChannelChange record);

    int insertSelective(ApplyChannelChange record);

    List<ApplyChannelChange> selectByExample(ApplyChannelChangeExample example);

    ApplyChannelChange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApplyChannelChange record, @Param("example") ApplyChannelChangeExample example);

    int updateByExample(@Param("record") ApplyChannelChange record, @Param("example") ApplyChannelChangeExample example);

    int updateByPrimaryKeySelective(ApplyChannelChange record);

    int updateByPrimaryKey(ApplyChannelChange record);

	List<ApplyChannelChange> selectAll();

	
	//申请部门操作岗查看所有状态的申请表
	List<ApplyChannelChange> selectAppltDeptUnCheckList();
	//业务部门审查岗查询要审核列表
	List<ApplyChannelChange> selectCarryDeptOptionUnCheckList();
	//数据监控审核岗查看要处理列表【从未审核过】
	List<ApplyChannelChange> selectCarryDeptAuditUnCheckList();
	//经理岗查询审核【从未审核过】列表
	List<ApplyChannelChange> selectCarryDeptOptionCheckList();
	
	
	
	//申请部门审核岗查看该部门审核【已审核过--通过】的列表
	List<ApplyChannelChange> selectAppltDeptCheckList(@Param("brand") String brand);
	 //实施部门审核岗查看处理【审核过---通过】列表
	List<ApplyChannelChange> selectCarryDeptAuditCheckList();
	//修改申请状态
	int updateCheckMes(ApplyChannelChange applyChannelChange);
}