
package com.yiche.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LoginResult�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="LoginResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="UserNotExist"/&gt;
 *     &lt;enumeration value="WrongPassword"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoginResult")
@XmlEnum
public enum LoginResult {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("UserNotExist")
    USER_NOT_EXIST("UserNotExist"),
    @XmlEnumValue("WrongPassword")
    WRONG_PASSWORD("WrongPassword"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    LoginResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginResult fromValue(String v) {
        for (LoginResult c: LoginResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
