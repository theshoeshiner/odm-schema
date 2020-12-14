
package org.cdsic.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-MetaDataVersionRef")
public class ODMcomplexTypeDefinitionMetaDataVersionRef {

    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;
    @XmlAttribute(name = "MetaDataVersionOID", required = true)
    protected String metaDataVersionOID;
    @XmlAttribute(name = "EffectiveDate", required = true)
    protected XMLGregorianCalendar effectiveDate;

    
    public String getStudyOID() {
        return studyOID;
    }

    
    public void setStudyOID(String value) {
        this.studyOID = value;
    }

    
    public String getMetaDataVersionOID() {
        return metaDataVersionOID;
    }

    
    public void setMetaDataVersionOID(String value) {
        this.metaDataVersionOID = value;
    }

    
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

}
