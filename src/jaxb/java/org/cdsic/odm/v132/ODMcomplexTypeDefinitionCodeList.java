
package org.cdsic.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-CodeList", propOrder = {
    "description",
    "codeListItem",
    "externalCodeList",
    "enumeratedItem",
    "alias"
})
public class ODMcomplexTypeDefinitionCodeList {

    @XmlElement(name = "Description")
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "CodeListItem")
    protected List<ODMcomplexTypeDefinitionCodeListItem> codeListItem;
    @XmlElement(name = "ExternalCodeList")
    protected ODMcomplexTypeDefinitionExternalCodeList externalCodeList;
    @XmlElement(name = "EnumeratedItem")
    protected List<ODMcomplexTypeDefinitionEnumeratedItem> enumeratedItem;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DataType", required = true)
    protected CLDataType dataType;
    @XmlAttribute(name = "SASFormatName")
    protected String sasFormatName;

    
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    
    public List<ODMcomplexTypeDefinitionCodeListItem> getCodeListItem() {
        if (codeListItem == null) {
            codeListItem = new ArrayList<ODMcomplexTypeDefinitionCodeListItem>();
        }
        return this.codeListItem;
    }

    
    public ODMcomplexTypeDefinitionExternalCodeList getExternalCodeList() {
        return externalCodeList;
    }

    
    public void setExternalCodeList(ODMcomplexTypeDefinitionExternalCodeList value) {
        this.externalCodeList = value;
    }

    
    public List<ODMcomplexTypeDefinitionEnumeratedItem> getEnumeratedItem() {
        if (enumeratedItem == null) {
            enumeratedItem = new ArrayList<ODMcomplexTypeDefinitionEnumeratedItem>();
        }
        return this.enumeratedItem;
    }

    
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String value) {
        this.name = value;
    }

    
    public CLDataType getDataType() {
        return dataType;
    }

    
    public void setDataType(CLDataType value) {
        this.dataType = value;
    }

    
    public String getSASFormatName() {
        return sasFormatName;
    }

    
    public void setSASFormatName(String value) {
        this.sasFormatName = value;
    }

}
