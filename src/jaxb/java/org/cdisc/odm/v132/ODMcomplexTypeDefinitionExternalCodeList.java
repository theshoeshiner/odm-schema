
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ExternalCodeList")
public class ODMcomplexTypeDefinitionExternalCodeList {

    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "ref")
    protected String ref;
    @XmlAttribute(name = "Dictionary")
    protected String dictionary;
    @XmlAttribute(name = "Version")
    protected String version;

    
    public String getHref() {
        return href;
    }

    
    public void setHref(String value) {
        this.href = value;
    }

    
    public String getRef() {
        return ref;
    }

    
    public void setRef(String value) {
        this.ref = value;
    }

    
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

}
