
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FlagType", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionFlagType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "CodeListOID", required = true)
    protected String codeListOID;

    
    public ODMcomplexTypeDefinitionFlagType() {
        super();
    }

    
    public ODMcomplexTypeDefinitionFlagType(final String value, final String codeListOID) {
        this.value = value;
        this.codeListOID = codeListOID;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

    
    public String getCodeListOID() {
        return codeListOID;
    }

    
    public void setCodeListOID(String value) {
        this.codeListOID = value;
    }

}
