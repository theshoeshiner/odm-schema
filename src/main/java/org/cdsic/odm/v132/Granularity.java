
package org.cdsic.odm.v132;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Granularity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Granularity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Metadata"/&gt;
 *     &lt;enumeration value="AdminData"/&gt;
 *     &lt;enumeration value="ReferenceData"/&gt;
 *     &lt;enumeration value="AllClinicalData"/&gt;
 *     &lt;enumeration value="SingleSite"/&gt;
 *     &lt;enumeration value="SingleSubject"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Granularity")
@XmlEnum
public enum Granularity {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),
    @XmlEnumValue("AdminData")
    ADMIN_DATA("AdminData"),
    @XmlEnumValue("ReferenceData")
    REFERENCE_DATA("ReferenceData"),
    @XmlEnumValue("AllClinicalData")
    ALL_CLINICAL_DATA("AllClinicalData"),
    @XmlEnumValue("SingleSite")
    SINGLE_SITE("SingleSite"),
    @XmlEnumValue("SingleSubject")
    SINGLE_SUBJECT("SingleSubject");
    private final String value;

    Granularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Granularity fromValue(String v) {
        for (Granularity c: Granularity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}