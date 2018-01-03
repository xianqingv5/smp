package com.yiche.smp.common.euraka.data;


import java.io.Serializable;
import java.util.LinkedList;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/14
 */
public class EurekaDataDispose implements Serializable{
    private static final long serialVersionUID = 1346132699233057952L;

    private Integer code;

    private LinkedList<Data> data;

    private String message;

    public EurekaDataDispose(Integer code, LinkedList <Data> data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public EurekaDataDispose() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public LinkedList <Data> getData() {
        return data;
    }

    public void setData(LinkedList <Data> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EurekaDataDispose{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
