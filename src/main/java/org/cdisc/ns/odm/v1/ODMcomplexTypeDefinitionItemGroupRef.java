
package org.cdisc.ns.odm.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemGroupRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemGroupRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupRefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}RefAttributeSharedDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupRefAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupRefAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemGroupRef")
public class ODMcomplexTypeDefinitionItemGroupRef {

    @XmlAttribute(name = "OrderNumber")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "Mandatory", required = true)
    protected YesOrNo mandatory;
    @XmlAttribute(name = "CollectionExceptionConditionOID")
    protected String collectionExceptionConditionOID;
    @XmlAttribute(name = "ItemGroupOID", required = true)
    protected String itemGroupOID;

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setMandatory(YesOrNo value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the collectionExceptionConditionOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionExceptionConditionOID() {
        return collectionExceptionConditionOID;
    }

    /**
     * Sets the value of the collectionExceptionConditionOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionExceptionConditionOID(String value) {
        this.collectionExceptionConditionOID = value;
    }

    /**
     * Gets the value of the itemGroupOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupOID() {
        return itemGroupOID;
    }

    /**
     * Sets the value of the itemGroupOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupOID(String value) {
        this.itemGroupOID = value;
    }

}
