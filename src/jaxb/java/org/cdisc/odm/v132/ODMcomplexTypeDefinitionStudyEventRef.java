
package org.cdisc.odm.v132;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-StudyEventRef")
public class ODMcomplexTypeDefinitionStudyEventRef {

    @XmlAttribute(name = "StudyEventOID", required = true)
    protected String studyEventOID;
    @XmlAttribute(name = "OrderNumber")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "Mandatory", required = true)
    protected YesOrNo mandatory;
    @XmlAttribute(name = "CollectionExceptionConditionOID")
    protected String collectionExceptionConditionOID;

    
    public String getStudyEventOID() {
        return studyEventOID;
    }

    
    public void setStudyEventOID(String value) {
        this.studyEventOID = value;
    }

    
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

    
    public YesOrNo getMandatory() {
        return mandatory;
    }

    
    public void setMandatory(YesOrNo value) {
        this.mandatory = value;
    }

    
    public String getCollectionExceptionConditionOID() {
        return collectionExceptionConditionOID;
    }

    
    public void setCollectionExceptionConditionOID(String value) {
        this.collectionExceptionConditionOID = value;
    }

}
