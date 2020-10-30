
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-Flag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Flag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FlagValue"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FlagType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}FlagElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FlagAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Flag", propOrder = {
    "flagValue",
    "flagType"
})
public class ODMcomplexTypeDefinitionFlag {

    @XmlElement(name = "FlagValue", required = true)
    protected ODMcomplexTypeDefinitionFlagValue flagValue;
    @XmlElement(name = "FlagType")
    protected ODMcomplexTypeDefinitionFlagType flagType;

    /**
     * Gets the value of the flagValue property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFlagValue }
     *     
     */
    public ODMcomplexTypeDefinitionFlagValue getFlagValue() {
        return flagValue;
    }

    /**
     * Sets the value of the flagValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFlagValue }
     *     
     */
    public void setFlagValue(ODMcomplexTypeDefinitionFlagValue value) {
        this.flagValue = value;
    }

    /**
     * Gets the value of the flagType property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFlagType }
     *     
     */
    public ODMcomplexTypeDefinitionFlagType getFlagType() {
        return flagType;
    }

    /**
     * Sets the value of the flagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFlagType }
     *     
     */
    public void setFlagType(ODMcomplexTypeDefinitionFlagType value) {
        this.flagType = value;
    }

}
