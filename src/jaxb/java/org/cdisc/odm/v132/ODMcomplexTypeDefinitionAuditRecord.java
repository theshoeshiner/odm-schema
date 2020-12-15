
package org.cdisc.odm.v132;

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

    @XmlElement(name = "UserRef", required = true)
    protected ODMcomplexTypeDefinitionUserRef userRef;
    @XmlElement(name = "LocationRef", required = true)
    protected ODMcomplexTypeDefinitionLocationRef locationRef;
    @XmlElement(name = "DateTimeStamp", required = true)
    protected ODMcomplexTypeDefinitionDateTimeStamp dateTimeStamp;
    @XmlElement(name = "ReasonForChange")
    protected ODMcomplexTypeDefinitionReasonForChange reasonForChange;
    @XmlElement(name = "SourceID")
    protected ODMcomplexTypeDefinitionSourceID sourceID;
    @XmlAttribute(name = "EditPoint")
    protected EditPointType editPoint;
    @XmlAttribute(name = "UsedImputationMethod")
    protected YesOrNo usedImputationMethod;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    
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

    
    public YesOrNo getUsedImputationMethod() {
        return usedImputationMethod;
    }

    
    public void setUsedImputationMethod(YesOrNo value) {
        this.usedImputationMethod = value;
    }

    
    public String getID() {
        return id;
    }

    
    public void setID(String value) {
        this.id = value;
    }

}
