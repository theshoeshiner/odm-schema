
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ReferenceData", propOrder = {
    "itemGroupData",
    "auditRecords",
    "signatures",
    "annotations"
})
public class ODMcomplexTypeDefinitionReferenceData {

    @XmlElement(name = "ItemGroupData")
    protected List<ODMcomplexTypeDefinitionItemGroupData> itemGroupData;
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

    
    public ODMcomplexTypeDefinitionReferenceData() {
        super();
    }

    
    public ODMcomplexTypeDefinitionReferenceData(final List<ODMcomplexTypeDefinitionItemGroupData> itemGroupData, final List<ODMcomplexTypeDefinitionAuditRecords> auditRecords, final List<ODMcomplexTypeDefinitionSignatures> signatures, final List<ODMcomplexTypeDefinitionAnnotations> annotations, final String studyOID, final String metaDataVersionOID) {
        this.itemGroupData = itemGroupData;
        this.auditRecords = auditRecords;
        this.signatures = signatures;
        this.annotations = annotations;
        this.studyOID = studyOID;
        this.metaDataVersionOID = metaDataVersionOID;
    }

    
    public List<ODMcomplexTypeDefinitionItemGroupData> getItemGroupData() {
        if (itemGroupData == null) {
            itemGroupData = new ArrayList<ODMcomplexTypeDefinitionItemGroupData>();
        }
        return this.itemGroupData;
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
