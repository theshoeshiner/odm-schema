
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auditRecord",
    "signature",
    "annotation",
    "itemDataGroup",
    "itemDataStarGroup"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionItemGroupData.class
})
public class OriginalODMcomplexTypeDefinitionItemGroupData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "ItemData")
    protected List<ODMcomplexTypeDefinitionItemData> itemDataGroup;
    @XmlElements({
        @XmlElement(name = "ItemDataURI", type = ODMcomplexTypeDefinitionItemDataURI.class),
        @XmlElement(name = "ItemDataAny", type = ODMcomplexTypeDefinitionItemDataAny.class),
        @XmlElement(name = "ItemDataBoolean", type = ODMcomplexTypeDefinitionItemDataBoolean.class),
        @XmlElement(name = "ItemDataString", type = ODMcomplexTypeDefinitionItemDataString.class),
        @XmlElement(name = "ItemDataInteger", type = ODMcomplexTypeDefinitionItemDataInteger.class),
        @XmlElement(name = "ItemDataFloat", type = ODMcomplexTypeDefinitionItemDataFloat.class),
        @XmlElement(name = "ItemDataDouble", type = ODMcomplexTypeDefinitionItemDataDouble.class),
        @XmlElement(name = "ItemDataDate", type = ODMcomplexTypeDefinitionItemDataDate.class),
        @XmlElement(name = "ItemDataTime", type = ODMcomplexTypeDefinitionItemDataTime.class),
        @XmlElement(name = "ItemDataDatetime", type = ODMcomplexTypeDefinitionItemDataDatetime.class),
        @XmlElement(name = "ItemDataHexBinary", type = ODMcomplexTypeDefinitionItemDataHexBinary.class),
        @XmlElement(name = "ItemDataBase64Binary", type = ODMcomplexTypeDefinitionItemDataBase64Binary.class),
        @XmlElement(name = "ItemDataHexFloat", type = ODMcomplexTypeDefinitionItemDataHexFloat.class),
        @XmlElement(name = "ItemDataBase64Float", type = ODMcomplexTypeDefinitionItemDataBase64Float.class),
        @XmlElement(name = "ItemDataPartialDate", type = ODMcomplexTypeDefinitionItemDataPartialDate.class),
        @XmlElement(name = "ItemDataPartialTime", type = ODMcomplexTypeDefinitionItemDataPartialTime.class),
        @XmlElement(name = "ItemDataPartialDatetime", type = ODMcomplexTypeDefinitionItemDataPartialDatetime.class),
        @XmlElement(name = "ItemDataDurationDatetime", type = ODMcomplexTypeDefinitionItemDataDurationDatetime.class),
        @XmlElement(name = "ItemDataIntervalDatetime", type = ODMcomplexTypeDefinitionItemDataIntervalDatetime.class),
        @XmlElement(name = "ItemDataIncompleteDatetime", type = ODMcomplexTypeDefinitionItemDataIncompleteDatetime.class),
        @XmlElement(name = "ItemDataIncompleteDate", type = ODMcomplexTypeDefinitionItemDataIncompleteDate.class),
        @XmlElement(name = "ItemDataIncompleteTime", type = ODMcomplexTypeDefinitionItemDataIncompleteTime.class)
    })
    protected List<Object> itemDataStarGroup;
    @XmlAttribute(name = "ItemGroupOID", required = true)
    protected String itemGroupOID;
    @XmlAttribute(name = "ItemGroupRepeatKey")
    protected String itemGroupRepeatKey;
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

    
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    
    public List<ODMcomplexTypeDefinitionItemData> getItemDataGroup() {
        if (itemDataGroup == null) {
            itemDataGroup = new ArrayList<ODMcomplexTypeDefinitionItemData>();
        }
        return this.itemDataGroup;
    }

    
    public List<Object> getItemDataStarGroup() {
        if (itemDataStarGroup == null) {
            itemDataStarGroup = new ArrayList<Object>();
        }
        return this.itemDataStarGroup;
    }

    
    public String getItemGroupOID() {
        return itemGroupOID;
    }

    
    public void setItemGroupOID(String value) {
        this.itemGroupOID = value;
    }

    
    public String getItemGroupRepeatKey() {
        return itemGroupRepeatKey;
    }

    
    public void setItemGroupRepeatKey(String value) {
        this.itemGroupRepeatKey = value;
    }

    
    public TransactionType getTransactionType() {
        return transactionType;
    }

    
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

}
