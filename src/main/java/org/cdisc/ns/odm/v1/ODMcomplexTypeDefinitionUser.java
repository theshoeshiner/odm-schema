
package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}LoginName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}DisplayName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FullName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FirstName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}LastName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Organization" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Email" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Picture" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Pager" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Fax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Phone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}LocationRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}UserElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}UserAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}UserAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-User", propOrder = {
    "loginName",
    "displayName",
    "fullName",
    "firstName",
    "lastName",
    "organization",
    "address",
    "email",
    "picture",
    "pager",
    "fax",
    "phone",
    "locationRef",
    "certificate"
})
public class ODMcomplexTypeDefinitionUser {

    @XmlElement(name = "LoginName")
    protected ODMcomplexTypeDefinitionLoginName loginName;
    @XmlElement(name = "DisplayName")
    protected ODMcomplexTypeDefinitionDisplayName displayName;
    @XmlElement(name = "FullName")
    protected ODMcomplexTypeDefinitionFullName fullName;
    @XmlElement(name = "FirstName")
    protected ODMcomplexTypeDefinitionFirstName firstName;
    @XmlElement(name = "LastName")
    protected ODMcomplexTypeDefinitionLastName lastName;
    @XmlElement(name = "Organization")
    protected ODMcomplexTypeDefinitionOrganization organization;
    @XmlElement(name = "Address")
    protected List<ODMcomplexTypeDefinitionAddress> address;
    @XmlElement(name = "Email")
    protected List<ODMcomplexTypeDefinitionEmail> email;
    @XmlElement(name = "Picture")
    protected ODMcomplexTypeDefinitionPicture picture;
    @XmlElement(name = "Pager")
    protected ODMcomplexTypeDefinitionPager pager;
    @XmlElement(name = "Fax")
    protected List<ODMcomplexTypeDefinitionFax> fax;
    @XmlElement(name = "Phone")
    protected List<ODMcomplexTypeDefinitionPhone> phone;
    @XmlElement(name = "LocationRef")
    protected List<ODMcomplexTypeDefinitionLocationRef> locationRef;
    @XmlElement(name = "Certificate")
    protected List<ODMcomplexTypeDefinitionCertificate> certificate;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "UserType")
    protected UserType userType;

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLoginName }
     *     
     */
    public ODMcomplexTypeDefinitionLoginName getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLoginName }
     *     
     */
    public void setLoginName(ODMcomplexTypeDefinitionLoginName value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDisplayName }
     *     
     */
    public ODMcomplexTypeDefinitionDisplayName getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDisplayName }
     *     
     */
    public void setDisplayName(ODMcomplexTypeDefinitionDisplayName value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFullName }
     *     
     */
    public ODMcomplexTypeDefinitionFullName getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFullName }
     *     
     */
    public void setFullName(ODMcomplexTypeDefinitionFullName value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFirstName }
     *     
     */
    public ODMcomplexTypeDefinitionFirstName getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFirstName }
     *     
     */
    public void setFirstName(ODMcomplexTypeDefinitionFirstName value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLastName }
     *     
     */
    public ODMcomplexTypeDefinitionLastName getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLastName }
     *     
     */
    public void setLastName(ODMcomplexTypeDefinitionLastName value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionOrganization }
     *     
     */
    public ODMcomplexTypeDefinitionOrganization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionOrganization }
     *     
     */
    public void setOrganization(ODMcomplexTypeDefinitionOrganization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAddress }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<ODMcomplexTypeDefinitionAddress>();
        }
        return this.address;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionEmail }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionEmail> getEmail() {
        if (email == null) {
            email = new ArrayList<ODMcomplexTypeDefinitionEmail>();
        }
        return this.email;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionPicture }
     *     
     */
    public ODMcomplexTypeDefinitionPicture getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionPicture }
     *     
     */
    public void setPicture(ODMcomplexTypeDefinitionPicture value) {
        this.picture = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionPager }
     *     
     */
    public ODMcomplexTypeDefinitionPager getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionPager }
     *     
     */
    public void setPager(ODMcomplexTypeDefinitionPager value) {
        this.pager = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFax }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFax> getFax() {
        if (fax == null) {
            fax = new ArrayList<ODMcomplexTypeDefinitionFax>();
        }
        return this.fax;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionPhone }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionPhone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<ODMcomplexTypeDefinitionPhone>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionLocationRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionLocationRef> getLocationRef() {
        if (locationRef == null) {
            locationRef = new ArrayList<ODMcomplexTypeDefinitionLocationRef>();
        }
        return this.locationRef;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCertificate }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCertificate> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<ODMcomplexTypeDefinitionCertificate>();
        }
        return this.certificate;
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
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUserType(UserType value) {
        this.userType = value;
    }

}
