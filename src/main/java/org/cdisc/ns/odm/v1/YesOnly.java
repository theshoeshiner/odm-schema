
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesOnly.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesOnly"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Yes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "YesOnly")
@XmlEnum
public enum YesOnly {

    @XmlEnumValue("Yes")
    YES("Yes");
    private final String value;

    YesOnly(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesOnly fromValue(String v) {
        for (YesOnly c: YesOnly.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
