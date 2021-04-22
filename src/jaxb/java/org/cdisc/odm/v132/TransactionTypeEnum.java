
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "TransactionTypeEnum")
@XmlEnum
public enum TransactionTypeEnum {

    @XmlEnumValue("Insert")
    INSERT("Insert"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Upsert")
    UPSERT("Upsert"),
    @XmlEnumValue("Context")
    CONTEXT("Context");
    private final String value;

    TransactionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionTypeEnum fromValue(String v) {
        for (TransactionTypeEnum c: TransactionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
