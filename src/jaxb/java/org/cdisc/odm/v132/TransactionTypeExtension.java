
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "TransactionTypeExtension")
@XmlEnum
public enum TransactionTypeExtension {

    @XmlEnumValue("Revert")
    REVERT("Revert");
    private final String value;

    TransactionTypeExtension(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionTypeExtension fromValue(String v) {
        for (TransactionTypeExtension c: TransactionTypeExtension.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
