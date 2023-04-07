
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auditRecord",
    "signature",
    "measurementUnitRef",
    "annotation"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionItemData.class
})
public class OriginalODMcomplexTypeDefinitionItemData implements HasAuditRecordOrId
{

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "MeasurementUnitRef")
    protected ODMcomplexTypeDefinitionMeasurementUnitRef measurementUnitRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "ItemRepeatKey")
    protected String itemRepeatKey;
    @XmlAttribute(name = "AuditRecordID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object auditRecordID;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "IsNull")
    @XmlJavaTypeAdapter(YesOnlyAdapter.class)
    protected Boolean isNull;

    
    public OriginalODMcomplexTypeDefinitionItemData() {
        super();
    }

    
    public OriginalODMcomplexTypeDefinitionItemData(final ODMcomplexTypeDefinitionAuditRecord auditRecord, final ODMcomplexTypeDefinitionSignature signature, final ODMcomplexTypeDefinitionMeasurementUnitRef measurementUnitRef, final List<ODMcomplexTypeDefinitionAnnotation> annotation, final String value, final String itemRepeatKey, final Object auditRecordID, final String itemOID, final TransactionType transactionType, final Boolean isNull) {
        this.auditRecord = auditRecord;
        this.signature = signature;
        this.measurementUnitRef = measurementUnitRef;
        this.annotation = annotation;
        this.value = value;
        this.itemRepeatKey = itemRepeatKey;
        this.auditRecordID = auditRecordID;
        this.itemOID = itemOID;
        this.transactionType = transactionType;
        this.isNull = isNull;
    }

    
    public ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
        return auditRecord;
    }

    
    public void setAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        this.auditRecord = value;
    }

    
    public ODMcomplexTypeDefinitionSignature getSignature() {
        return signature;
    }

    
    public void setSignature(ODMcomplexTypeDefinitionSignature value) {
        this.signature = value;
    }

    
    public ODMcomplexTypeDefinitionMeasurementUnitRef getMeasurementUnitRef() {
        return measurementUnitRef;
    }

    
    public void setMeasurementUnitRef(ODMcomplexTypeDefinitionMeasurementUnitRef value) {
        this.measurementUnitRef = value;
    }

    
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

    
    public String getItemRepeatKey() {
        return itemRepeatKey;
    }

    
    public void setItemRepeatKey(String value) {
        this.itemRepeatKey = value;
    }

    
    public Object getAuditRecordID() {
        return auditRecordID;
    }

    
    public void setAuditRecordID(Object value) {
        this.auditRecordID = value;
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

    
    public Boolean getIsNull() {
        return isNull;
    }

    
    public void setIsNull(Boolean value) {
        this.isNull = value;
    }

}
