
package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemGroupDef", propOrder = {
    "description",
    "itemRef",
    "alias"
})
public class ODMcomplexTypeDefinitionItemGroupDef {

    @XmlElement(name = "Description")
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "ItemRef")
    protected List<ODMcomplexTypeDefinitionItemRef> itemRef;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Repeating", required = true)
    protected YesOrNo repeating;
    @XmlAttribute(name = "IsReferenceData")
    protected YesOrNo isReferenceData;
    @XmlAttribute(name = "SASDatasetName")
    protected String sasDatasetName;
    @XmlAttribute(name = "Domain")
    protected String domain;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Role")
    protected String role;
    @XmlAttribute(name = "Purpose")
    protected String purpose;
    @XmlAttribute(name = "Comment")
    protected String comment;

    
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    
    public List<ODMcomplexTypeDefinitionItemRef> getItemRef() {
        if (itemRef == null) {
            itemRef = new ArrayList<ODMcomplexTypeDefinitionItemRef>();
        }
        return this.itemRef;
    }

    
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String value) {
        this.name = value;
    }

    
    public YesOrNo getRepeating() {
        return repeating;
    }

    
    public void setRepeating(YesOrNo value) {
        this.repeating = value;
    }

    
    public YesOrNo getIsReferenceData() {
        return isReferenceData;
    }

    
    public void setIsReferenceData(YesOrNo value) {
        this.isReferenceData = value;
    }

    
    public String getSASDatasetName() {
        return sasDatasetName;
    }

    
    public void setSASDatasetName(String value) {
        this.sasDatasetName = value;
    }

    
    public String getDomain() {
        return domain;
    }

    
    public void setDomain(String value) {
        this.domain = value;
    }

    
    public String getOrigin() {
        return origin;
    }

    
    public void setOrigin(String value) {
        this.origin = value;
    }

    
    public String getRole() {
        return role;
    }

    
    public void setRole(String value) {
        this.role = value;
    }

    
    public String getPurpose() {
        return purpose;
    }

    
    public void setPurpose(String value) {
        this.purpose = value;
    }

    
    public String getComment() {
        return comment;
    }

    
    public void setComment(String value) {
        this.comment = value;
    }

}
