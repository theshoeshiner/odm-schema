
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Alias")
public class ODMcomplexTypeDefinitionAlias {

    @XmlAttribute(name = "Context", required = true)
    protected String context;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    
    public ODMcomplexTypeDefinitionAlias() {
        super();
    }

    
    public ODMcomplexTypeDefinitionAlias(final String context, final String name) {
        this.context = context;
        this.name = name;
    }

    
    public String getContext() {
        return context;
    }

    
    public void setContext(String value) {
        this.context = value;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String value) {
        this.name = value;
    }

}
