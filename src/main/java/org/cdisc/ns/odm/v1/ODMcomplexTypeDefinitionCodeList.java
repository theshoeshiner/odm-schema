
package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-CodeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-CodeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Description" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListItem" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ExternalCodeList"/&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}EnumeratedItem" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Alias" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDescription }
     *     
     */
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDescription }
     *     
     */
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the codeListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCodeListItem }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCodeListItem> getCodeListItem() {
        if (codeListItem == null) {
            codeListItem = new ArrayList<ODMcomplexTypeDefinitionCodeListItem>();
        }
        return this.codeListItem;
    }

    /**
     * Gets the value of the externalCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionExternalCodeList }
     *     
     */
    public ODMcomplexTypeDefinitionExternalCodeList getExternalCodeList() {
        return externalCodeList;
    }

    /**
     * Sets the value of the externalCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionExternalCodeList }
     *     
     */
    public void setExternalCodeList(ODMcomplexTypeDefinitionExternalCodeList value) {
        this.externalCodeList = value;
    }

    /**
     * Gets the value of the enumeratedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumeratedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumeratedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionEnumeratedItem }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionEnumeratedItem> getEnumeratedItem() {
        if (enumeratedItem == null) {
            enumeratedItem = new ArrayList<ODMcomplexTypeDefinitionEnumeratedItem>();
        }
        return this.enumeratedItem;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAlias }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link CLDataType }
     *     
     */
    public CLDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLDataType }
     *     
     */
    public void setDataType(CLDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the sasFormatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSASFormatName() {
        return sasFormatName;
    }

    /**
     * Sets the value of the sasFormatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSASFormatName(String value) {
        this.sasFormatName = value;
    }

}
