
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "UserType")
@XmlEnum
public enum UserType {

    @XmlEnumValue("Sponsor")
    SPONSOR("Sponsor"),
    @XmlEnumValue("Investigator")
    INVESTIGATOR("Investigator"),
    @XmlEnumValue("Lab")
    LAB("Lab"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserType fromValue(String v) {
        for (UserType c: UserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
