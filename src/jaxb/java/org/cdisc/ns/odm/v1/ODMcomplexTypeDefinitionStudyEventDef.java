
package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-StudyEventDef", propOrder = {
    "description",
    "formRef",
    "alias"
})
public class ODMcomplexTypeDefinitionStudyEventDef {

    @XmlElement(name = "Description")
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "FormRef")
    protected List<ODMcomplexTypeDefinitionFormRef> formRef;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Repeating", required = true)
    protected YesOrNo repeating;
    @XmlAttribute(name = "Type", required = true)
    protected EventType type;
    @XmlAttribute(name = "Category")
    protected String category;

    
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    
    public List<ODMcomplexTypeDefinitionFormRef> getFormRef() {
        if (formRef == null) {
            formRef = new ArrayList<ODMcomplexTypeDefinitionFormRef>();
        }
        return this.formRef;
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

    
    public EventType getType() {
        return type;
    }

    
    public void setType(EventType value) {
        this.type = value;
    }

    
    public String getCategory() {
        return category;
    }

    
    public void setCategory(String value) {
        this.category = value;
    }

}
