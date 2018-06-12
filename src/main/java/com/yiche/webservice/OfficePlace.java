
package com.yiche.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>OfficePlace complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OfficePlace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SortNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficePlace", propOrder = {
    "recID",
    "placeName",
    "level",
    "pid",
    "sortNumber",
    "status",
    "createTime",
    "createUserID",
    "fullPath"
})
public class OfficePlace {

    @XmlElement(name = "RecID")
    protected int recID;
    @XmlElement(name = "PlaceName")
    protected String placeName;
    @XmlElement(name = "Level", required = true, type = Integer.class, nillable = true)
    protected Integer level;
    @XmlElement(name = "PID")
    protected int pid;
    @XmlElement(name = "SortNumber", required = true, type = Integer.class, nillable = true)
    protected Integer sortNumber;
    @XmlElement(name = "Status", required = true, type = Integer.class, nillable = true)
    protected Integer status;
    @XmlElement(name = "CreateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID", required = true, type = Integer.class, nillable = true)
    protected Integer createUserID;
    @XmlElement(name = "FullPath")
    protected String fullPath;

    /**
     * ��ȡrecID���Ե�ֵ��
     * 
     */
    public int getRecID() {
        return recID;
    }

    /**
     * ����recID���Ե�ֵ��
     * 
     */
    public void setRecID(int value) {
        this.recID = value;
    }

    /**
     * ��ȡplaceName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * ����placeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * ��ȡlevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * ����level���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * ��ȡpid���Ե�ֵ��
     * 
     */
    public int getPID() {
        return pid;
    }

    /**
     * ����pid���Ե�ֵ��
     * 
     */
    public void setPID(int value) {
        this.pid = value;
    }

    /**
     * ��ȡsortNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortNumber() {
        return sortNumber;
    }

    /**
     * ����sortNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortNumber(Integer value) {
        this.sortNumber = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * ��ȡcreateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * ����createTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * ��ȡcreateUserID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreateUserID() {
        return createUserID;
    }

    /**
     * ����createUserID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreateUserID(Integer value) {
        this.createUserID = value;
    }

    /**
     * ��ȡfullPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPath() {
        return fullPath;
    }

    /**
     * ����fullPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPath(String value) {
        this.fullPath = value;
    }

}
