
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ExternalQuestion")
public class ODMcomplexTypeDefinitionExternalQuestion {

    @XmlAttribute(name = "Dictionary")
    protected String dictionary;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "Code")
    protected String code;

    
    public String getDictionary() {
        return dictionary;
    }

    
    public void setDictionary(String value) {
        this.dictionary = value;
    }

    
    public String getVersion() {
        return version;
    }

    
    public void setVersion(String value) {
        this.version = value;
    }

    
    public String getCode() {
        return code;
    }

    
    public void setCode(String value) {
        this.code = value;
    }

}
