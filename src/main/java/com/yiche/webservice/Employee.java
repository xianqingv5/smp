
package com.yiche.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Employee complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Employee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DomainAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://tempuri.org/}Department" minOccurs="0"/&gt;
 *         &lt;element name="Seat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TitleRank" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ManagerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DimissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OfficePlaceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OfficePlace" type="{http://tempuri.org/}OfficePlace" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLengthStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriateWorkStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegularWorkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastWorkDimissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="WorkCharacter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BirthDay" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = {
    "employeeID",
    "domainAccount",
    "password",
    "cnName",
    "enName",
    "nickName",
    "employeeNumber",
    "postTitle",
    "email",
    "telephone",
    "mobile",
    "department",
    "seat",
    "isActive",
    "titleRank",
    "managerNumber",
    "dimissionDate",
    "entryDate",
    "officePlaceID",
    "officePlace",
    "serviceLengthStartTime",
    "seriateWorkStartTime",
    "regularWorkDate",
    "lastWorkDimissionDate",
    "workCharacter",
    "birthDay",
    "idType",
    "idCode",
    "sex"
})
public class Employee {

    @XmlElement(name = "EmployeeID")
    protected int employeeID;
    @XmlElement(name = "DomainAccount")
    protected String domainAccount;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "CnName")
    protected String cnName;
    @XmlElement(name = "EnName")
    protected String enName;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "PostTitle")
    protected String postTitle;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Department")
    protected Department department;
    @XmlElement(name = "Seat")
    protected String seat;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "TitleRank")
    protected int titleRank;
    @XmlElement(name = "ManagerNumber")
    protected String managerNumber;
    @XmlElement(name = "DimissionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dimissionDate;
    @XmlElement(name = "EntryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "OfficePlaceID")
    protected int officePlaceID;
    @XmlElement(name = "OfficePlace")
    protected OfficePlace officePlace;
    @XmlElement(name = "ServiceLengthStartTime")
    protected String serviceLengthStartTime;
    @XmlElement(name = "SeriateWorkStartTime")
    protected String seriateWorkStartTime;
    @XmlElement(name = "RegularWorkDate")
    protected String regularWorkDate;
    @XmlElement(name = "LastWorkDimissionDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastWorkDimissionDate;
    @XmlElement(name = "WorkCharacter")
    protected int workCharacter;
    @XmlElement(name = "BirthDay", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDay;
    @XmlElement(name = "IDType")
    protected int idType;
    @XmlElement(name = "IDCode")
    protected String idCode;
    @XmlElement(name = "Sex")
    protected int sex;

    /**
     * ��ȡemployeeID���Ե�ֵ��
     * 
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * ����employeeID���Ե�ֵ��
     * 
     */
    public void setEmployeeID(int value) {
        this.employeeID = value;
    }

    /**
     * ��ȡdomainAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainAccount() {
        return domainAccount;
    }

    /**
     * ����domainAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainAccount(String value) {
        this.domainAccount = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * ��ȡcnName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * ����cnName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnName(String value) {
        this.cnName = value;
    }

    /**
     * ��ȡenName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnName() {
        return enName;
    }

    /**
     * ����enName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnName(String value) {
        this.enName = value;
    }

    /**
     * ��ȡnickName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * ����nickName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * ��ȡemployeeNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * ����employeeNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * ��ȡpostTitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTitle() {
        return postTitle;
    }

    /**
     * ����postTitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTitle(String value) {
        this.postTitle = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡtelephone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * ����telephone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * ��ȡmobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ����mobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * ��ȡdepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * ����department���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    /**
     * ��ȡseat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeat() {
        return seat;
    }

    /**
     * ����seat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeat(String value) {
        this.seat = value;
    }

    /**
     * ��ȡisActive���Ե�ֵ��
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * ����isActive���Ե�ֵ��
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * ��ȡtitleRank���Ե�ֵ��
     * 
     */
    public int getTitleRank() {
        return titleRank;
    }

    /**
     * ����titleRank���Ե�ֵ��
     * 
     */
    public void setTitleRank(int value) {
        this.titleRank = value;
    }

    /**
     * ��ȡmanagerNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerNumber() {
        return managerNumber;
    }

    /**
     * ����managerNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerNumber(String value) {
        this.managerNumber = value;
    }

    /**
     * ��ȡdimissionDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDimissionDate() {
        return dimissionDate;
    }

    /**
     * ����dimissionDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDimissionDate(XMLGregorianCalendar value) {
        this.dimissionDate = value;
    }

    /**
     * ��ȡentryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * ����entryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * ��ȡofficePlaceID���Ե�ֵ��
     * 
     */
    public int getOfficePlaceID() {
        return officePlaceID;
    }

    /**
     * ����officePlaceID���Ե�ֵ��
     * 
     */
    public void setOfficePlaceID(int value) {
        this.officePlaceID = value;
    }

    /**
     * ��ȡofficePlace���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OfficePlace }
     *     
     */
    public OfficePlace getOfficePlace() {
        return officePlace;
    }

    /**
     * ����officePlace���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OfficePlace }
     *     
     */
    public void setOfficePlace(OfficePlace value) {
        this.officePlace = value;
    }

    /**
     * ��ȡserviceLengthStartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLengthStartTime() {
        return serviceLengthStartTime;
    }

    /**
     * ����serviceLengthStartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLengthStartTime(String value) {
        this.serviceLengthStartTime = value;
    }

    /**
     * ��ȡseriateWorkStartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriateWorkStartTime() {
        return seriateWorkStartTime;
    }

    /**
     * ����seriateWorkStartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriateWorkStartTime(String value) {
        this.seriateWorkStartTime = value;
    }

    /**
     * ��ȡregularWorkDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularWorkDate() {
        return regularWorkDate;
    }

    /**
     * ����regularWorkDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularWorkDate(String value) {
        this.regularWorkDate = value;
    }

    /**
     * ��ȡlastWorkDimissionDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastWorkDimissionDate() {
        return lastWorkDimissionDate;
    }

    /**
     * ����lastWorkDimissionDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastWorkDimissionDate(XMLGregorianCalendar value) {
        this.lastWorkDimissionDate = value;
    }

    /**
     * ��ȡworkCharacter���Ե�ֵ��
     * 
     */
    public int getWorkCharacter() {
        return workCharacter;
    }

    /**
     * ����workCharacter���Ե�ֵ��
     * 
     */
    public void setWorkCharacter(int value) {
        this.workCharacter = value;
    }

    /**
     * ��ȡbirthDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDay() {
        return birthDay;
    }

    /**
     * ����birthDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDay(XMLGregorianCalendar value) {
        this.birthDay = value;
    }

    /**
     * ��ȡidType���Ե�ֵ��
     * 
     */
    public int getIDType() {
        return idType;
    }

    /**
     * ����idType���Ե�ֵ��
     * 
     */
    public void setIDType(int value) {
        this.idType = value;
    }

    /**
     * ��ȡidCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCode() {
        return idCode;
    }

    /**
     * ����idCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCode(String value) {
        this.idCode = value;
    }

    /**
     * ��ȡsex���Ե�ֵ��
     * 
     */
    public int getSex() {
        return sex;
    }

    /**
     * ����sex���Ե�ֵ��
     * 
     */
    public void setSex(int value) {
        this.sex = value;
    }

}
