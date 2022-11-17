
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Pager", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionPager {

    @XmlValue
    protected String value;

    
    public ODMcomplexTypeDefinitionPager() {
        super();
    }

    
    public ODMcomplexTypeDefinitionPager(final String value) {
        this.value = value;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

}
