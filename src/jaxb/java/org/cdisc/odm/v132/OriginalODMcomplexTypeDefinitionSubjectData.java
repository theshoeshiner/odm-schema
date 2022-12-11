
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
    "investigatorRef",
    "siteRef",
    "annotation",
    "studyEventData"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionSubjectData.class
})
public class OriginalODMcomplexTypeDefinitionSubjectData implements HasAuditRecordOrId
{

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
    @XmlAttribute(name = "SubjectName")
    protected String subjectName;
    @XmlAttribute(name = "SubjectNumber")
    protected String subjectNumber;
    @XmlAttribute(name = "AuditRecordID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object auditRecordID;

    
    public OriginalODMcomplexTypeDefinitionSubjectData() {
        super();
    }

    
    public OriginalODMcomplexTypeDefinitionSubjectData(final ODMcomplexTypeDefinitionAuditRecord auditRecord, final ODMcomplexTypeDefinitionSignature signature, final ODMcomplexTypeDefinitionInvestigatorRef investigatorRef, final ODMcomplexTypeDefinitionSiteRef siteRef, final List<ODMcomplexTypeDefinitionAnnotation> annotation, final List<ODMcomplexTypeDefinitionStudyEventData> studyEventData, final String subjectKey, final TransactionType transactionType, final String subjectName, final String subjectNumber, final Object auditRecordID) {
        this.auditRecord = auditRecord;
        this.signature = signature;
        this.investigatorRef = investigatorRef;
        this.siteRef = siteRef;
        this.annotation = annotation;
        this.studyEventData = studyEventData;
        this.subjectKey = subjectKey;
        this.transactionType = transactionType;
        this.subjectName = subjectName;
        this.subjectNumber = subjectNumber;
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

    
    public ODMcomplexTypeDefinitionInvestigatorRef getInvestigatorRef() {
        return investigatorRef;
    }

    
    public void setInvestigatorRef(ODMcomplexTypeDefinitionInvestigatorRef value) {
        this.investigatorRef = value;
    }

    
    public ODMcomplexTypeDefinitionSiteRef getSiteRef() {
        return siteRef;
    }

    
    public void setSiteRef(ODMcomplexTypeDefinitionSiteRef value) {
        this.siteRef = value;
    }

    
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    
    public List<ODMcomplexTypeDefinitionStudyEventData> getStudyEventData() {
        if (studyEventData == null) {
            studyEventData = new ArrayList<ODMcomplexTypeDefinitionStudyEventData>();
        }
        return this.studyEventData;
    }

    
    public String getSubjectKey() {
        return subjectKey;
    }

    
    public void setSubjectKey(String value) {
        this.subjectKey = value;
    }

    
    public TransactionType getTransactionType() {
        return transactionType;
    }

    
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    
    public String getSubjectName() {
        return subjectName;
    }

    
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    
    public String getSubjectNumber() {
        return subjectNumber;
    }

    
    public void setSubjectNumber(String value) {
        this.subjectNumber = value;
    }

    
    public Object getAuditRecordID() {
        return auditRecordID;
    }

    
    public void setAuditRecordID(Object value) {
        this.auditRecordID = value;
    }

}
