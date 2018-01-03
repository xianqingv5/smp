package com.yiche.smp.common;

/**
 * 使用枚举类型的补量申请状态
 */
public enum BoostApplyStatus {
    APPLY_DEPT_UNCHECK(0, "业务申请部未审核状态"), APPLY_DEPT_CHECK_UNPASS(-1, "业务申请部审核未通过状态"), APPLY_DEPT_CHECK_PASS(1, "业务申请部审核通过状态"), CARRY_DEPT_OPTION_UNPASS(-2, "补量补量实施部门操作岗审核未通过"), CARRY_DEPT_OPTION_PASS(2, "补量实施部门操作岗审核通过"), CARRY_DEPT_AUDIT_UNPASS(-3, "补量实施部门审核岗审核未通过"), CARRY_DEPT_AUDIT_PASS(3, "补量实施部门审核岗审核通过"), CARRY_DEPT_OPTION_UPLOAD(4, "补量实施部门操作岗已上传文件");

    private String msg;
    private int code;

    private BoostApplyStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getCode() {
        return this.code;
    }

}
