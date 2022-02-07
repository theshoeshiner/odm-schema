
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
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
@XmlSeeAlso({
    ODMcomplexTypeDefinitionUser.class
})
public class OriginalODMcomplexTypeDefinitionUser {

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

    
    public ODMcomplexTypeDefinitionLoginName getLoginName() {
        return loginName;
    }

    
    public void setLoginName(ODMcomplexTypeDefinitionLoginName value) {
        this.loginName = value;
    }

    
    public ODMcomplexTypeDefinitionDisplayName getDisplayName() {
        return displayName;
    }

    
    public void setDisplayName(ODMcomplexTypeDefinitionDisplayName value) {
        this.displayName = value;
    }

    
    public ODMcomplexTypeDefinitionFullName getFullName() {
        return fullName;
    }

    
    public void setFullName(ODMcomplexTypeDefinitionFullName value) {
        this.fullName = value;
    }

    
    public ODMcomplexTypeDefinitionFirstName getFirstName() {
        return firstName;
    }

    
    public void setFirstName(ODMcomplexTypeDefinitionFirstName value) {
        this.firstName = value;
    }

    
    public ODMcomplexTypeDefinitionLastName getLastName() {
        return lastName;
    }

    
    public void setLastName(ODMcomplexTypeDefinitionLastName value) {
        this.lastName = value;
    }

    
    public ODMcomplexTypeDefinitionOrganization getOrganization() {
        return organization;
    }

    
    public void setOrganization(ODMcomplexTypeDefinitionOrganization value) {
        this.organization = value;
    }

    
    public List<ODMcomplexTypeDefinitionAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<ODMcomplexTypeDefinitionAddress>();
        }
        return this.address;
    }

    
    public List<ODMcomplexTypeDefinitionEmail> getEmail() {
        if (email == null) {
            email = new ArrayList<ODMcomplexTypeDefinitionEmail>();
        }
        return this.email;
    }

    
    public ODMcomplexTypeDefinitionPicture getPicture() {
        return picture;
    }

    
    public void setPicture(ODMcomplexTypeDefinitionPicture value) {
        this.picture = value;
    }

    
    public ODMcomplexTypeDefinitionPager getPager() {
        return pager;
    }

    
    public void setPager(ODMcomplexTypeDefinitionPager value) {
        this.pager = value;
    }

    
    public List<ODMcomplexTypeDefinitionFax> getFax() {
        if (fax == null) {
            fax = new ArrayList<ODMcomplexTypeDefinitionFax>();
        }
        return this.fax;
    }

    
    public List<ODMcomplexTypeDefinitionPhone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<ODMcomplexTypeDefinitionPhone>();
        }
        return this.phone;
    }

    
    public List<ODMcomplexTypeDefinitionLocationRef> getLocationRef() {
        if (locationRef == null) {
            locationRef = new ArrayList<ODMcomplexTypeDefinitionLocationRef>();
        }
        return this.locationRef;
    }

    
    public List<ODMcomplexTypeDefinitionCertificate> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<ODMcomplexTypeDefinitionCertificate>();
        }
        return this.certificate;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

    
    public UserType getUserType() {
        return userType;
    }

    
    public void setUserType(UserType value) {
        this.userType = value;
    }

}
