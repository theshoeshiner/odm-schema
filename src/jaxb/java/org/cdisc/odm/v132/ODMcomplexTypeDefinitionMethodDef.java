
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-MethodDef", propOrder = {
    "description",
    "formalExpression",
    "alias"
})
public class ODMcomplexTypeDefinitionMethodDef {

    @XmlElement(name = "Description", required = true)
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "FormalExpression")
    protected List<ODMcomplexTypeDefinitionFormalExpression> formalExpression;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Type")
    protected MethodType type;

    
    public ODMcomplexTypeDefinitionMethodDef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionMethodDef(final ODMcomplexTypeDefinitionDescription description, final List<ODMcomplexTypeDefinitionFormalExpression> formalExpression, final List<ODMcomplexTypeDefinitionAlias> alias, final String oid, final String name, final MethodType type) {
        this.description = description;
        this.formalExpression = formalExpression;
        this.alias = alias;
        this.oid = oid;
        this.name = name;
        this.type = type;
    }

    
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    
    public List<ODMcomplexTypeDefinitionFormalExpression> getFormalExpression() {
        if (formalExpression == null) {
            formalExpression = new ArrayList<ODMcomplexTypeDefinitionFormalExpression>();
        }
        return this.formalExpression;
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

    
    public MethodType getType() {
        return type;
    }

    
    public void setType(MethodType value) {
        this.type = value;
    }

}
