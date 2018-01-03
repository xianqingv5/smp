package com.yiche.smp.common;

/**
 * 使用枚举类型来封装异常码和异常信息
 */
public enum ErrorCodeMessage {
    APPLY_MESSAGE_ADD_ERROR(1000, "申请信息提交申请失败"), APPLY_MESSAGE_CHECK_ERROR(1001, "审核失败"), DB_SERVICE_ERROR(9999, "服务器异常"), DB_SERVICE_UNKNOWN_ERROR(20101, "未知异常"), DB_SERVICE_NETWORK_ERROR(20103, "网络异常"), DB_SERVICE_INVALID_PARAMETER(20106, "方法参数错误"), DB_SERVICE_FUNCTION_NO_ACCESS(20107, "对此方法无访问权限"), DB_SERVICE_GET_USER_MESSAGE_ERROR(20108, "没有获取到用户登录信息,无访问权限");
    private String msg;
    private int code;

    private ErrorCodeMessage(int code, String msg) {
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
