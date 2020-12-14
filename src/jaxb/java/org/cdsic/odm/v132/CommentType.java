
package org.cdsic.odm.v132;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



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
