
package org.cdisc.odm.v132;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-EnumeratedItem", propOrder = {
    "alias"
})
public class ODMcomplexTypeDefinitionEnumeratedItem {

    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "CodedValue", required = true)
    protected String codedValue;
    @XmlAttribute(name = "Rank")
    protected BigDecimal rank;
    @XmlAttribute(name = "OrderNumber")
    protected BigInteger orderNumber;

    
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

    
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

}
