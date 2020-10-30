
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ArchiveLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ArchiveLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ArchiveLayout")
public class ODMcomplexTypeDefinitionArchiveLayout {

    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "PdfFileName", required = true)
    protected String pdfFileName;
    @XmlAttribute(name = "PresentationOID")
    protected String presentationOID;

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
     * Gets the value of the pdfFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfFileName() {
        return pdfFileName;
    }

    /**
     * Sets the value of the pdfFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfFileName(String value) {
        this.pdfFileName = value;
    }

    /**
     * Gets the value of the presentationOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationOID() {
        return presentationOID;
    }

    /**
     * Sets the value of the presentationOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationOID(String value) {
        this.presentationOID = value;
    }

}
