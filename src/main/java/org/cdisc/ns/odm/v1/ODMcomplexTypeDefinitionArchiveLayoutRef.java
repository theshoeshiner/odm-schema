
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ArchiveLayoutRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ArchiveLayoutRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutRefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutRefAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutRefAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ArchiveLayoutRef")
public class ODMcomplexTypeDefinitionArchiveLayoutRef {

    @XmlAttribute(name = "ArchiveLayoutOID", required = true)
    protected String archiveLayoutOID;

    /**
     * Gets the value of the archiveLayoutOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveLayoutOID() {
        return archiveLayoutOID;
    }

    /**
     * Sets the value of the archiveLayoutOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveLayoutOID(String value) {
        this.archiveLayoutOID = value;
    }

}
