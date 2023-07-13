
package org.cdisc.odm.v132;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.BigIntegerIntegerAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-CodeListItem", propOrder = {
    "decode",
    "alias"
})
public class ODMcomplexTypeDefinitionCodeListItem {

    @XmlElement(name = "Decode", required = true)
    protected ODMcomplexTypeDefinitionDecode decode;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "CodedValue", required = true)
    protected String codedValue;
    @XmlAttribute(name = "Rank")
    protected BigDecimal rank;
    @XmlAttribute(name = "OrderNumber")
    @XmlJavaTypeAdapter(BigIntegerIntegerAdapter.class)
    protected Integer orderNumber;

    
    public ODMcomplexTypeDefinitionCodeListItem() {
        super();
    }

    
    public ODMcomplexTypeDefinitionCodeListItem(final ODMcomplexTypeDefinitionDecode decode, final List<ODMcomplexTypeDefinitionAlias> alias, final String codedValue, final BigDecimal rank, final Integer orderNumber) {
        this.decode = decode;
        this.alias = alias;
        this.codedValue = codedValue;
        this.rank = rank;
        this.orderNumber = orderNumber;
    }

    
    public ODMcomplexTypeDefinitionDecode getDecode() {
        return decode;
    }

    
    public void setDecode(ODMcomplexTypeDefinitionDecode value) {
        this.decode = value;
    }

    
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    
    public String getCodedValue() {
        return codedValue;
    }

    
    public void setCodedValue(String value) {
        this.codedValue = value;
    }

    
    public BigDecimal getRank() {
        return rank;
    }

    
    public void setRank(BigDecimal value) {
        this.rank = value;
    }

    
    public Integer getOrderNumber() {
        return orderNumber;
    }

    
    public void setOrderNumber(Integer value) {
        this.orderNumber = value;
    }

}
