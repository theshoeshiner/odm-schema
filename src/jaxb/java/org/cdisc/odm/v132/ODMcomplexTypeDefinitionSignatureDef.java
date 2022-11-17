
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-SignatureDef", propOrder = {
    "meaning",
    "legalReason"
})
public class ODMcomplexTypeDefinitionSignatureDef {

    @XmlElement(name = "Meaning", required = true)
    protected ODMcomplexTypeDefinitionMeaning meaning;
    @XmlElement(name = "LegalReason", required = true)
    protected ODMcomplexTypeDefinitionLegalReason legalReason;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Methodology")
    protected SignMethod methodology;

    
    public ODMcomplexTypeDefinitionSignatureDef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionSignatureDef(final ODMcomplexTypeDefinitionMeaning meaning, final ODMcomplexTypeDefinitionLegalReason legalReason, final String oid, final SignMethod methodology) {
        this.meaning = meaning;
        this.legalReason = legalReason;
        this.oid = oid;
        this.methodology = methodology;
    }

    
    public ODMcomplexTypeDefinitionMeaning getMeaning() {
        return meaning;
    }

    
    public void setMeaning(ODMcomplexTypeDefinitionMeaning value) {
        this.meaning = value;
    }

    
    public ODMcomplexTypeDefinitionLegalReason getLegalReason() {
        return legalReason;
    }

    
    public void setLegalReason(ODMcomplexTypeDefinitionLegalReason value) {
        this.legalReason = value;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

    
    public SignMethod getMethodology() {
        return methodology;
    }

    
    public void setMethodology(SignMethod value) {
        this.methodology = value;
    }

}
