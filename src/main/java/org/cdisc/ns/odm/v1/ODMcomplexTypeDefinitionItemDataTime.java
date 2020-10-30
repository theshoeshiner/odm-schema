
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemDataTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemDataTime"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.cdisc.org/ns/odm/v1.3&gt;time"&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataStarAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataStarAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataTypeAttributeSharedDefinition"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDataTime", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionItemDataTime {

    @XmlValue
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "AuditRecordID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object auditRecordID;
    @XmlAttribute(name = "SignatureID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object signatureID;
    @XmlAttribute(name = "AnnotationID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object annotationID;
    @XmlAttribute(name = "MeasurementUnitOID")
    protected String measurementUnitOID;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the auditRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAuditRecordID() {
        return auditRecordID;
    }

    /**
     * Sets the value of the auditRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAuditRecordID(Object value) {
        this.auditRecordID = value;
    }

    /**
     * Gets the value of the signatureID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSignatureID() {
        return signatureID;
    }

    /**
     * Sets the value of the signatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSignatureID(Object value) {
        this.signatureID = value;
    }

    /**
     * Gets the value of the annotationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnnotationID() {
        return annotationID;
    }

    /**
     * Sets the value of the annotationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnnotationID(Object value) {
        this.annotationID = value;
    }

    /**
     * Gets the value of the measurementUnitOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementUnitOID() {
        return measurementUnitOID;
    }

    /**
     * Sets the value of the measurementUnitOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementUnitOID(String value) {
        this.measurementUnitOID = value;
    }

    /**
     * Gets the value of the itemOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOID() {
        return itemOID;
    }

    /**
     * Sets the value of the itemOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOID(String value) {
        this.itemOID = value;
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
