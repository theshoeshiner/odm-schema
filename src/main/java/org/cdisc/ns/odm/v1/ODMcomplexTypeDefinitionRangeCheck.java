
package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-RangeCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-RangeCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}CheckValue" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FormalExpression" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}MeasurementUnitRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ErrorMessage" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}RangeCheckElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}RangeCheckAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}RangeCheckAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
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

    /**
     * Gets the value of the checkValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCheckValue }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCheckValue> getCheckValue() {
        if (checkValue == null) {
            checkValue = new ArrayList<ODMcomplexTypeDefinitionCheckValue>();
        }
        return this.checkValue;
    }

    /**
     * Gets the value of the formalExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formalExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormalExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormalExpression }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormalExpression> getFormalExpression() {
        if (formalExpression == null) {
            formalExpression = new ArrayList<ODMcomplexTypeDefinitionFormalExpression>();
        }
        return this.formalExpression;
    }

    /**
     * Gets the value of the measurementUnitRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     *     
     */
    public ODMcomplexTypeDefinitionMeasurementUnitRef getMeasurementUnitRef() {
        return measurementUnitRef;
    }

    /**
     * Sets the value of the measurementUnitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     *     
     */
    public void setMeasurementUnitRef(ODMcomplexTypeDefinitionMeasurementUnitRef value) {
        this.measurementUnitRef = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionErrorMessage }
     *     
     */
    public ODMcomplexTypeDefinitionErrorMessage getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionErrorMessage }
     *     
     */
    public void setErrorMessage(ODMcomplexTypeDefinitionErrorMessage value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the comparator property.
     * 
     * @return
     *     possible object is
     *     {@link Comparator }
     *     
     */
    public Comparator getComparator() {
        return comparator;
    }

    /**
     * Sets the value of the comparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comparator }
     *     
     */
    public void setComparator(Comparator value) {
        this.comparator = value;
    }

    /**
     * Gets the value of the softHard property.
     * 
     * @return
     *     possible object is
     *     {@link SoftOrHard }
     *     
     */
    public SoftOrHard getSoftHard() {
        return softHard;
    }

    /**
     * Sets the value of the softHard property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftOrHard }
     *     
     */
    public void setSoftHard(SoftOrHard value) {
        this.softHard = value;
    }

}
