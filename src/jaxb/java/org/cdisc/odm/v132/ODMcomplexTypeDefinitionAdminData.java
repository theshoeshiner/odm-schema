
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-AdminData", propOrder = {
    "user",
    "location",
    "signatureDef"
})
public class ODMcomplexTypeDefinitionAdminData {

    @XmlElement(name = "User")
    protected List<ODMcomplexTypeDefinitionUser> user;
    @XmlElement(name = "Location")
    protected List<ODMcomplexTypeDefinitionLocation> location;
    @XmlElement(name = "SignatureDef")
    protected List<ODMcomplexTypeDefinitionSignatureDef> signatureDef;
    @XmlAttribute(name = "StudyOID")
    protected String studyOID;

    
    public ODMcomplexTypeDefinitionAdminData() {
        super();
    }

    
    public ODMcomplexTypeDefinitionAdminData(final List<ODMcomplexTypeDefinitionUser> user, final List<ODMcomplexTypeDefinitionLocation> location, final List<ODMcomplexTypeDefinitionSignatureDef> signatureDef, final String studyOID) {
        this.user = user;
        this.location = location;
        this.signatureDef = signatureDef;
        this.studyOID = studyOID;
    }

    
    public List<ODMcomplexTypeDefinitionUser> getUser() {
        if (user == null) {
            user = new ArrayList<ODMcomplexTypeDefinitionUser>();
        }
        return this.user;
    }

    
    public List<ODMcomplexTypeDefinitionLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<ODMcomplexTypeDefinitionLocation>();
        }
        return this.location;
    }

    
    public List<ODMcomplexTypeDefinitionSignatureDef> getSignatureDef() {
        if (signatureDef == null) {
            signatureDef = new ArrayList<ODMcomplexTypeDefinitionSignatureDef>();
        }
        return this.signatureDef;
    }

    
    public String getStudyOID() {
        return studyOID;
    }

    
    public void setStudyOID(String value) {
        this.studyOID = value;
    }

}
