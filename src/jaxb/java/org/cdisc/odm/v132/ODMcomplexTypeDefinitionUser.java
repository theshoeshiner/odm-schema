
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

    
    public List<UserGroupRef> getUserGroupRef() {
        if (userGroupRef == null) {
            userGroupRef = new ArrayList<UserGroupRef>();
        }
        return this.userGroupRef;
    }

}
