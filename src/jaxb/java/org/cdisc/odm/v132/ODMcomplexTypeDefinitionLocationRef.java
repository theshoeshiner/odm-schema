
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-LocationRef")
public class ODMcomplexTypeDefinitionLocationRef {

    @XmlAttribute(name = "LocationOID", required = true)
    protected String locationOID;

    
    public ODMcomplexTypeDefinitionLocationRef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionLocationRef(final String locationOID) {
        this.locationOID = locationOID;
    }

    
    public String getLocationOID() {
        return locationOID;
    }

    
    public void setLocationOID(String value) {
        this.locationOID = value;
    }

}
