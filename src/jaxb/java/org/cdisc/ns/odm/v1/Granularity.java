
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "Granularity")
@XmlEnum
public enum Granularity {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),
    @XmlEnumValue("AdminData")
    ADMIN_DATA("AdminData"),
    @XmlEnumValue("ReferenceData")
    REFERENCE_DATA("ReferenceData"),
    @XmlEnumValue("AllClinicalData")
    ALL_CLINICAL_DATA("AllClinicalData"),
    @XmlEnumValue("SingleSite")
    SINGLE_SITE("SingleSite"),
    @XmlEnumValue("SingleSubject")
    SINGLE_SUBJECT("SingleSubject");
    private final String value;

    Granularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Granularity fromValue(String v) {
        for (Granularity c: Granularity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
