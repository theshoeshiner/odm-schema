
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
    "archiveLayoutRef",
    "annotation",
    "itemGroupData"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionFormData.class
})
public class OriginalODMcomplexTypeDefinitionFormData implements HasAuditRecordOrId
{

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "ArchiveLayoutRef")
    protected ODMcomplexTypeDefinitionArchiveLayoutRef archiveLayoutRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "ItemGroupData")
    protected List<ODMcomplexTypeDefinitionItemGroupData> itemGroupData;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "FormRepeatKey")
    protected String formRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "AuditRecordID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object auditRecordID;

    
    public OriginalODMcomplexTypeDefinitionFormData() {
        super();
    }

    
    public OriginalODMcomplexTypeDefinitionFormData(final ODMcomplexTypeDefinitionAuditRecord auditRecord, final ODMcomplexTypeDefinitionSignature signature, final ODMcomplexTypeDefinitionArchiveLayoutRef archiveLayoutRef, final List<ODMcomplexTypeDefinitionAnnotation> annotation, final List<ODMcomplexTypeDefinitionItemGroupData> itemGroupData, final String formOID, final String formRepeatKey, final TransactionType transactionType, final Object auditRecordID) {
        this.auditRecord = auditRecord;
        this.signature = signature;
        this.archiveLayoutRef = archiveLayoutRef;
        this.annotation = annotation;
        this.itemGroupData = itemGroupData;
        this.formOID = formOID;
        this.formRepeatKey = formRepeatKey;
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

    
    public ODMcomplexTypeDefinitionArchiveLayoutRef getArchiveLayoutRef() {
        return archiveLayoutRef;
    }

    
    public void setArchiveLayoutRef(ODMcomplexTypeDefinitionArchiveLayoutRef value) {
        this.archiveLayoutRef = value;
    }

    
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    
    public List<ODMcomplexTypeDefinitionItemGroupData> getItemGroupData() {
        if (itemGroupData == null) {
            itemGroupData = new ArrayList<ODMcomplexTypeDefinitionItemGroupData>();
        }
        return this.itemGroupData;
    }

    
    public String getFormOID() {
        return formOID;
    }

    
    public void setFormOID(String value) {
        this.formOID = value;
    }

    
    public String getFormRepeatKey() {
        return formRepeatKey;
    }

    
    public void setFormRepeatKey(String value) {
        this.formRepeatKey = value;
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
