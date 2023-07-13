
package org.cdisc.odm.v132.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserGroup")
public class UserGroup {

    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "OID")
    protected String oid;

    
    public UserGroup() {
        super();
    }

    
    public UserGroup(final String name, final String oid) {
        this.name = name;
        this.oid = oid;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String value) {
        this.name = value;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

}
