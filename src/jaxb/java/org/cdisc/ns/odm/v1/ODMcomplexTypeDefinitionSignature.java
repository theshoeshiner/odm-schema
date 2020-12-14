
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Signature", propOrder = {
    "userRef",
    "locationRef",
    "signatureRef",
    "dateTimeStamp",
    "cryptoBindingManifest"
})
public class ODMcomplexTypeDefinitionSignature {

    @XmlElement(name = "UserRef", required = true)
    protected ODMcomplexTypeDefinitionUserRef userRef;
    @XmlElement(name = "LocationRef", required = true)
    protected ODMcomplexTypeDefinitionLocationRef locationRef;
    @XmlElement(name = "SignatureRef", required = true)
    protected ODMcomplexTypeDefinitionSignatureRef signatureRef;
    @XmlElement(name = "DateTimeStamp", required = true)
    protected ODMcomplexTypeDefinitionDateTimeStamp dateTimeStamp;
    @XmlElement(name = "CryptoBindingManifest")
    protected ODMcomplexTypeDefinitionCryptoBindingManifest cryptoBindingManifest;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    
    public ODMcomplexTypeDefinitionUserRef getUserRef() {
        return userRef;
    }

    
    public void setUserRef(ODMcomplexTypeDefinitionUserRef value) {
        this.userRef = value;
    }

    
    public ODMcomplexTypeDefinitionLocationRef getLocationRef() {
        return locationRef;
    }

    
    public void setLocationRef(ODMcomplexTypeDefinitionLocationRef value) {
        this.locationRef = value;
    }

    
    public ODMcomplexTypeDefinitionSignatureRef getSignatureRef() {
        return signatureRef;
    }

    
    public void setSignatureRef(ODMcomplexTypeDefinitionSignatureRef value) {
        this.signatureRef = value;
    }

    
    public ODMcomplexTypeDefinitionDateTimeStamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    
    public void setDateTimeStamp(ODMcomplexTypeDefinitionDateTimeStamp value) {
        this.dateTimeStamp = value;
    }

    
    public ODMcomplexTypeDefinitionCryptoBindingManifest getCryptoBindingManifest() {
        return cryptoBindingManifest;
    }

    
    public void setCryptoBindingManifest(ODMcomplexTypeDefinitionCryptoBindingManifest value) {
        this.cryptoBindingManifest = value;
    }

    
    public String getID() {
        return id;
    }

    
    public void setID(String value) {
        this.id = value;
    }

}
