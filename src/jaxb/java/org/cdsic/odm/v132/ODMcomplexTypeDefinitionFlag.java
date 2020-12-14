
package org.cdsic.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Flag", propOrder = {
    "flagValue",
    "flagType"
})
public class ODMcomplexTypeDefinitionFlag {

    @XmlElement(name = "FlagValue", required = true)
    protected ODMcomplexTypeDefinitionFlagValue flagValue;
    @XmlElement(name = "FlagType")
    protected ODMcomplexTypeDefinitionFlagType flagType;

    
    public ODMcomplexTypeDefinitionFlagValue getFlagValue() {
        return flagValue;
    }

    
    public void setFlagValue(ODMcomplexTypeDefinitionFlagValue value) {
        this.flagValue = value;
    }

    
    public ODMcomplexTypeDefinitionFlagType getFlagType() {
        return flagType;
    }

    
    public void setFlagType(ODMcomplexTypeDefinitionFlagType value) {
        this.flagType = value;
    }

}
