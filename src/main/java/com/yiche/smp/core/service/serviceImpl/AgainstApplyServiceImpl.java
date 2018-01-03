package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.ApplyList;
import com.yiche.smp.common.DateParseUtil;
import com.yiche.smp.core.service.AgainstApplyService;
import com.yiche.smp.domain.Apply;
import com.yiche.smp.domain.User;
import com.yiche.smp.mapper.ApplyMapper;
import com.yiche.smp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Lenovo on 2017/12/7.
 */
@Service
@Transactional
public class AgainstApplyServiceImpl implements AgainstApplyService {
    @Autowired
    private ApplyMapper applyMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer SaveAgainstApply(Apply apply, User user) {
        //获取编号的末位数字
        int num = 1;
        List <Apply> applies = applyMapper.selectAll();
        if (applies != null && applies.size() > 0) {
            Apply apply1 = applies.get(applies.size() - 1);
            String number1 = apply1.getNumber();
            String[] split = number1.split("-");
            if (split[1].equals(DateParseUtil.dateTostring(new Date(), "yyyy"))) {
                num = Integer.parseInt(split[3]) + 1;
            }
        }
        //生成编号
        String number = "FZB-" + DateParseUtil.dateTostring(new Date(), "yyyy-MM-") + num;
        apply.setNumber(number);
        apply.setUserId(user.getUserid());
        apply.setBranch(user.getBrand());
        apply.setCreateTime(DateParseUtil.dateTodate(new Date(), "yyyy-MM-dd"));
//        设置初始状态为处理中
        apply.setStatus(0);
        return applyMapper.insert(apply);
    }

    public void updateByApply(Apply apply) {
        applyMapper.updateByPrimaryKey(apply);
    }

    @Override
    public Apply selectOneById(Integer id) {
        return applyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List <ApplyList> selectAllByUserId(String userid) {
        User user = userMapper.selectByPrimaryKey(userid);
        List <Apply> applies = null;
        //根据用户的角色类型查询相应的列表
        if (user.getRole() == 5) {
            applies = applyMapper.selectAllByUserId(userid);
        } else if (user.getRole() == 6) {
            applies = applyMapper.selectAll();
        } else {
            return null;
        }
        //封装为展示列表对象
        ArrayList <ApplyList> applyLists = new ArrayList <>();
        for (Apply apply : applies) {
            ApplyList applyList = new ApplyList();
            applyList.setApplyId(apply.getId());
            applyList.setApplyNumber(apply.getNumber());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(apply.getCreateTime());
            applyList.setApplyTime(format);
            applyList.setStatus(apply.getStatus());
            applyLists.add(applyList);
        }
        return applyLists;
    }

}
