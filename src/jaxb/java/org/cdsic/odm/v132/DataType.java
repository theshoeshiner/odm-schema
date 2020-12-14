
package org.cdsic.odm.v132;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "DataType")
@XmlEnum
public enum DataType {

    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    URI("URI"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("hexBinary")
    HEX_BINARY("hexBinary"),
    @XmlEnumValue("base64Binary")
    BASE_64_BINARY("base64Binary"),
    @XmlEnumValue("hexFloat")
    HEX_FLOAT("hexFloat"),
    @XmlEnumValue("base64Float")
    BASE_64_FLOAT("base64Float"),
    @XmlEnumValue("partialDate")
    PARTIAL_DATE("partialDate"),
    @XmlEnumValue("partialTime")
    PARTIAL_TIME("partialTime"),
    @XmlEnumValue("partialDatetime")
    PARTIAL_DATETIME("partialDatetime"),
    @XmlEnumValue("durationDatetime")
    DURATION_DATETIME("durationDatetime"),
    @XmlEnumValue("intervalDatetime")
    INTERVAL_DATETIME("intervalDatetime"),
    @XmlEnumValue("incompleteDatetime")
    INCOMPLETE_DATETIME("incompleteDatetime"),
    @XmlEnumValue("incompleteDate")
    INCOMPLETE_DATE("incompleteDate"),
    @XmlEnumValue("incompleteTime")
    INCOMPLETE_TIME("incompleteTime");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c: DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
