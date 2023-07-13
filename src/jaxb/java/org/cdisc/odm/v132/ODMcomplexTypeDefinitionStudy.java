
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Study", propOrder = {
    "globalVariables",
    "basicDefinitions",
    "metaDataVersion"
})
public class ODMcomplexTypeDefinitionStudy {

    @XmlElement(name = "GlobalVariables", required = true)
    protected ODMcomplexTypeDefinitionGlobalVariables globalVariables;
    @XmlElement(name = "BasicDefinitions")
    protected ODMcomplexTypeDefinitionBasicDefinitions basicDefinitions;
    @XmlElement(name = "MetaDataVersion")
    protected List<ODMcomplexTypeDefinitionMetaDataVersion> metaDataVersion;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;

    
    public ODMcomplexTypeDefinitionStudy() {
        super();
    }

    
    public ODMcomplexTypeDefinitionStudy(final ODMcomplexTypeDefinitionGlobalVariables globalVariables, final ODMcomplexTypeDefinitionBasicDefinitions basicDefinitions, final List<ODMcomplexTypeDefinitionMetaDataVersion> metaDataVersion, final String oid) {
        this.globalVariables = globalVariables;
        this.basicDefinitions = basicDefinitions;
        this.metaDataVersion = metaDataVersion;
        this.oid = oid;
    }

    
    public ODMcomplexTypeDefinitionGlobalVariables getGlobalVariables() {
        return globalVariables;
    }

    
    public void setGlobalVariables(ODMcomplexTypeDefinitionGlobalVariables value) {
        this.globalVariables = value;
    }

    
    public ODMcomplexTypeDefinitionBasicDefinitions getBasicDefinitions() {
        return basicDefinitions;
    }

    
    public void setBasicDefinitions(ODMcomplexTypeDefinitionBasicDefinitions value) {
        this.basicDefinitions = value;
    }

    
    public List<ODMcomplexTypeDefinitionMetaDataVersion> getMetaDataVersion() {
        if (metaDataVersion == null) {
            metaDataVersion = new ArrayList<ODMcomplexTypeDefinitionMetaDataVersion>();
        }
        return this.metaDataVersion;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

}
