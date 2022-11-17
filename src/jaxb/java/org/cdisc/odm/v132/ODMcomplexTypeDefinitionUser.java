
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cdisc.odm.v132.user.UserGroupRef;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-User", propOrder = {
    "userGroupRef"
})
public class ODMcomplexTypeDefinitionUser
    extends OriginalODMcomplexTypeDefinitionUser
{

    @XmlElement(name = "UserGroupRef", namespace = "http://www.cdisc.org/ns/odm/v1.3/user")
    protected List<UserGroupRef> userGroupRef;

    
    public ODMcomplexTypeDefinitionUser() {
        super();
    }

    
    public ODMcomplexTypeDefinitionUser(final ODMcomplexTypeDefinitionLoginName loginName, final ODMcomplexTypeDefinitionDisplayName displayName, final ODMcomplexTypeDefinitionFullName fullName, final ODMcomplexTypeDefinitionFirstName firstName, final ODMcomplexTypeDefinitionLastName lastName, final ODMcomplexTypeDefinitionOrganization organization, final List<ODMcomplexTypeDefinitionAddress> address, final List<ODMcomplexTypeDefinitionEmail> email, final ODMcomplexTypeDefinitionPicture picture, final ODMcomplexTypeDefinitionPager pager, final List<ODMcomplexTypeDefinitionFax> fax, final List<ODMcomplexTypeDefinitionPhone> phone, final List<ODMcomplexTypeDefinitionLocationRef> locationRef, final List<ODMcomplexTypeDefinitionCertificate> certificate, final String oid, final UserType userType, final List<UserGroupRef> userGroupRef) {
        super(loginName, displayName, fullName, firstName, lastName, organization, address, email, picture, pager, fax, phone, locationRef, certificate, oid, userType);
        this.userGroupRef = userGroupRef;
    }

    
    public List<UserGroupRef> getUserGroupRef() {
        if (userGroupRef == null) {
            userGroupRef = new ArrayList<UserGroupRef>();
        }
        return this.userGroupRef;
    }

}
