
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "EditPointType")
@XmlEnum
public enum EditPointType {

    @XmlEnumValue("Monitoring")
    MONITORING("Monitoring"),
    @XmlEnumValue("DataManagement")
    DATA_MANAGEMENT("DataManagement"),
    @XmlEnumValue("DBAudit")
    DB_AUDIT("DBAudit");
    private final String value;

    EditPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EditPointType fromValue(String v) {
        for (EditPointType c: EditPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
