
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-MeasurementUnitRef")
public class ODMcomplexTypeDefinitionMeasurementUnitRef {

    @XmlAttribute(name = "MeasurementUnitOID", required = true)
    protected String measurementUnitOID;

    
    public ODMcomplexTypeDefinitionMeasurementUnitRef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionMeasurementUnitRef(final String measurementUnitOID) {
        this.measurementUnitOID = measurementUnitOID;
    }

    
    public String getMeasurementUnitOID() {
        return measurementUnitOID;
    }

    
    public void setMeasurementUnitOID(String value) {
        this.measurementUnitOID = value;
    }

}
