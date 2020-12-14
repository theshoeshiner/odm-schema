
package org.cdsic.odm.v132;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Annotation", propOrder = {
    "comment",
    "flag"
})
public class ODMcomplexTypeDefinitionAnnotation {

    @XmlElement(name = "Comment")
    protected ODMcomplexTypeDefinitionComment comment;
    @XmlElement(name = "Flag")
    protected List<ODMcomplexTypeDefinitionFlag> flag;
    @XmlAttribute(name = "SeqNum", required = true)
    protected BigInteger seqNum;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    
    public ODMcomplexTypeDefinitionComment getComment() {
        return comment;
    }

    
    public void setComment(ODMcomplexTypeDefinitionComment value) {
        this.comment = value;
    }

    
    public List<ODMcomplexTypeDefinitionFlag> getFlag() {
        if (flag == null) {
            flag = new ArrayList<ODMcomplexTypeDefinitionFlag>();
        }
        return this.flag;
    }

    
    public BigInteger getSeqNum() {
        return seqNum;
    }

    
    public void setSeqNum(BigInteger value) {
        this.seqNum = value;
    }

    
    public TransactionType getTransactionType() {
        return transactionType;
    }

    
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    
    public String getID() {
        return id;
    }

    
    public void setID(String value) {
        this.id = value;
    }

}
