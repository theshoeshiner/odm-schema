
package org.cdisc.odm.v132;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormRef")
public class ODMcomplexTypeDefinitionFormRef {

    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "OrderNumber")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "Mandatory", required = true)
    protected YesOrNo mandatory;
    @XmlAttribute(name = "CollectionExceptionConditionOID")
    protected String collectionExceptionConditionOID;

    
    public String getFormOID() {
        return formOID;
    }

    
    public void setFormOID(String value) {
        this.formOID = value;
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
