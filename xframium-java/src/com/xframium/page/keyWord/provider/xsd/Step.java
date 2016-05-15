//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.01 at 07:12:11 AM EDT 
//


package com.xframium.page.keyWord.provider.xsd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Step complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Step"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameter" type="{http://www.morelandlabs.com/testRegistry}Parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="token" type="{http://www.morelandlabs.com/testRegistry}Token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="step" type="{http://www.morelandlabs.com/testRegistry}Step" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="CALL"/&gt;
 *             &lt;enumeration value="CLICK"/&gt;
 *             &lt;enumeration value="EXISTS"/&gt;
 *             &lt;enumeration value="FUNCTION"/&gt;
 *             &lt;enumeration value="GESTURE"/&gt;
 *             &lt;enumeration value="RETURN"/&gt;
 *             &lt;enumeration value="SET"/&gt;
 *             &lt;enumeration value="VALUE"/&gt;
 *             &lt;enumeration value="GET"/&gt;
 *             &lt;enumeration value="WAIT"/&gt;
 *             &lt;enumeration value="WAIT_FOR"/&gt;
 *             &lt;enumeration value="ATTRIBUTE"/&gt;
 *             &lt;enumeration value="LOOP"/&gt;
 *             &lt;enumeration value="BREAK"/&gt;
 *             &lt;enumeration value="DEVICE"/&gt;
 *             &lt;enumeration value="FORK"/&gt;
 *             &lt;enumeration value="VISIBLE"/&gt;
 *             &lt;enumeration value="VERIFY_COLOR"/&gt;
 *             &lt;enumeration value="VERIFY_CONTRAST"/&gt;
 *             &lt;enumeration value="WINDOW"/&gt;
 *             &lt;enumeration value="EXECJS"/&gt;
 *             &lt;enumeration value="COMPARE"/&gt;
 *             &lt;enumeration value="STRING"/&gt;
 *             &lt;enumeration value="MATH"/&gt;
 *             &lt;enumeration value="MOUSE"/&gt;
 *             &lt;enumeration value="CACHE"/&gt;
 *             &lt;enumeration value="REPORT"/&gt;
 *             &lt;enumeration value="SYNC"/&gt;
 *             &lt;enumeration value="OPEN_PAGE"/&gt;
 *             &lt;enumeration value="ADD_COOKIE"/&gt;
 *             &lt;enumeration value="DELETE_COOKIE"/&gt;
 *             &lt;enumeration value="DELETE_COOKIES"/&gt;
 *             &lt;enumeration value="GET_COOKIE"/&gt;
 *             &lt;enumeration value="GET_COOKIES"/&gt;
 *             &lt;enumeration value="ADD_DEVICE"/&gt;
 *             &lt;enumeration value="AT"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="linkId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="os" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="poi" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="threshold" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute name="timed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="inverse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="wait" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute name="failureMode" default="ERROR"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="ERROR"/&gt;
 *             &lt;enumeration value="IGNORE"/&gt;
 *             &lt;enumeration value="LOG_IGNORE"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="validation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="validationType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="REGEX"/&gt;
 *             &lt;enumeration value="EMPTY"/&gt;
 *             &lt;enumeration value="NOT_EMPTY"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="device" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tagNames" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Step", propOrder = {
    "parameter",
    "token",
    "step"
})
public class Step {

    protected List<Parameter> parameter;
    protected List<Token> token;
    protected List<Step> step;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "page")
    protected String page;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "active")
    protected Boolean active;
    @XmlAttribute(name = "linkId")
    protected String linkId;
    @XmlAttribute(name = "os")
    protected String os;
    @XmlAttribute(name = "poi")
    protected String poi;
    @XmlAttribute(name = "threshold")
    protected BigInteger threshold;
    @XmlAttribute(name = "timed")
    protected Boolean timed;
    @XmlAttribute(name = "inverse")
    protected Boolean inverse;
    @XmlAttribute(name = "wait")
    protected BigInteger wait;
    @XmlAttribute(name = "failureMode")
    protected String failureMode;
    @XmlAttribute(name = "validation")
    protected String validation;
    @XmlAttribute(name = "validationType")
    protected String validationType;
    @XmlAttribute(name = "context")
    protected String context;
    @XmlAttribute(name = "device")
    protected String device;
    @XmlAttribute(name = "tagNames")
    protected String tagNames;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<Parameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the token property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the token property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Token }
     * 
     * 
     */
    public List<Token> getToken() {
        if (token == null) {
            token = new ArrayList<Token>();
        }
        return this.token;
    }

    /**
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Step }
     * 
     * 
     */
    public List<Step> getStep() {
        if (step == null) {
            step = new ArrayList<Step>();
        }
        return this.step;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActive() {
        if (active == null) {
            return true;
        } else {
            return active;
        }
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoi() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoi(String value) {
        this.poi = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThreshold() {
        if (threshold == null) {
            return new BigInteger("0");
        } else {
            return threshold;
        }
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThreshold(BigInteger value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the timed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTimed() {
        if (timed == null) {
            return false;
        } else {
            return timed;
        }
    }

    /**
     * Sets the value of the timed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimed(Boolean value) {
        this.timed = value;
    }

    /**
     * Gets the value of the inverse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInverse() {
        if (inverse == null) {
            return false;
        } else {
            return inverse;
        }
    }

    /**
     * Sets the value of the inverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverse(Boolean value) {
        this.inverse = value;
    }

    /**
     * Gets the value of the wait property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWait() {
        if (wait == null) {
            return new BigInteger("0");
        } else {
            return wait;
        }
    }

    /**
     * Sets the value of the wait property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWait(BigInteger value) {
        this.wait = value;
    }

    /**
     * Gets the value of the failureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureMode() {
        if (failureMode == null) {
            return "ERROR";
        } else {
            return failureMode;
        }
    }

    /**
     * Sets the value of the failureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureMode(String value) {
        this.failureMode = value;
    }

    /**
     * Gets the value of the validation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidation() {
        return validation;
    }

    /**
     * Sets the value of the validation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidation(String value) {
        this.validation = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the tagNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagNames() {
        return tagNames;
    }

    /**
     * Sets the value of the tagNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagNames(String value) {
        this.tagNames = value;
    }

}
