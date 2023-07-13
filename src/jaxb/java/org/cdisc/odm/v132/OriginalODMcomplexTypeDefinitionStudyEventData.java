
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



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auditRecord",
    "signature",
    "annotation",
    "formData"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionStudyEventData.class
})
public class OriginalODMcomplexTypeDefinitionStudyEventData implements HasAuditRecordOrId
{

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "FormData")
    protected List<ODMcomplexTypeDefinitionFormData> formData;
    @XmlAttribute(name = "StudyEventOID", required = true)
    protected String studyEventOID;
    @XmlAttribute(name = "StudyEventRepeatKey")
    protected String studyEventRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "AuditRecordID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object auditRecordID;

    
    public OriginalODMcomplexTypeDefinitionStudyEventData() {
        super();
    }

    
    public OriginalODMcomplexTypeDefinitionStudyEventData(final ODMcomplexTypeDefinitionAuditRecord auditRecord, final ODMcomplexTypeDefinitionSignature signature, final List<ODMcomplexTypeDefinitionAnnotation> annotation, final List<ODMcomplexTypeDefinitionFormData> formData, final String studyEventOID, final String studyEventRepeatKey, final TransactionType transactionType, final Object auditRecordID) {
        this.auditRecord = auditRecord;
        this.signature = signature;
        this.annotation = annotation;
        this.formData = formData;
        this.studyEventOID = studyEventOID;
        this.studyEventRepeatKey = studyEventRepeatKey;
        this.transactionType = transactionType;
        this.auditRecordID = auditRecordID;
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

    
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    
    public List<ODMcomplexTypeDefinitionFormData> getFormData() {
        if (formData == null) {
            formData = new ArrayList<ODMcomplexTypeDefinitionFormData>();
        }
        return this.formData;
    }

    
    public String getStudyEventOID() {
        return studyEventOID;
    }

    
    public void setStudyEventOID(String value) {
        this.studyEventOID = value;
    }

    
    public String getStudyEventRepeatKey() {
        return studyEventRepeatKey;
    }

    
    public void setStudyEventRepeatKey(String value) {
        this.studyEventRepeatKey = value;
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

}
