
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-SignatureRef")
public class ODMcomplexTypeDefinitionSignatureRef {

    @XmlAttribute(name = "SignatureOID", required = true)
    protected String signatureOID;

    
    public String getSignatureOID() {
        return signatureOID;
    }

    
    public void setSignatureOID(String value) {
        this.signatureOID = value;
    }

}
