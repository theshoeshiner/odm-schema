
package org.cdisc.odm.v132;

import javax.xml.bind.BigIntegerIntegerAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemGroupRef")
public class ODMcomplexTypeDefinitionItemGroupRef {

    @XmlAttribute(name = "ItemGroupOID", required = true)
    protected String itemGroupOID;
    @XmlAttribute(name = "OrderNumber")
    @XmlJavaTypeAdapter(BigIntegerIntegerAdapter.class)
    protected Integer orderNumber;
    @XmlAttribute(name = "Mandatory", required = true)
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean mandatory;
    @XmlAttribute(name = "CollectionExceptionConditionOID")
    protected String collectionExceptionConditionOID;

    
    public String getItemGroupOID() {
        return itemGroupOID;
    }

    
    public void setItemGroupOID(String value) {
        this.itemGroupOID = value;
    }

    
    public Integer getOrderNumber() {
        return orderNumber;
    }

    
    public void setOrderNumber(Integer value) {
        this.orderNumber = value;
    }

    
    public Boolean getMandatory() {
        return mandatory;
    }

    
    public void setMandatory(Boolean value) {
        this.mandatory = value;
    }

    
    public String getCollectionExceptionConditionOID() {
        return collectionExceptionConditionOID;
    }

    
    public void setCollectionExceptionConditionOID(String value) {
        this.collectionExceptionConditionOID = value;
    }

}
