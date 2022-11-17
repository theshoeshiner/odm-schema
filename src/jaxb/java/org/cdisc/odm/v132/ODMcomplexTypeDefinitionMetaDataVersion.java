
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-MetaDataVersion", propOrder = {
    "include",
    "protocol",
    "studyEventDef",
    "formDef",
    "itemGroupDef",
    "itemDef",
    "codeList",
    "imputationMethod",
    "presentation",
    "conditionDef",
    "methodDef"
})
public class ODMcomplexTypeDefinitionMetaDataVersion {

    @XmlElement(name = "Include")
    protected ODMcomplexTypeDefinitionInclude include;
    @XmlElement(name = "Protocol")
    protected ODMcomplexTypeDefinitionProtocol protocol;
    @XmlElement(name = "StudyEventDef")
    protected List<ODMcomplexTypeDefinitionStudyEventDef> studyEventDef;
    @XmlElement(name = "FormDef")
    protected List<ODMcomplexTypeDefinitionFormDef> formDef;
    @XmlElement(name = "ItemGroupDef")
    protected List<ODMcomplexTypeDefinitionItemGroupDef> itemGroupDef;
    @XmlElement(name = "ItemDef")
    protected List<ODMcomplexTypeDefinitionItemDef> itemDef;
    @XmlElement(name = "CodeList")
    protected List<ODMcomplexTypeDefinitionCodeList> codeList;
    @XmlElement(name = "ImputationMethod")
    protected List<ODMcomplexTypeDefinitionImputationMethod> imputationMethod;
    @XmlElement(name = "Presentation")
    protected List<ODMcomplexTypeDefinitionPresentation> presentation;
    @XmlElement(name = "ConditionDef")
    protected List<ODMcomplexTypeDefinitionConditionDef> conditionDef;
    @XmlElement(name = "MethodDef")
    protected List<ODMcomplexTypeDefinitionMethodDef> methodDef;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Description")
    protected String description;

    
    public ODMcomplexTypeDefinitionMetaDataVersion() {
        super();
    }

    
    public ODMcomplexTypeDefinitionMetaDataVersion(final ODMcomplexTypeDefinitionInclude include, final ODMcomplexTypeDefinitionProtocol protocol, final List<ODMcomplexTypeDefinitionStudyEventDef> studyEventDef, final List<ODMcomplexTypeDefinitionFormDef> formDef, final List<ODMcomplexTypeDefinitionItemGroupDef> itemGroupDef, final List<ODMcomplexTypeDefinitionItemDef> itemDef, final List<ODMcomplexTypeDefinitionCodeList> codeList, final List<ODMcomplexTypeDefinitionImputationMethod> imputationMethod, final List<ODMcomplexTypeDefinitionPresentation> presentation, final List<ODMcomplexTypeDefinitionConditionDef> conditionDef, final List<ODMcomplexTypeDefinitionMethodDef> methodDef, final String oid, final String name, final String description) {
        this.include = include;
        this.protocol = protocol;
        this.studyEventDef = studyEventDef;
        this.formDef = formDef;
        this.itemGroupDef = itemGroupDef;
        this.itemDef = itemDef;
        this.codeList = codeList;
        this.imputationMethod = imputationMethod;
        this.presentation = presentation;
        this.conditionDef = conditionDef;
        this.methodDef = methodDef;
        this.oid = oid;
        this.name = name;
        this.description = description;
    }

    
    public ODMcomplexTypeDefinitionInclude getInclude() {
        return include;
    }

    
    public void setInclude(ODMcomplexTypeDefinitionInclude value) {
        this.include = value;
    }

    
    public ODMcomplexTypeDefinitionProtocol getProtocol() {
        return protocol;
    }

    
    public void setProtocol(ODMcomplexTypeDefinitionProtocol value) {
        this.protocol = value;
    }

    
    public List<ODMcomplexTypeDefinitionStudyEventDef> getStudyEventDef() {
        if (studyEventDef == null) {
            studyEventDef = new ArrayList<ODMcomplexTypeDefinitionStudyEventDef>();
        }
        return this.studyEventDef;
    }

    
    public List<ODMcomplexTypeDefinitionFormDef> getFormDef() {
        if (formDef == null) {
            formDef = new ArrayList<ODMcomplexTypeDefinitionFormDef>();
        }
        return this.formDef;
    }

    
    public List<ODMcomplexTypeDefinitionItemGroupDef> getItemGroupDef() {
        if (itemGroupDef == null) {
            itemGroupDef = new ArrayList<ODMcomplexTypeDefinitionItemGroupDef>();
        }
        return this.itemGroupDef;
    }

    
    public List<ODMcomplexTypeDefinitionItemDef> getItemDef() {
        if (itemDef == null) {
            itemDef = new ArrayList<ODMcomplexTypeDefinitionItemDef>();
        }
        return this.itemDef;
    }

    
    public List<ODMcomplexTypeDefinitionCodeList> getCodeList() {
        if (codeList == null) {
            codeList = new ArrayList<ODMcomplexTypeDefinitionCodeList>();
        }
        return this.codeList;
    }

    
    public List<ODMcomplexTypeDefinitionImputationMethod> getImputationMethod() {
        if (imputationMethod == null) {
            imputationMethod = new ArrayList<ODMcomplexTypeDefinitionImputationMethod>();
        }
        return this.imputationMethod;
    }

    
    public List<ODMcomplexTypeDefinitionPresentation> getPresentation() {
        if (presentation == null) {
            presentation = new ArrayList<ODMcomplexTypeDefinitionPresentation>();
        }
        return this.presentation;
    }

    
    public List<ODMcomplexTypeDefinitionConditionDef> getConditionDef() {
        if (conditionDef == null) {
            conditionDef = new ArrayList<ODMcomplexTypeDefinitionConditionDef>();
        }
        return this.conditionDef;
    }

    
    public List<ODMcomplexTypeDefinitionMethodDef> getMethodDef() {
        if (methodDef == null) {
            methodDef = new ArrayList<ODMcomplexTypeDefinitionMethodDef>();
        }
        return this.methodDef;
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

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String value) {
        this.description = value;
    }

}
