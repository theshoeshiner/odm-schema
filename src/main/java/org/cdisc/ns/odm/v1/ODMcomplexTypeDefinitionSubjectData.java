
package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-SubjectData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-SubjectData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}InvestigatorRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}SiteRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}SubjectDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}SubjectDataAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}SubjectDataAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-SubjectData", propOrder = {
    "auditRecord",
    "signature",
    "investigatorRef",
    "siteRef",
    "annotation",
    "studyEventData"
})
public class ODMcomplexTypeDefinitionSubjectData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "InvestigatorRef")
    protected ODMcomplexTypeDefinitionInvestigatorRef investigatorRef;
    @XmlElement(name = "SiteRef")
    protected ODMcomplexTypeDefinitionSiteRef siteRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "StudyEventData")
    protected List<ODMcomplexTypeDefinitionStudyEventData> studyEventData;
    @XmlAttribute(name = "SubjectKey", required = true)
    protected String subjectKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public void setAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        this.auditRecord = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public ODMcomplexTypeDefinitionSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public void setSignature(ODMcomplexTypeDefinitionSignature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the investigatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionInvestigatorRef }
     *     
     */
    public ODMcomplexTypeDefinitionInvestigatorRef getInvestigatorRef() {
        return investigatorRef;
    }

    /**
     * Sets the value of the investigatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionInvestigatorRef }
     *     
     */
    public void setInvestigatorRef(ODMcomplexTypeDefinitionInvestigatorRef value) {
        this.investigatorRef = value;
    }

    /**
     * Gets the value of the siteRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSiteRef }
     *     
     */
    public ODMcomplexTypeDefinitionSiteRef getSiteRef() {
        return siteRef;
    }

    /**
     * Sets the value of the siteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSiteRef }
     *     
     */
    public void setSiteRef(ODMcomplexTypeDefinitionSiteRef value) {
        this.siteRef = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAnnotation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the studyEventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStudyEventData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStudyEventData> getStudyEventData() {
        if (studyEventData == null) {
            studyEventData = new ArrayList<ODMcomplexTypeDefinitionStudyEventData>();
        }
        return this.studyEventData;
    }

    /**
     * Gets the value of the subjectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectKey() {
        return subjectKey;
    }

    /**
     * Sets the value of the subjectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectKey(String value) {
        this.subjectKey = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

}
