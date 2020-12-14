
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-UserRef")
public class ODMcomplexTypeDefinitionUserRef {

    @XmlAttribute(name = "UserOID", required = true)
    protected String userOID;

    
    public String getUserOID() {
        return userOID;
    }

    
    public void setUserOID(String value) {
        this.userOID = value;
    }

}
