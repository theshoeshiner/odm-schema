
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-RangeCheck", propOrder = {
    "checkValue",
    "formalExpression",
    "measurementUnitRef",
    "errorMessage"
})
public class ODMcomplexTypeDefinitionRangeCheck {

    @XmlElement(name = "CheckValue")
    protected List<ODMcomplexTypeDefinitionCheckValue> checkValue;
    @XmlElement(name = "FormalExpression")
    protected List<ODMcomplexTypeDefinitionFormalExpression> formalExpression;
    @XmlElement(name = "MeasurementUnitRef")
    protected ODMcomplexTypeDefinitionMeasurementUnitRef measurementUnitRef;
    @XmlElement(name = "ErrorMessage")
    protected ODMcomplexTypeDefinitionErrorMessage errorMessage;
    @XmlAttribute(name = "Comparator")
    protected Comparator comparator;
    @XmlAttribute(name = "SoftHard", required = true)
    protected SoftOrHard softHard;

    
    public ODMcomplexTypeDefinitionRangeCheck() {
        super();
    }

    
    public ODMcomplexTypeDefinitionRangeCheck(final List<ODMcomplexTypeDefinitionCheckValue> checkValue, final List<ODMcomplexTypeDefinitionFormalExpression> formalExpression, final ODMcomplexTypeDefinitionMeasurementUnitRef measurementUnitRef, final ODMcomplexTypeDefinitionErrorMessage errorMessage, final Comparator comparator, final SoftOrHard softHard) {
        this.checkValue = checkValue;
        this.formalExpression = formalExpression;
        this.measurementUnitRef = measurementUnitRef;
        this.errorMessage = errorMessage;
        this.comparator = comparator;
        this.softHard = softHard;
    }

    
    public List<ODMcomplexTypeDefinitionCheckValue> getCheckValue() {
        if (checkValue == null) {
            checkValue = new ArrayList<ODMcomplexTypeDefinitionCheckValue>();
        }
        return this.checkValue;
    }

    
    public List<ODMcomplexTypeDefinitionFormalExpression> getFormalExpression() {
        if (formalExpression == null) {
            formalExpression = new ArrayList<ODMcomplexTypeDefinitionFormalExpression>();
        }
        return this.formalExpression;
    }

    
    public ODMcomplexTypeDefinitionMeasurementUnitRef getMeasurementUnitRef() {
        return measurementUnitRef;
    }

    
    public void setMeasurementUnitRef(ODMcomplexTypeDefinitionMeasurementUnitRef value) {
        this.measurementUnitRef = value;
    }

    
    public ODMcomplexTypeDefinitionErrorMessage getErrorMessage() {
        return errorMessage;
    }

    
    public void setErrorMessage(ODMcomplexTypeDefinitionErrorMessage value) {
        this.errorMessage = value;
    }

    
    public Comparator getComparator() {
        return comparator;
    }

    
    public void setComparator(Comparator value) {
        this.comparator = value;
    }

    
    public SoftOrHard getSoftHard() {
        return softHard;
    }

    
    public void setSoftHard(SoftOrHard value) {
        this.softHard = value;
    }

}
