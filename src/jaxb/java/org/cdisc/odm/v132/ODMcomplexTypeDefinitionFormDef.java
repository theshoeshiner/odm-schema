
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormDef", propOrder = {
    "description",
    "itemGroupRef",
    "archiveLayout",
    "alias"
})
public class ODMcomplexTypeDefinitionFormDef {

    @XmlElement(name = "Description")
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "ItemGroupRef")
    protected List<ODMcomplexTypeDefinitionItemGroupRef> itemGroupRef;
    @XmlElement(name = "ArchiveLayout")
    protected List<ODMcomplexTypeDefinitionArchiveLayout> archiveLayout;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "SourceDatasetName")
    protected String sourceDatasetName;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Repeating", required = true)
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean repeating;

    
    public ODMcomplexTypeDefinitionFormDef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionFormDef(final ODMcomplexTypeDefinitionDescription description, final List<ODMcomplexTypeDefinitionItemGroupRef> itemGroupRef, final List<ODMcomplexTypeDefinitionArchiveLayout> archiveLayout, final List<ODMcomplexTypeDefinitionAlias> alias, final String sourceDatasetName, final String oid, final String name, final Boolean repeating) {
        this.description = description;
        this.itemGroupRef = itemGroupRef;
        this.archiveLayout = archiveLayout;
        this.alias = alias;
        this.sourceDatasetName = sourceDatasetName;
        this.oid = oid;
        this.name = name;
        this.repeating = repeating;
    }

    
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    
    public List<ODMcomplexTypeDefinitionItemGroupRef> getItemGroupRef() {
        if (itemGroupRef == null) {
            itemGroupRef = new ArrayList<ODMcomplexTypeDefinitionItemGroupRef>();
        }
        return this.itemGroupRef;
    }

    
    public List<ODMcomplexTypeDefinitionArchiveLayout> getArchiveLayout() {
        if (archiveLayout == null) {
            archiveLayout = new ArrayList<ODMcomplexTypeDefinitionArchiveLayout>();
        }
        return this.archiveLayout;
    }

    
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    
    public String getSourceDatasetName() {
        return sourceDatasetName;
    }

    
    public void setSourceDatasetName(String value) {
        this.sourceDatasetName = value;
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

    
    public Boolean getRepeating() {
        return repeating;
    }

    
    public void setRepeating(Boolean value) {
        this.repeating = value;
    }

}
