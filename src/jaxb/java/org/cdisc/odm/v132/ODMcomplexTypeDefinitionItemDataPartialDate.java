
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDataPartialDate", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionItemDataPartialDate implements ItemDataStar
{

    @XmlValue
    protected String value;
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

    
    public ODMcomplexTypeDefinitionItemDataPartialDate() {
        super();
    }

    
    public ODMcomplexTypeDefinitionItemDataPartialDate(final String value, final Object auditRecordID, final Object signatureID, final Object annotationID, final String measurementUnitOID, final String itemOID, final TransactionType transactionType) {
        this.value = value;
        this.auditRecordID = auditRecordID;
        this.signatureID = signatureID;
        this.annotationID = annotationID;
        this.measurementUnitOID = measurementUnitOID;
        this.itemOID = itemOID;
        this.transactionType = transactionType;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

    
    public Object getAuditRecordID() {
        return auditRecordID;
    }

    
    public void setAuditRecordID(Object value) {
        this.auditRecordID = value;
    }

    
    public Object getSignatureID() {
        return signatureID;
    }

    
    public void setSignatureID(Object value) {
        this.signatureID = value;
    }

    
    public Object getAnnotationID() {
        return annotationID;
    }

    
    public void setAnnotationID(Object value) {
        this.annotationID = value;
    }

    
    public String getMeasurementUnitOID() {
        return measurementUnitOID;
    }

    
    public void setMeasurementUnitOID(String value) {
        this.measurementUnitOID = value;
    }

    
    public String getItemOID() {
        return itemOID;
    }

    
    public void setItemOID(String value) {
        this.itemOID = value;
    }

    
    public TransactionType getTransactionType() {
        return transactionType;
    }

    
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

}
