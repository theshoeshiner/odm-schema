
package org.cdisc.odm.v132.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserGroupRef")
public class UserGroupRef {

    @XmlAttribute(name = "UserGroupOID")
    protected String userGroupOID;

    
    public String getUserGroupOID() {
        return userGroupOID;
    }

    
    public void setUserGroupOID(String value) {
        this.userGroupOID = value;
    }

}
