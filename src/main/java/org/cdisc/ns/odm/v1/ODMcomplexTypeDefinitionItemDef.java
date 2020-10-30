
package org.cdisc.ns.odm.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Question" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ExternalQuestion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}MeasurementUnitRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}RangeCheck" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Role" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Alias" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDefAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDefAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDef", propOrder = {
    "description",
    "question",
    "externalQuestion",
    "measurementUnitRef",
    "rangeCheck",
    "codeListRef",
    "role",
    "alias"
})
public class ODMcomplexTypeDefinitionItemDef {

    @XmlElement(name = "Description")
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "Question")
    protected ODMcomplexTypeDefinitionQuestion question;
    @XmlElement(name = "ExternalQuestion")
    protected ODMcomplexTypeDefinitionExternalQuestion externalQuestion;
    @XmlElement(name = "MeasurementUnitRef")
    protected List<ODMcomplexTypeDefinitionMeasurementUnitRef> measurementUnitRef;
    @XmlElement(name = "RangeCheck")
    protected List<ODMcomplexTypeDefinitionRangeCheck> rangeCheck;
    @XmlElement(name = "CodeListRef")
    protected ODMcomplexTypeDefinitionCodeListRef codeListRef;
    @XmlElement(name = "Role")
    protected List<ODMcomplexTypeDefinitionRole> role;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DataType", required = true)
    protected DataType dataType;
    @XmlAttribute(name = "Length")
    protected BigInteger length;
    @XmlAttribute(name = "SignificantDigits")
    protected BigInteger significantDigits;
    @XmlAttribute(name = "SASFieldName")
    protected String sasFieldName;
    @XmlAttribute(name = "SDSVarName")
    protected String sdsVarName;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDescription }
     *     
     */
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDescription }
     *     
     */
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionQuestion }
     *     
     */
    public ODMcomplexTypeDefinitionQuestion getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionQuestion }
     *     
     */
    public void setQuestion(ODMcomplexTypeDefinitionQuestion value) {
        this.question = value;
    }

    /**
     * Gets the value of the externalQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionExternalQuestion }
     *     
     */
    public ODMcomplexTypeDefinitionExternalQuestion getExternalQuestion() {
        return externalQuestion;
    }

    /**
     * Sets the value of the externalQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionExternalQuestion }
     *     
     */
    public void setExternalQuestion(ODMcomplexTypeDefinitionExternalQuestion value) {
        this.externalQuestion = value;
    }

    /**
     * Gets the value of the measurementUnitRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementUnitRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementUnitRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionMeasurementUnitRef> getMeasurementUnitRef() {
        if (measurementUnitRef == null) {
            measurementUnitRef = new ArrayList<ODMcomplexTypeDefinitionMeasurementUnitRef>();
        }
        return this.measurementUnitRef;
    }

    /**
     * Gets the value of the rangeCheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangeCheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeCheck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionRangeCheck }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionRangeCheck> getRangeCheck() {
        if (rangeCheck == null) {
            rangeCheck = new ArrayList<ODMcomplexTypeDefinitionRangeCheck>();
        }
        return this.rangeCheck;
    }

    /**
     * Gets the value of the codeListRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionCodeListRef }
     *     
     */
    public ODMcomplexTypeDefinitionCodeListRef getCodeListRef() {
        return codeListRef;
    }

    /**
     * Sets the value of the codeListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionCodeListRef }
     *     
     */
    public void setCodeListRef(ODMcomplexTypeDefinitionCodeListRef value) {
        this.codeListRef = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionRole }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionRole> getRole() {
        if (role == null) {
            role = new ArrayList<ODMcomplexTypeDefinitionRole>();
        }
        return this.role;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAlias }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
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
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the significantDigits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSignificantDigits() {
        return significantDigits;
    }

    /**
     * Sets the value of the significantDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSignificantDigits(BigInteger value) {
        this.significantDigits = value;
    }

    /**
     * Gets the value of the sasFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSASFieldName() {
        return sasFieldName;
    }

    /**
     * Sets the value of the sasFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSASFieldName(String value) {
        this.sasFieldName = value;
    }

    /**
     * Gets the value of the sdsVarName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDSVarName() {
        return sdsVarName;
    }

    /**
     * Sets the value of the sdsVarName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDSVarName(String value) {
        this.sdsVarName = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
