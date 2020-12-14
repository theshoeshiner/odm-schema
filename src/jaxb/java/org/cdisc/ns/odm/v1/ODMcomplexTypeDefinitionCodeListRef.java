
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-CodeListRef")
public class ODMcomplexTypeDefinitionCodeListRef {

    @XmlAttribute(name = "CodeListOID", required = true)
    protected String codeListOID;

    
    public String getCodeListOID() {
        return codeListOID;
    }

    
    public void setCodeListOID(String value) {
        this.codeListOID = value;
    }

}
