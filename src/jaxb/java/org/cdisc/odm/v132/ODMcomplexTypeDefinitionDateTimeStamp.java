
package org.cdisc.odm.v132;

import java.time.ZonedDateTime;
import javax.xml.bind.LooseIsoDateTimeAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-DateTimeStamp", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionDateTimeStamp {

    @XmlValue
    @XmlJavaTypeAdapter(LooseIsoDateTimeAdapter.class)
    protected ZonedDateTime value;

    
    public ODMcomplexTypeDefinitionDateTimeStamp() {
        super();
    }

    
    public ODMcomplexTypeDefinitionDateTimeStamp(final ZonedDateTime value) {
        this.value = value;
    }

    
    public ZonedDateTime getValue() {
        return value;
    }

    
    public void setValue(ZonedDateTime value) {
        this.value = value;
    }

}
