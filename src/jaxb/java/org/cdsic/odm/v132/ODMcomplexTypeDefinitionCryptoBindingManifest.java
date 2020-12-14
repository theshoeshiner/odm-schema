
package org.cdsic.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-CryptoBindingManifest", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionCryptoBindingManifest {

    @XmlValue
    protected String value;

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

}