
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cdisc.odm.v132.query.QueryData;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemData", propOrder = {
    "auditRecord",
    "signature",
    "measurementUnitRef",
    "annotation",
    "itemDataElementExtension"
})
public class ODMcomplexTypeDefinitionItemData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "MeasurementUnitRef")
    protected ODMcomplexTypeDefinitionMeasurementUnitRef measurementUnitRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "QueryData", namespace = "http://www.cdisc.org/ns/odm/v1.3/query")
    protected List<QueryData> itemDataElementExtension;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "IsNull")
    protected YesOnly isNull;

    
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

    
    public List<QueryData> getItemDataElementExtension() {
        if (itemDataElementExtension == null) {
            itemDataElementExtension = new ArrayList<QueryData>();
        }
        return this.itemDataElementExtension;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
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

    
    public YesOnly getIsNull() {
        return isNull;
    }

    
    public void setIsNull(YesOnly value) {
        this.isNull = value;
    }

}
