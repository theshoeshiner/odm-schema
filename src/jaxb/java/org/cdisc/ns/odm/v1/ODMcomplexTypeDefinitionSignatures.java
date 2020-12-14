
package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Signatures", propOrder = {
    "signature"
})
public class ODMcomplexTypeDefinitionSignatures {

    @XmlElement(name = "Signature")
    protected List<ODMcomplexTypeDefinitionSignature> signature;

    
    public List<ODMcomplexTypeDefinitionSignature> getSignature() {
        if (signature == null) {
            signature = new ArrayList<ODMcomplexTypeDefinitionSignature>();
        }
        return this.signature;
    }

}
