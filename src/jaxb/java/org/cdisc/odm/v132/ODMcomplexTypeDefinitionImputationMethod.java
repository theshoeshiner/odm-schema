
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ImputationMethod", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionImputationMethod {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;

    
    public ODMcomplexTypeDefinitionImputationMethod() {
        super();
    }

    
    public ODMcomplexTypeDefinitionImputationMethod(final String value, final String oid) {
        this.value = value;
        this.oid = oid;
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

}
