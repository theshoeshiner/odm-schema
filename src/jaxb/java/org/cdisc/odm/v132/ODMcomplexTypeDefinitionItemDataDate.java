
package org.cdisc.odm.v132;

import java.time.LocalDate;

import javax.xml.bind.IsoLocalDateAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDataDate", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionItemDataDate implements ItemDataStar
{

    @XmlValue
    @XmlJavaTypeAdapter(IsoLocalDateAdapter.class)
    protected LocalDate value;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
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

    
    public ODMcomplexTypeDefinitionItemDataDate() {
        super();
    }

    
    public ODMcomplexTypeDefinitionItemDataDate(final LocalDate value, final String itemOID, final TransactionType transactionType, final Object auditRecordID, final Object signatureID, final Object annotationID, final String measurementUnitOID) {
        this.value = value;
        this.itemOID = itemOID;
        this.transactionType = transactionType;
        this.auditRecordID = auditRecordID;
        this.signatureID = signatureID;
        this.annotationID = annotationID;
        this.measurementUnitOID = measurementUnitOID;
    }

    
    public LocalDate getValue() {
        return value;
    }

    
    public void setValue(LocalDate value) {
        this.value = value;
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

}
