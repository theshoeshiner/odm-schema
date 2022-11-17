
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-StreetName", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionStreetName {

    @XmlValue
    protected String value;

    
    public ODMcomplexTypeDefinitionStreetName() {
        super();
    }

    
    public ODMcomplexTypeDefinitionStreetName(final String value) {
        this.value = value;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

}
