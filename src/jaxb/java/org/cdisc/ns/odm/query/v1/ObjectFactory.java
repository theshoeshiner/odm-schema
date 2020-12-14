
package org.cdisc.ns.odm.query.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryData_QNAME = new QName("http://www.cdisc.org/ns/odm/query/v1.3", "QueryData");

    
    public ObjectFactory() {
    }

    
    public QueryData createQueryData() {
        return new QueryData();
    }

    
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/query/v1.3", name = "QueryData")
    public JAXBElement<QueryData> createQueryData(QueryData value) {
        return new JAXBElement<QueryData>(_QueryData_QNAME, QueryData.class, null, value);
    }

}
