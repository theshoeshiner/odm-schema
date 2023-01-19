
package org.cdisc.odm.v132;

import javax.xml.bind.BigIntegerLongAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-AuditRecord", propOrder = {
    "userRef",
    "locationRef",
    "dateTimeStamp",
    "reasonForChange",
    "sourceID"
})
public class ODMcomplexTypeDefinitionAuditRecord {

    @XmlElement(name = "UserRef")
    protected ODMcomplexTypeDefinitionUserRef userRef;
    @XmlElement(name = "LocationRef")
    protected ODMcomplexTypeDefinitionLocationRef locationRef;
    @XmlElement(name = "DateTimeStamp")
    protected ODMcomplexTypeDefinitionDateTimeStamp dateTimeStamp;
    @XmlElement(name = "ReasonForChange")
    protected ODMcomplexTypeDefinitionReasonForChange reasonForChange;
    @XmlElement(name = "SourceID")
    protected ODMcomplexTypeDefinitionSourceID sourceID;
    @XmlAttribute(name = "EditPoint")
    protected EditPointType editPoint;
    @XmlAttribute(name = "UsedImputationMethod")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean usedImputationMethod;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "OrderNumber")
    @XmlJavaTypeAdapter(BigIntegerLongAdapter.class)
    @XmlSchemaType(name = "long")
    protected Long orderNumber;
    @XmlAttribute(name = "SourceType")
    protected String sourceType;

    
    public ODMcomplexTypeDefinitionAuditRecord() {
        super();
    }

    
    public ODMcomplexTypeDefinitionAuditRecord(final ODMcomplexTypeDefinitionUserRef userRef, final ODMcomplexTypeDefinitionLocationRef locationRef, final ODMcomplexTypeDefinitionDateTimeStamp dateTimeStamp, final ODMcomplexTypeDefinitionReasonForChange reasonForChange, final ODMcomplexTypeDefinitionSourceID sourceID, final EditPointType editPoint, final Boolean usedImputationMethod, final String id, final Long orderNumber, final String sourceType) {
        this.userRef = userRef;
        this.locationRef = locationRef;
        this.dateTimeStamp = dateTimeStamp;
        this.reasonForChange = reasonForChange;
        this.sourceID = sourceID;
        this.editPoint = editPoint;
        this.usedImputationMethod = usedImputationMethod;
        this.id = id;
        this.orderNumber = orderNumber;
        this.sourceType = sourceType;
    }

    
    public ODMcomplexTypeDefinitionUserRef getUserRef() {
        return userRef;
    }

    
    public void setUserRef(ODMcomplexTypeDefinitionUserRef value) {
        this.userRef = value;
    }

    
    public ODMcomplexTypeDefinitionLocationRef getLocationRef() {
        return locationRef;
    }

    
    public void setLocationRef(ODMcomplexTypeDefinitionLocationRef value) {
        this.locationRef = value;
    }

    
    public ODMcomplexTypeDefinitionDateTimeStamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    
    public void setDateTimeStamp(ODMcomplexTypeDefinitionDateTimeStamp value) {
        this.dateTimeStamp = value;
    }

    
    public ODMcomplexTypeDefinitionReasonForChange getReasonForChange() {
        return reasonForChange;
    }

    
    public void setReasonForChange(ODMcomplexTypeDefinitionReasonForChange value) {
        this.reasonForChange = value;
    }

    
    public ODMcomplexTypeDefinitionSourceID getSourceID() {
        return sourceID;
    }

    
    public void setSourceID(ODMcomplexTypeDefinitionSourceID value) {
        this.sourceID = value;
    }

    
    public EditPointType getEditPoint() {
        return editPoint;
    }

    
    public void setEditPoint(EditPointType value) {
        this.editPoint = value;
    }

    
    public Boolean getUsedImputationMethod() {
        return usedImputationMethod;
    }

    
    public void setUsedImputationMethod(Boolean value) {
        this.usedImputationMethod = value;
    }

    
    public String getID() {
        return id;
    }

    
    public void setID(String value) {
        this.id = value;
    }

    
    public Long getOrderNumber() {
        return orderNumber;
    }

    
    public void setOrderNumber(Long value) {
        this.orderNumber = value;
    }

    
    public String getSourceType() {
        return sourceType;
    }

    
    public void setSourceType(String value) {
        this.sourceType = value;
    }

}
