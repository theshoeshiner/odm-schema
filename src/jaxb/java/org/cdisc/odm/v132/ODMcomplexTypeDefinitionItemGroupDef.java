
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



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
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean repeating;
    @XmlAttribute(name = "IsReferenceData")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean isReferenceData;
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

    
    public ODMcomplexTypeDefinitionItemGroupDef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionItemGroupDef(final ODMcomplexTypeDefinitionDescription description, final List<ODMcomplexTypeDefinitionItemRef> itemRef, final List<ODMcomplexTypeDefinitionAlias> alias, final String oid, final String name, final Boolean repeating, final Boolean isReferenceData, final String sasDatasetName, final String domain, final String origin, final String role, final String purpose, final String comment) {
        this.description = description;
        this.itemRef = itemRef;
        this.alias = alias;
        this.oid = oid;
        this.name = name;
        this.repeating = repeating;
        this.isReferenceData = isReferenceData;
        this.sasDatasetName = sasDatasetName;
        this.domain = domain;
        this.origin = origin;
        this.role = role;
        this.purpose = purpose;
        this.comment = comment;
    }

    
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

    
    public Boolean getRepeating() {
        return repeating;
    }

    
    public void setRepeating(Boolean value) {
        this.repeating = value;
    }

    
    public Boolean getIsReferenceData() {
        return isReferenceData;
    }

    
    public void setIsReferenceData(Boolean value) {
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
