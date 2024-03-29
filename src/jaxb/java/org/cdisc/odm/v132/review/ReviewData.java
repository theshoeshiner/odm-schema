
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

    @XmlAttribute(name = "ReviewKey")
    protected String reviewKey;
    @XmlAttribute(name = "Reviewed")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean reviewed;
    @XmlAttribute(name = "UserGroupOID")
    protected String userGroupOID;
    @XmlAttribute(name = "UserOID")
    protected String userOID;

    
    public ReviewData() {
        super();
    }

    
    public ReviewData(final String reviewKey, final Boolean reviewed, final String userGroupOID, final String userOID) {
        this.reviewKey = reviewKey;
        this.reviewed = reviewed;
        this.userGroupOID = userGroupOID;
        this.userOID = userOID;
    }

    
    public String getReviewKey() {
        return reviewKey;
    }

    
    public void setReviewKey(String value) {
        this.reviewKey = value;
    }

    
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
