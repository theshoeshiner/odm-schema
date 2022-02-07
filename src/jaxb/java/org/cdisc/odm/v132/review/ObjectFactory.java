
package org.cdisc.odm.v132.review;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _ReviewData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.3/review", "ReviewData");

    
    public ObjectFactory() {
    }

    
    public ReviewData createReviewData() {
        return new ReviewData();
    }

    
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.3/review", name = "ReviewData")
    public JAXBElement<ReviewData> createReviewData(ReviewData value) {
        return new JAXBElement<ReviewData>(_ReviewData_QNAME, ReviewData.class, null, value);
    }

}
