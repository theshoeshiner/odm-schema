
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-AuditRecords", propOrder = {
    "auditRecord"
})
public class ODMcomplexTypeDefinitionAuditRecords {

    @XmlElement(name = "AuditRecord")
    protected List<ODMcomplexTypeDefinitionAuditRecord> auditRecord;

    
    public List<ODMcomplexTypeDefinitionAuditRecord> getAuditRecord() {
        if (auditRecord == null) {
            auditRecord = new ArrayList<ODMcomplexTypeDefinitionAuditRecord>();
        }
        return this.auditRecord;
    }

}
