
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-KeySet")
public class ODMcomplexTypeDefinitionKeySet {

    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;
    @XmlAttribute(name = "SubjectKey")
    protected String subjectKey;
    @XmlAttribute(name = "StudyEventOID")
    protected String studyEventOID;
    @XmlAttribute(name = "StudyEventRepeatKey")
    protected String studyEventRepeatKey;
    @XmlAttribute(name = "FormOID")
    protected String formOID;
    @XmlAttribute(name = "FormRepeatKey")
    protected String formRepeatKey;
    @XmlAttribute(name = "ItemGroupOID")
    protected String itemGroupOID;
    @XmlAttribute(name = "ItemGroupRepeatKey")
    protected String itemGroupRepeatKey;
    @XmlAttribute(name = "ItemOID")
    protected String itemOID;
    @XmlAttribute(name = "OID")
    protected String oid;

    
    public String getStudyOID() {
        return studyOID;
    }

    
    public void setStudyOID(String value) {
        this.studyOID = value;
    }

    
    public String getSubjectKey() {
        return subjectKey;
    }

    
    public void setSubjectKey(String value) {
        this.subjectKey = value;
    }

    
    public String getStudyEventOID() {
        return studyEventOID;
    }

    
    public void setStudyEventOID(String value) {
        this.studyEventOID = value;
    }

    
    public String getStudyEventRepeatKey() {
        return studyEventRepeatKey;
    }

    
    public void setStudyEventRepeatKey(String value) {
        this.studyEventRepeatKey = value;
    }

    
    public String getFormOID() {
        return formOID;
    }

    
    public void setFormOID(String value) {
        this.formOID = value;
    }

    
    public String getFormRepeatKey() {
        return formRepeatKey;
    }

    
    public void setFormRepeatKey(String value) {
        this.formRepeatKey = value;
    }

    
    public String getItemGroupOID() {
        return itemGroupOID;
    }

    
    public void setItemGroupOID(String value) {
        this.itemGroupOID = value;
    }

    
    public String getItemGroupRepeatKey() {
        return itemGroupRepeatKey;
    }

    
    public void setItemGroupRepeatKey(String value) {
        this.itemGroupRepeatKey = value;
    }

    
    public String getItemOID() {
        return itemOID;
    }

    
    public void setItemOID(String value) {
        this.itemOID = value;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

}
