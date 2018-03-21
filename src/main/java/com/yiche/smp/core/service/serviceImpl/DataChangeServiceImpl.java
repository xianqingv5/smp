package com.yiche.smp.core.service.serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yiche.smp.common.BoostApplyStatus;
import com.yiche.smp.common.DateParseUtil;
import com.yiche.smp.common.UserRoot;
import com.yiche.smp.common.datachange.ApplyData;
import com.yiche.smp.core.service.DataChangeService;
import com.yiche.smp.domain.ApplyChannelChange;
import com.yiche.smp.domain.ApplyChannelChangeExample;
import com.yiche.smp.domain.Boost;
import com.yiche.smp.domain.User;
import com.yiche.smp.domain.UserPower;
import com.yiche.smp.mapper.ApplyChannelChangeMapper;
import com.yiche.smp.mapper.UserMapper;

@Service
@Transactional
public class DataChangeServiceImpl implements DataChangeService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ApplyChannelChangeMapper applyMapper;
	@Override
	public Integer applyDataSubmit(ApplyData applyData, Map<String,String> map, HttpSession session) {
		ApplyChannelChange  change = new ApplyChannelChange();
		change.setApplyuser(applyData.getUserid());
		change.setApplychannel(applyData.getPlatform());
		try {
			change.setApplystarttime(new SimpleDateFormat("yyyy-MM-dd").parse(applyData.getStartTime()));
			change.setApplyendtime(new SimpleDateFormat("yyyy-MM-dd").parse(applyData.getEndTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User selectByPrimaryKey = userMapper.selectByPrimaryKey(applyData.getUserid());
		change.setBranch(selectByPrimaryKey.getBrand());
		Date date = new Date();
		change.setCreatetime(date);
		change.setMessage(applyData.getMessage());
		change.setStatus(0);
		change.setFilepath(map.get("path"));
		change.setFilename(map.get("filename"));
		change.setRefusereason(null);
		
		 //获取编号的末位数字
        int num = 1;
        List <ApplyChannelChange> applies = applyMapper.selectAll();
        if (applies != null && applies.size() > 0) {
             ApplyChannelChange applyChannelChange = applies.get(applies.size() - 1);
            String number1 = applyChannelChange.getNumber();
            String[] split = number1.split("-");
            if (split[1].equals(DateParseUtil.dateTostring(new Date(), "yyyy"))) {
                num = Integer.parseInt(split[3]) + 1;
            }
        }
        //生成编号
        String number = "XZ-" + DateParseUtil.dateTostring(new Date(), "yyyy-MM-") + num;
		change.setNumber(number);
		int insert = applyMapper.insert(change);

		return insert;
	}
	@Override
	public List<ApplyChannelChange> selectAllByUserId(User user) {
		 if (user != null) {
	            Integer role = user.getRole();
	            //业务申请部操作员
	            if (role == UserRoot.USER_BLSQCZ.getCode()||role==UserRoot.USER_SJXZSS.getCode()) {
	                List <ApplyChannelChange> list = applyMapper.selectAppltDeptUnCheckList();
	                return list;
	            } else if (role == UserRoot.USER_BLSQSH.getCode()) {//业务申请部门审核员
	                List <ApplyChannelChange> list = applyMapper.selectCarryDeptOptionUnCheckList();
	                for (ApplyChannelChange applyChannelChange : list) {
	                	applyChannelChange.setWait("待处理");
					}
	                return list;
	            } else if (role == UserRoot.USER_SJXZSH.getCode()) {//数据监控部门审核员
	                List <ApplyChannelChange> list = applyMapper.selectCarryDeptAuditUnCheckList();
	                for (ApplyChannelChange applyChannelChange : list) {
	                	applyChannelChange.setWait("待处理");
					}
	                return list;
	            }else if (role==UserRoot.USER_ZJL.getCode()){  //总经理岗
	            	 List <ApplyChannelChange> list = applyMapper.selectCarryDeptOptionCheckList();
	            	 for (ApplyChannelChange applyChannelChange : list) {
		                	applyChannelChange.setWait("待处理");
						}
	            	 return list;
	            }
	        }
	        return null;
		
		

	}
	@Override
	public ApplyChannelChange selectOneById(int id) {
		ApplyChannelChange selectByPrimaryKey = applyMapper.selectByPrimaryKey(id);
		Integer status = selectByPrimaryKey.getStatus();
		if(status==0){
			selectByPrimaryKey.setPlan("待业务申请部进行审核");
		}else if(status==1){
			selectByPrimaryKey.setPlan("待数据管控部进行审核");
		}else if(status==2){
			selectByPrimaryKey.setPlan("待总经理进行审核");
		}else if(status==3){
			selectByPrimaryKey.setPlan("已完成");
		}else if(status==-1){
			selectByPrimaryKey.setPlan("业务申请部未通过");
		}else if(status==-2){
			selectByPrimaryKey.setPlan("数据管控部未通过");
		}else if(status==-3){
			selectByPrimaryKey.setPlan("总经理审核未通过");
		}
		return selectByPrimaryKey;
	}
	/*@Override
	public List<ApplyChannelChange> selectBoostHandelList(User user) {
		if (user != null) {
            Integer role = user.getRole();
            if (role == UserRoot.USER_BLSQCZ.getCode()) { // //补量申请人员查看自己的申请列表
            	ApplyChannelChangeExample example = new ApplyChannelChangeExample();
        		example.createCriteria().andApplyuserEqualTo(user.getUserid());
        		List<ApplyChannelChange> list = applyMapper.selectByExample(example);
        		return list;
            } else if (role == UserRoot.USER_BLSQSH.getCode()) { //申请部门审核岗查看该部门审核【已审核过--通过】的列表
                List <ApplyChannelChange> boosts = applyMapper.selectAppltDeptCheckList(user.getBrand());
                return boosts;
            } else if (role == UserRoot.USER_BLSSCZ.getCode()) {  //实施部门操作岗查询审核【审核过--通过】列表
                List <ApplyChannelChange> boosts = applyMapper.selectCarryDeptOptionCheckList();
                return boosts;
            } else if (role == UserRoot.USER_BLSSFH.getCode()) {   //实施部门审核岗查看处理【审核过---通过】列表
                List <ApplyChannelChange> boosts = applyMapper.selectCarryDeptAuditCheckList();
                return boosts;
            }
        }
        return null;
		
	}*/
	@Override
	public int changeCheckMes(ApplyChannelChange applyChannelChange, User user) {
		 String checkResult = applyChannelChange.getDataCheck();
	        Integer role = user.getRole();
	        //获取用户角色
	        if (role == UserRoot.USER_BLSQSH.getCode()) {
	            if ("true".equals(checkResult)) {
	            	applyChannelChange.setStatus(BoostApplyStatus.APPLY_DEPT_CHECK_PASS.getCode());
	            } else {
	            	applyChannelChange.setStatus(BoostApplyStatus.APPLY_DEPT_CHECK_UNPASS.getCode());
	            }

	        } else if (role == UserRoot.USER_SJXZSH.getCode()) {
	            if ("true".equals(checkResult)) {
	            	applyChannelChange.setStatus(BoostApplyStatus.CARRY_DEPT_OPTION_PASS.getCode());
	            } else {
	            	applyChannelChange.setStatus(BoostApplyStatus.CARRY_DEPT_OPTION_UNPASS.getCode());
	            }

	        } else if (role == UserRoot.USER_ZJL.getCode()) {
	            if ("true".equals(checkResult)) {
	            	applyChannelChange.setStatus(BoostApplyStatus.CARRY_DEPT_AUDIT_PASS.getCode());
	            } else {
	            	applyChannelChange.setStatus(BoostApplyStatus.CARRY_DEPT_AUDIT_UNPASS.getCode());
	            }

	        }
	        int result = 0;
			try {
				result = applyMapper.updateCheckMes(applyChannelChange);
			} catch (Exception e) {
				e.printStackTrace();
			}
	        
	        return result;
	}

}
