
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Address", propOrder = {
    "streetName",
    "city",
    "stateProv",
    "country",
    "postalCode",
    "otherText"
})
public class ODMcomplexTypeDefinitionAddress {

    @XmlElement(name = "StreetName")
    protected List<ODMcomplexTypeDefinitionStreetName> streetName;
    @XmlElement(name = "City")
    protected ODMcomplexTypeDefinitionCity city;
    @XmlElement(name = "StateProv")
    protected ODMcomplexTypeDefinitionStateProv stateProv;
    @XmlElement(name = "Country")
    protected ODMcomplexTypeDefinitionCountry country;
    @XmlElement(name = "PostalCode")
    protected ODMcomplexTypeDefinitionPostalCode postalCode;
    @XmlElement(name = "OtherText")
    protected ODMcomplexTypeDefinitionOtherText otherText;

    
    public ODMcomplexTypeDefinitionAddress() {
        super();
    }

    
    public ODMcomplexTypeDefinitionAddress(final List<ODMcomplexTypeDefinitionStreetName> streetName, final ODMcomplexTypeDefinitionCity city, final ODMcomplexTypeDefinitionStateProv stateProv, final ODMcomplexTypeDefinitionCountry country, final ODMcomplexTypeDefinitionPostalCode postalCode, final ODMcomplexTypeDefinitionOtherText otherText) {
        this.streetName = streetName;
        this.city = city;
        this.stateProv = stateProv;
        this.country = country;
        this.postalCode = postalCode;
        this.otherText = otherText;
    }

    
    public List<ODMcomplexTypeDefinitionStreetName> getStreetName() {
        if (streetName == null) {
            streetName = new ArrayList<ODMcomplexTypeDefinitionStreetName>();
        }
        return this.streetName;
    }

    
    public ODMcomplexTypeDefinitionCity getCity() {
        return city;
    }

    
    public void setCity(ODMcomplexTypeDefinitionCity value) {
        this.city = value;
    }

    
    public ODMcomplexTypeDefinitionStateProv getStateProv() {
        return stateProv;
    }

    
    public void setStateProv(ODMcomplexTypeDefinitionStateProv value) {
        this.stateProv = value;
    }

    
    public ODMcomplexTypeDefinitionCountry getCountry() {
        return country;
    }

    
    public void setCountry(ODMcomplexTypeDefinitionCountry value) {
        this.country = value;
    }

    
    public ODMcomplexTypeDefinitionPostalCode getPostalCode() {
        return postalCode;
    }

    
    public void setPostalCode(ODMcomplexTypeDefinitionPostalCode value) {
        this.postalCode = value;
    }

    
    public ODMcomplexTypeDefinitionOtherText getOtherText() {
        return otherText;
    }

    
    public void setOtherText(ODMcomplexTypeDefinitionOtherText value) {
        this.otherText = value;
    }

}
