
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ProtocolName", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionProtocolName {

    @XmlValue
    protected String value;

    
    public ODMcomplexTypeDefinitionProtocolName() {
        super();
    }

    
    public ODMcomplexTypeDefinitionProtocolName(final String value) {
        this.value = value;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

}
