
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-BasicDefinitions", propOrder = {
    "measurementUnit"
})
public class ODMcomplexTypeDefinitionBasicDefinitions {

    @XmlElement(name = "MeasurementUnit")
    protected List<ODMcomplexTypeDefinitionMeasurementUnit> measurementUnit;

    
    public ODMcomplexTypeDefinitionBasicDefinitions() {
        super();
    }

    
    public ODMcomplexTypeDefinitionBasicDefinitions(final List<ODMcomplexTypeDefinitionMeasurementUnit> measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    
    public List<ODMcomplexTypeDefinitionMeasurementUnit> getMeasurementUnit() {
        if (measurementUnit == null) {
            measurementUnit = new ArrayList<ODMcomplexTypeDefinitionMeasurementUnit>();
        }
        return this.measurementUnit;
    }

}
