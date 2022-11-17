
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
@XmlType(name = "ODMcomplexTypeDefinition-MeasurementUnit", propOrder = {
    "symbol",
    "alias"
})
public class ODMcomplexTypeDefinitionMeasurementUnit {

    @XmlElement(name = "Symbol", required = true)
    protected ODMcomplexTypeDefinitionSymbol symbol;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "Standard")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean standard;
    @XmlAttribute(name = "Group")
    protected String group;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    
    public ODMcomplexTypeDefinitionMeasurementUnit() {
        super();
    }

    
    public ODMcomplexTypeDefinitionMeasurementUnit(final ODMcomplexTypeDefinitionSymbol symbol, final List<ODMcomplexTypeDefinitionAlias> alias, final Boolean standard, final String group, final String oid, final String name) {
        this.symbol = symbol;
        this.alias = alias;
        this.standard = standard;
        this.group = group;
        this.oid = oid;
        this.name = name;
    }

    
    public ODMcomplexTypeDefinitionSymbol getSymbol() {
        return symbol;
    }

    
    public void setSymbol(ODMcomplexTypeDefinitionSymbol value) {
        this.symbol = value;
    }

    
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    
    public Boolean getStandard() {
        return standard;
    }

    
    public void setStandard(Boolean value) {
        this.standard = value;
    }

    
    public String getGroup() {
        return group;
    }

    
    public void setGroup(String value) {
        this.group = value;
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

}
