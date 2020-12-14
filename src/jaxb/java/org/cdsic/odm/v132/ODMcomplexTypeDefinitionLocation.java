
package org.cdsic.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Location", propOrder = {
    "metaDataVersionRef"
})
public class ODMcomplexTypeDefinitionLocation {

    @XmlElement(name = "MetaDataVersionRef", required = true)
    protected List<ODMcomplexTypeDefinitionMetaDataVersionRef> metaDataVersionRef;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "LocationType")
    protected LocationType locationType;

    
    public List<ODMcomplexTypeDefinitionMetaDataVersionRef> getMetaDataVersionRef() {
        if (metaDataVersionRef == null) {
            metaDataVersionRef = new ArrayList<ODMcomplexTypeDefinitionMetaDataVersionRef>();
        }
        return this.metaDataVersionRef;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String value) {
        this.name = value;
    }

    
    public LocationType getLocationType() {
        return locationType;
    }

    
    public void setLocationType(LocationType value) {
        this.locationType = value;
    }

}
