
package org.cdisc.odm.v132.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "queryStatus")
@XmlEnum
public enum QueryStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Answered")
    ANSWERED("Answered"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    QueryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryStatus fromValue(String v) {
        for (QueryStatus c: QueryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
