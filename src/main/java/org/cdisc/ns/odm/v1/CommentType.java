
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sponsor"/&gt;
 *     &lt;enumeration value="Site"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommentType")
@XmlEnum
public enum CommentType {

    @XmlEnumValue("Sponsor")
    SPONSOR("Sponsor"),
    @XmlEnumValue("Site")
    SITE("Site");
    private final String value;

    CommentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentType fromValue(String v) {
        for (CommentType c: CommentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
