
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.BigIntegerIntegerAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDef", propOrder = {
    "description",
    "question",
    "externalQuestion",
    "measurementUnitRef",
    "rangeCheck",
    "codeListRef",
    "role",
    "alias"
})
public class ODMcomplexTypeDefinitionItemDef {

    @XmlElement(name = "Description")
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "Question")
    protected ODMcomplexTypeDefinitionQuestion question;
    @XmlElement(name = "ExternalQuestion")
    protected ODMcomplexTypeDefinitionExternalQuestion externalQuestion;
    @XmlElement(name = "MeasurementUnitRef")
    protected List<ODMcomplexTypeDefinitionMeasurementUnitRef> measurementUnitRef;
    @XmlElement(name = "RangeCheck")
    protected List<ODMcomplexTypeDefinitionRangeCheck> rangeCheck;
    @XmlElement(name = "CodeListRef")
    protected ODMcomplexTypeDefinitionCodeListRef codeListRef;
    @XmlElement(name = "Role")
    protected List<ODMcomplexTypeDefinitionRole> role;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DataType", required = true)
    protected DataType dataType;
    @XmlAttribute(name = "Length")
    @XmlJavaTypeAdapter(BigIntegerIntegerAdapter.class)
    protected Integer length;
    @XmlAttribute(name = "SignificantDigits")
    @XmlJavaTypeAdapter(BigIntegerIntegerAdapter.class)
    protected Integer significantDigits;
    @XmlAttribute(name = "SASFieldName")
    protected String sasFieldName;
    @XmlAttribute(name = "SDSVarName")
    protected String sdsVarName;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Comment")
    protected String comment;
    @XmlAttribute(name = "Repeating")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean repeating;

    
    public ODMcomplexTypeDefinitionItemDef() {
        super();
    }

    
    public ODMcomplexTypeDefinitionItemDef(final ODMcomplexTypeDefinitionDescription description, final ODMcomplexTypeDefinitionQuestion question, final ODMcomplexTypeDefinitionExternalQuestion externalQuestion, final List<ODMcomplexTypeDefinitionMeasurementUnitRef> measurementUnitRef, final List<ODMcomplexTypeDefinitionRangeCheck> rangeCheck, final ODMcomplexTypeDefinitionCodeListRef codeListRef, final List<ODMcomplexTypeDefinitionRole> role, final List<ODMcomplexTypeDefinitionAlias> alias, final String oid, final String name, final DataType dataType, final Integer length, final Integer significantDigits, final String sasFieldName, final String sdsVarName, final String origin, final String comment, final Boolean repeating) {
        this.description = description;
        this.question = question;
        this.externalQuestion = externalQuestion;
        this.measurementUnitRef = measurementUnitRef;
        this.rangeCheck = rangeCheck;
        this.codeListRef = codeListRef;
        this.role = role;
        this.alias = alias;
        this.oid = oid;
        this.name = name;
        this.dataType = dataType;
        this.length = length;
        this.significantDigits = significantDigits;
        this.sasFieldName = sasFieldName;
        this.sdsVarName = sdsVarName;
        this.origin = origin;
        this.comment = comment;
        this.repeating = repeating;
    }

    
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    
    public ODMcomplexTypeDefinitionQuestion getQuestion() {
        return question;
    }

    
    public void setQuestion(ODMcomplexTypeDefinitionQuestion value) {
        this.question = value;
    }

    
    public ODMcomplexTypeDefinitionExternalQuestion getExternalQuestion() {
        return externalQuestion;
    }

    
    public void setExternalQuestion(ODMcomplexTypeDefinitionExternalQuestion value) {
        this.externalQuestion = value;
    }

    
    public List<ODMcomplexTypeDefinitionMeasurementUnitRef> getMeasurementUnitRef() {
        if (measurementUnitRef == null) {
            measurementUnitRef = new ArrayList<ODMcomplexTypeDefinitionMeasurementUnitRef>();
        }
        return this.measurementUnitRef;
    }

    
    public List<ODMcomplexTypeDefinitionRangeCheck> getRangeCheck() {
        if (rangeCheck == null) {
            rangeCheck = new ArrayList<ODMcomplexTypeDefinitionRangeCheck>();
        }
        return this.rangeCheck;
    }

    
    public ODMcomplexTypeDefinitionCodeListRef getCodeListRef() {
        return codeListRef;
    }

    
    public void setCodeListRef(ODMcomplexTypeDefinitionCodeListRef value) {
        this.codeListRef = value;
    }

    
    public List<ODMcomplexTypeDefinitionRole> getRole() {
        if (role == null) {
            role = new ArrayList<ODMcomplexTypeDefinitionRole>();
        }
        return this.role;
    }

    
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String value) {
        this.name = value;
    }

    
    public DataType getDataType() {
        return dataType;
    }

    
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    
    public Integer getLength() {
        return length;
    }

    
    public void setLength(Integer value) {
        this.length = value;
    }

    
    public Integer getSignificantDigits() {
        return significantDigits;
    }

    
    public void setSignificantDigits(Integer value) {
        this.significantDigits = value;
    }

    
    public String getSASFieldName() {
        return sasFieldName;
    }

    
    public void setSASFieldName(String value) {
        this.sasFieldName = value;
    }

    
    public String getSDSVarName() {
        return sdsVarName;
    }

    
    public void setSDSVarName(String value) {
        this.sdsVarName = value;
    }

    
    public String getOrigin() {
        return origin;
    }

    
    public void setOrigin(String value) {
        this.origin = value;
    }

    
    public String getComment() {
        return comment;
    }

    
    public void setComment(String value) {
        this.comment = value;
    }

    
    public Boolean getRepeating() {
        return repeating;
    }

    
    public void setRepeating(Boolean value) {
        this.repeating = value;
    }

}
