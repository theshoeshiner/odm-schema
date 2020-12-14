
package org.cdisc.ns.odm.query.v1;

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

    
    public QueryStatus getStatus() {
        return status;
    }

    
    public void setStatus(QueryStatus value) {
        this.status = value;
    }

}
