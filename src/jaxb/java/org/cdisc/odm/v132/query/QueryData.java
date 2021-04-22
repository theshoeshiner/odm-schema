
package org.cdisc.odm.v132.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryData")
public class QueryData {

    @XmlAttribute(name = "QueryKey", required = true)
    protected String queryKey;
    @XmlAttribute(name = "Text")
    protected String text;
    @XmlAttribute(name = "Response")
    protected String response;
    @XmlAttribute(name = "Recipient")
    protected String recipient;
    @XmlAttribute(name = "Status")
    protected QueryStatus status;

    
    public String getQueryKey() {
        return queryKey;
    }

    
    public void setQueryKey(String value) {
        this.queryKey = value;
    }

    
    public String getText() {
        return text;
    }

    
    public void setText(String value) {
        this.text = value;
    }

    
    public String getResponse() {
        return response;
    }

    
    public void setResponse(String value) {
        this.response = value;
    }

    
    public String getRecipient() {
        return recipient;
    }

    
    public void setRecipient(String value) {
        this.recipient = value;
    }

    
    public QueryStatus getStatus() {
        return status;
    }

    
    public void setStatus(QueryStatus value) {
        this.status = value;
    }

}
