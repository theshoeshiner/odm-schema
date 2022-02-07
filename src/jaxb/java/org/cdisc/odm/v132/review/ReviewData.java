
package org.cdisc.odm.v132.review;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.cdisc.odm.v132.YesOrNoAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviewData")
public class ReviewData {

    @XmlAttribute(name = "Reviewed")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean reviewed;
    @XmlAttribute(name = "UserGroupOID")
    protected String userGroupOID;
    @XmlAttribute(name = "UserOID")
    protected String userOID;

    
    public Boolean getReviewed() {
        return reviewed;
    }

    
    public void setReviewed(Boolean value) {
        this.reviewed = value;
    }

    
    public String getUserGroupOID() {
        return userGroupOID;
    }

    
    public void setUserGroupOID(String value) {
        this.userGroupOID = value;
    }

    
    public String getUserOID() {
        return userOID;
    }

    
    public void setUserOID(String value) {
        this.userOID = value;
    }

}
