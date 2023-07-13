
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-LastName", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionLastName {

    @XmlValue
    protected String value;

    
    public ODMcomplexTypeDefinitionLastName() {
        super();
    }

    
    public ODMcomplexTypeDefinitionLastName(final String value) {
        this.value = value;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

}
