
package org.cdisc.odm.v132.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _UserGroup_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.3/user", "UserGroup");
    private final static QName _UserGroupRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.3/user", "UserGroupRef");

    
    public ObjectFactory() {
    }

    
    public UserGroup createUserGroup() {
        return new UserGroup();
    }

    
    public UserGroupRef createUserGroupRef() {
        return new UserGroupRef();
    }

    
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.3/user", name = "UserGroup")
    public JAXBElement<UserGroup> createUserGroup(UserGroup value) {
        return new JAXBElement<UserGroup>(_UserGroup_QNAME, UserGroup.class, null, value);
    }

    
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.3/user", name = "UserGroupRef")
    public JAXBElement<UserGroupRef> createUserGroupRef(UserGroupRef value) {
        return new JAXBElement<UserGroupRef>(_UserGroupRef_QNAME, UserGroupRef.class, null, value);
    }

}
