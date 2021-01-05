
package org.cdisc.odm.v132.status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _StatusData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.3/status", "StatusData");

    
    public ObjectFactory() {
    }

    
    public StatusData createStatusData() {
        return new StatusData();
    }

    
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.3/status", name = "StatusData")
    public JAXBElement<StatusData> createStatusData(StatusData value) {
        return new JAXBElement<StatusData>(_StatusData_QNAME, StatusData.class, null, value);
    }

}
