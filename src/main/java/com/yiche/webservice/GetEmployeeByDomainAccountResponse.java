
package com.yiche.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="GetEmployeeByDomainAccountResult" type="{http://tempuri.org/}Employee" minOccurs="0"/&gt;
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
    "getEmployeeByDomainAccountResult"
})
@XmlRootElement(name = "GetEmployeeByDomainAccountResponse")
public class GetEmployeeByDomainAccountResponse {

    @XmlElement(name = "GetEmployeeByDomainAccountResult")
    protected Employee getEmployeeByDomainAccountResult;

    /**
     * ��ȡgetEmployeeByDomainAccountResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getGetEmployeeByDomainAccountResult() {
        return getEmployeeByDomainAccountResult;
    }

    /**
     * ����getEmployeeByDomainAccountResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setGetEmployeeByDomainAccountResult(Employee value) {
        this.getEmployeeByDomainAccountResult = value;
    }

}
