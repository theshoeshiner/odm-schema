
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.cdisc.odm.v132.query.QueryData;
import org.cdisc.odm.v132.status.StatusData;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormData", propOrder = {
    "auditRecord",
    "signature",
    "archiveLayoutRef",
    "annotation",
    "itemGroupData",
    "formDataElementExtension"
})
public class ODMcomplexTypeDefinitionFormData {

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
    @XmlElements({
        @XmlElement(name = "QueryData", namespace = "http://www.cdisc.org/ns/odm/v1.3/query", type = QueryData.class),
        @XmlElement(name = "StatusData", namespace = "http://www.cdisc.org/ns/odm/v1.3/status", type = StatusData.class)
    })
    protected List<Object> formDataElementExtension;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "FormRepeatKey")
    protected String formRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;

    
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

    
    public List<Object> getFormDataElementExtension() {
        if (formDataElementExtension == null) {
            formDataElementExtension = new ArrayList<Object>();
        }
        return this.formDataElementExtension;
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

}
