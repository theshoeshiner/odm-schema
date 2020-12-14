
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "SignMethod")
@XmlEnum
public enum SignMethod {

    @XmlEnumValue("Digital")
    DIGITAL("Digital"),
    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic");
    private final String value;

    SignMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignMethod fromValue(String v) {
        for (SignMethod c: SignMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
