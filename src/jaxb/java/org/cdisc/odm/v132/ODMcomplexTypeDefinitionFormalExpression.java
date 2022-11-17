
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormalExpression", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionFormalExpression {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Context")
    protected String context;

    
    public ODMcomplexTypeDefinitionFormalExpression() {
        super();
    }

    
    public ODMcomplexTypeDefinitionFormalExpression(final String value, final String context) {
        this.value = value;
        this.context = context;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

    
    public String getContext() {
        return context;
    }

    
    public void setContext(String value) {
        this.context = value;
    }

}
