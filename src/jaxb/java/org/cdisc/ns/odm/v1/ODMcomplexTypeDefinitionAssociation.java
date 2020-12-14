
package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Association", propOrder = {
    "content"
})
public class ODMcomplexTypeDefinitionAssociation {

    @XmlElementRefs({
        @XmlElementRef(name = "KeySet", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Annotation", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;
    @XmlAttribute(name = "MetaDataVersionOID", required = true)
    protected String metaDataVersionOID;

    
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    
    public String getStudyOID() {
        return studyOID;
    }

    
    public void setStudyOID(String value) {
        this.studyOID = value;
    }

    
    public String getMetaDataVersionOID() {
        return metaDataVersionOID;
    }

    
    public void setMetaDataVersionOID(String value) {
        this.metaDataVersionOID = value;
    }

}
