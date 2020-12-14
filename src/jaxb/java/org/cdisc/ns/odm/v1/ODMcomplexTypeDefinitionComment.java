
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Comment", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionComment {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "SponsorOrSite")
    protected CommentType sponsorOrSite;

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

    
    public CommentType getSponsorOrSite() {
        return sponsorOrSite;
    }

    
    public void setSponsorOrSite(CommentType value) {
        this.sponsorOrSite = value;
    }

}
