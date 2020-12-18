
package org.cdisc.odm.v132;

import java.time.LocalDateTime;
import javax.xml.bind.LocalDateTimeAdapter;
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
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    protected LocalDateTime value;

    
    public LocalDateTime getValue() {
        return value;
    }

    
    public void setValue(LocalDateTime value) {
        this.value = value;
    }

}
