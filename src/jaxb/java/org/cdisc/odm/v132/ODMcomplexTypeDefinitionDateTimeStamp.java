
package org.cdisc.odm.v132;

import java.time.OffsetDateTime;
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
    protected OffsetDateTime value;

    
    public ODMcomplexTypeDefinitionDateTimeStamp() {
        super();
    }

    
    public ODMcomplexTypeDefinitionDateTimeStamp(final OffsetDateTime value) {
        this.value = value;
    }

    
    public OffsetDateTime getValue() {
        return value;
    }

    
    public void setValue(OffsetDateTime value) {
        this.value = value;
    }

}
