
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ClinicalData", propOrder = {
    "subjectData",
    "auditRecords",
    "signatures",
    "annotations"
})
public class ODMcomplexTypeDefinitionClinicalData {

    @XmlElement(name = "SubjectData")
    protected List<ODMcomplexTypeDefinitionSubjectData> subjectData;
    @XmlElement(name = "AuditRecords")
    protected List<ODMcomplexTypeDefinitionAuditRecords> auditRecords;
    @XmlElement(name = "Signatures")
    protected List<ODMcomplexTypeDefinitionSignatures> signatures;
    @XmlElement(name = "Annotations")
    protected List<ODMcomplexTypeDefinitionAnnotations> annotations;
    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;
    @XmlAttribute(name = "MetaDataVersionOID", required = true)
    protected String metaDataVersionOID;

    
    public ODMcomplexTypeDefinitionClinicalData() {
        super();
    }

    
    public ODMcomplexTypeDefinitionClinicalData(final List<ODMcomplexTypeDefinitionSubjectData> subjectData, final List<ODMcomplexTypeDefinitionAuditRecords> auditRecords, final List<ODMcomplexTypeDefinitionSignatures> signatures, final List<ODMcomplexTypeDefinitionAnnotations> annotations, final String studyOID, final String metaDataVersionOID) {
        this.subjectData = subjectData;
        this.auditRecords = auditRecords;
        this.signatures = signatures;
        this.annotations = annotations;
        this.studyOID = studyOID;
        this.metaDataVersionOID = metaDataVersionOID;
    }

    
    public List<ODMcomplexTypeDefinitionSubjectData> getSubjectData() {
        if (subjectData == null) {
            subjectData = new ArrayList<ODMcomplexTypeDefinitionSubjectData>();
        }
        return this.subjectData;
    }

    
    public List<ODMcomplexTypeDefinitionAuditRecords> getAuditRecords() {
        if (auditRecords == null) {
            auditRecords = new ArrayList<ODMcomplexTypeDefinitionAuditRecords>();
        }
        return this.auditRecords;
    }

    
    public List<ODMcomplexTypeDefinitionSignatures> getSignatures() {
        if (signatures == null) {
            signatures = new ArrayList<ODMcomplexTypeDefinitionSignatures>();
        }
        return this.signatures;
    }

    
    public List<ODMcomplexTypeDefinitionAnnotations> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<ODMcomplexTypeDefinitionAnnotations>();
        }
        return this.annotations;
    }

    
    public String getStudyOID() {
        return studyOID;
    }

    
    public void setStudyOID(String value) {
        this.studyOID = value;
    }

    
    public String getMetaDataVersionOID() {
        return metaDataVersionOID;
    }

    
    public void setMetaDataVersionOID(String value) {
        this.metaDataVersionOID = value;
    }

}
