
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "YesOrNo")
@XmlEnum
public enum YesOrNo {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No");
    private final String value;

    YesOrNo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesOrNo fromValue(String v) {
        for (YesOrNo c: YesOrNo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
