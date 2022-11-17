
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-CodeListRef")
public class ODMcomplexTypeDefinitionCodeListRef {

    @XmlAttribute(name = "CodeListOID", required = true)
    protected String codeListOID;

    
    public ODMcomplexTypeDefinitionCodeListRef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionCodeListRef(final String codeListOID) {
        this.codeListOID = codeListOID;
    }

    
    public String getCodeListOID() {
        return codeListOID;
    }

    
    public void setCodeListOID(String value) {
        this.codeListOID = value;
    }

}
