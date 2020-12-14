
package org.cdsic.odm.v132;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "Comparator")
@XmlEnum
public enum Comparator {

    LT,
    LE,
    GT,
    GE,
    EQ,
    NE,
    IN,
    NOTIN;

    public String value() {
        return name();
    }

    public static Comparator fromValue(String v) {
        return valueOf(v);
    }

}
