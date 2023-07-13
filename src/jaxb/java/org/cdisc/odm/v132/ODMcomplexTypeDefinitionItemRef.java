
package org.cdisc.odm.v132;

import javax.xml.bind.BigIntegerIntegerAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemRef")
public class ODMcomplexTypeDefinitionItemRef {

    @XmlAttribute(name = "OrderNumber")
    @XmlJavaTypeAdapter(BigIntegerIntegerAdapter.class)
    protected Integer orderNumber;
    @XmlAttribute(name = "Mandatory", required = true)
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean mandatory;
    @XmlAttribute(name = "CollectionExceptionConditionOID")
    protected String collectionExceptionConditionOID;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "KeySequence")
    @XmlJavaTypeAdapter(BigIntegerIntegerAdapter.class)
    protected Integer keySequence;
    @XmlAttribute(name = "MethodOID")
    protected String methodOID;
    @XmlAttribute(name = "ImputationMethodOID")
    protected String imputationMethodOID;
    @XmlAttribute(name = "Role")
    protected String role;
    @XmlAttribute(name = "RoleCodeListOID")
    protected String roleCodeListOID;

    
    public ODMcomplexTypeDefinitionItemRef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionItemRef(final Integer orderNumber, final Boolean mandatory, final String collectionExceptionConditionOID, final String itemOID, final Integer keySequence, final String methodOID, final String imputationMethodOID, final String role, final String roleCodeListOID) {
        this.orderNumber = orderNumber;
        this.mandatory = mandatory;
        this.collectionExceptionConditionOID = collectionExceptionConditionOID;
        this.itemOID = itemOID;
        this.keySequence = keySequence;
        this.methodOID = methodOID;
        this.imputationMethodOID = imputationMethodOID;
        this.role = role;
        this.roleCodeListOID = roleCodeListOID;
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

    
    public String getItemOID() {
        return itemOID;
    }

    
    public void setItemOID(String value) {
        this.itemOID = value;
    }

    
    public Integer getKeySequence() {
        return keySequence;
    }

    
    public void setKeySequence(Integer value) {
        this.keySequence = value;
    }

    
    public String getMethodOID() {
        return methodOID;
    }

    
    public void setMethodOID(String value) {
        this.methodOID = value;
    }

    
    public String getImputationMethodOID() {
        return imputationMethodOID;
    }

    
    public void setImputationMethodOID(String value) {
        this.imputationMethodOID = value;
    }

    
    public String getRole() {
        return role;
    }

    
    public void setRole(String value) {
        this.role = value;
    }

    
    public String getRoleCodeListOID() {
        return roleCodeListOID;
    }

    
    public void setRoleCodeListOID(String value) {
        this.roleCodeListOID = value;
    }

}
