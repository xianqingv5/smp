package com.yiche.smp.common;

import java.io.Serializable;

/**
 * 返回前端的数据类型
 */
public class ResultResponse implements Serializable {
    private static final long serialVersionUID = -7092946994994265411L;
    private int code;
    private String msg;
    private Object result;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public ResultResponse(int code, String msg, Object result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }


    public static ResultResponse success() {
        return new ResultResponse(0, "success", null);
    }

    public static ResultResponse success(Object object) {
        return new ResultResponse(0, "success", object);
    }

    public static ResultResponse error() {
        return new ResultResponse(500, "fail", null);
    }

    public static ResultResponse fail(ErrorCodeMessage param) {
        return new ResultResponse(param.getCode(), param.getMsg(), null);
    }

    public static ResultResponse error(String msg) {
        return new ResultResponse(500, msg, null);
    }


    public String toString() {
        return "ResultResponse{code=" + this.code + ", msg='" + this.msg + '\'' + ", result=" + this.result + '}';
    }
}
