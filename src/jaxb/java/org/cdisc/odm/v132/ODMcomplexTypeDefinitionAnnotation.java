
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.BigIntegerIntegerAdapter;
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
    @XmlJavaTypeAdapter(BigIntegerIntegerAdapter.class)
    protected Integer seqNum;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    
    public ODMcomplexTypeDefinitionAnnotation() {
        super();
    }

    
    public ODMcomplexTypeDefinitionAnnotation(final ODMcomplexTypeDefinitionComment comment, final List<ODMcomplexTypeDefinitionFlag> flag, final Integer seqNum, final TransactionType transactionType, final String id) {
        this.comment = comment;
        this.flag = flag;
        this.seqNum = seqNum;
        this.transactionType = transactionType;
        this.id = id;
    }

    
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

    
    public Integer getSeqNum() {
        return seqNum;
    }

    
    public void setSeqNum(Integer value) {
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
