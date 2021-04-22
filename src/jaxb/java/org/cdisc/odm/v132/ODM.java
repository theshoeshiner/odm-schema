
package org.cdisc.odm.v132;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.LooseIsoDateTimeAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3.v200009.xmldsig.SignatureType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "study",
    "adminData",
    "referenceData",
    "clinicalData",
    "association",
    "signature"
})
@XmlRootElement(name = "ODM")
public class ODM {

    @XmlElement(name = "Study")
    protected List<ODMcomplexTypeDefinitionStudy> study;
    @XmlElement(name = "AdminData")
    protected List<ODMcomplexTypeDefinitionAdminData> adminData;
    @XmlElement(name = "ReferenceData")
    protected List<ODMcomplexTypeDefinitionReferenceData> referenceData;
    @XmlElement(name = "ClinicalData")
    protected List<ODMcomplexTypeDefinitionClinicalData> clinicalData;
    @XmlElement(name = "Association")
    protected List<ODMcomplexTypeDefinitionAssociation> association;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected List<SignatureType> signature;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "FileType", required = true)
    protected FileType fileType;
    @XmlAttribute(name = "Granularity")
    protected Granularity granularity;
    @XmlAttribute(name = "Archival")
    @XmlJavaTypeAdapter(YesOnlyAdapter.class)
    protected Boolean archival;
    @XmlAttribute(name = "FileOID", required = true)
    protected String fileOID;
    @XmlAttribute(name = "CreationDateTime", required = true)
    @XmlJavaTypeAdapter(LooseIsoDateTimeAdapter.class)
    protected ZonedDateTime creationDateTime;
    @XmlAttribute(name = "PriorFileOID")
    protected String priorFileOID;
    @XmlAttribute(name = "AsOfDateTime")
    @XmlJavaTypeAdapter(LooseIsoDateTimeAdapter.class)
    protected ZonedDateTime asOfDateTime;
    @XmlAttribute(name = "ODMVersion")
    protected String odmVersion;
    @XmlAttribute(name = "Originator")
    protected String originator;
    @XmlAttribute(name = "SourceSystem")
    protected String sourceSystem;
    @XmlAttribute(name = "SourceSystemVersion")
    protected String sourceSystemVersion;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    
    public List<ODMcomplexTypeDefinitionStudy> getStudy() {
        if (study == null) {
            study = new ArrayList<ODMcomplexTypeDefinitionStudy>();
        }
        return this.study;
    }

    
    public List<ODMcomplexTypeDefinitionAdminData> getAdminData() {
        if (adminData == null) {
            adminData = new ArrayList<ODMcomplexTypeDefinitionAdminData>();
        }
        return this.adminData;
    }

    
    public List<ODMcomplexTypeDefinitionReferenceData> getReferenceData() {
        if (referenceData == null) {
            referenceData = new ArrayList<ODMcomplexTypeDefinitionReferenceData>();
        }
        return this.referenceData;
    }

    
    public List<ODMcomplexTypeDefinitionClinicalData> getClinicalData() {
        if (clinicalData == null) {
            clinicalData = new ArrayList<ODMcomplexTypeDefinitionClinicalData>();
        }
        return this.clinicalData;
    }

    
    public List<ODMcomplexTypeDefinitionAssociation> getAssociation() {
        if (association == null) {
            association = new ArrayList<ODMcomplexTypeDefinitionAssociation>();
        }
        return this.association;
    }

    
    public List<SignatureType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<SignatureType>();
        }
        return this.signature;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String value) {
        this.description = value;
    }

    
    public FileType getFileType() {
        return fileType;
    }

    
    public void setFileType(FileType value) {
        this.fileType = value;
    }

    
    public Granularity getGranularity() {
        return granularity;
    }

    
    public void setGranularity(Granularity value) {
        this.granularity = value;
    }

    
    public Boolean getArchival() {
        return archival;
    }

    
    public void setArchival(Boolean value) {
        this.archival = value;
    }

    
    public String getFileOID() {
        return fileOID;
    }

    
    public void setFileOID(String value) {
        this.fileOID = value;
    }

    
    public ZonedDateTime getCreationDateTime() {
        return creationDateTime;
    }

    
    public void setCreationDateTime(ZonedDateTime value) {
        this.creationDateTime = value;
    }

    
    public String getPriorFileOID() {
        return priorFileOID;
    }

    
    public void setPriorFileOID(String value) {
        this.priorFileOID = value;
    }

    
    public ZonedDateTime getAsOfDateTime() {
        return asOfDateTime;
    }

    
    public void setAsOfDateTime(ZonedDateTime value) {
        this.asOfDateTime = value;
    }

    
    public String getODMVersion() {
        return odmVersion;
    }

    
    public void setODMVersion(String value) {
        this.odmVersion = value;
    }

    
    public String getOriginator() {
        return originator;
    }

    
    public void setOriginator(String value) {
        this.originator = value;
    }

    
    public String getSourceSystem() {
        return sourceSystem;
    }

    
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    
    public String getSourceSystemVersion() {
        return sourceSystemVersion;
    }

    
    public void setSourceSystemVersion(String value) {
        this.sourceSystemVersion = value;
    }

    
    public String getID() {
        return id;
    }

    
    public void setID(String value) {
        this.id = value;
    }

}
