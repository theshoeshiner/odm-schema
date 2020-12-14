
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-GlobalVariables", propOrder = {
    "studyName",
    "studyDescription",
    "protocolName"
})
public class ODMcomplexTypeDefinitionGlobalVariables {

    @XmlElement(name = "StudyName", required = true)
    protected ODMcomplexTypeDefinitionStudyName studyName;
    @XmlElement(name = "StudyDescription", required = true)
    protected ODMcomplexTypeDefinitionStudyDescription studyDescription;
    @XmlElement(name = "ProtocolName", required = true)
    protected ODMcomplexTypeDefinitionProtocolName protocolName;

    
    public ODMcomplexTypeDefinitionStudyName getStudyName() {
        return studyName;
    }

    
    public void setStudyName(ODMcomplexTypeDefinitionStudyName value) {
        this.studyName = value;
    }

    
    public ODMcomplexTypeDefinitionStudyDescription getStudyDescription() {
        return studyDescription;
    }

    
    public void setStudyDescription(ODMcomplexTypeDefinitionStudyDescription value) {
        this.studyDescription = value;
    }

    
    public ODMcomplexTypeDefinitionProtocolName getProtocolName() {
        return protocolName;
    }

    
    public void setProtocolName(ODMcomplexTypeDefinitionProtocolName value) {
        this.protocolName = value;
    }

}
