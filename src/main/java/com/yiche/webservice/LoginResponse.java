
package com.yiche.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoginResult" type="{http://tempuri.org/}LoginResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginResult"
})
@XmlRootElement(name = "LoginResponse")
public class LoginResponse {

    @XmlElement(name = "LoginResult", required = true)
    @XmlSchemaType(name = "string")
    protected LoginResult loginResult;

    /**
     * ��ȡloginResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LoginResult }
     *     
     */
    public LoginResult getLoginResult() {
        return loginResult;
    }

    /**
     * ����loginResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResult }
     *     
     */
    public void setLoginResult(LoginResult value) {
        this.loginResult = value;
    }

}
