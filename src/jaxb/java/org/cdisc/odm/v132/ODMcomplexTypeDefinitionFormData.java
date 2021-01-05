
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cdisc.odm.v132.query.QueryData;
import org.cdisc.odm.v132.status.StatusData;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormData", propOrder = {
    "queryData",
    "statusData"
})
public class ODMcomplexTypeDefinitionFormData
    extends OriginalODMcomplexTypeDefinitionFormData
{

    @XmlElement(name = "QueryData", namespace = "http://www.cdisc.org/ns/odm/v1.3/query")
    protected List<QueryData> queryData;
    @XmlElement(name = "StatusData", namespace = "http://www.cdisc.org/ns/odm/v1.3/status")
    protected List<StatusData> statusData;

    
    public List<QueryData> getQueryData() {
        if (queryData == null) {
            queryData = new ArrayList<QueryData>();
        }
        return this.queryData;
    }

    
    public List<StatusData> getStatusData() {
        if (statusData == null) {
            statusData = new ArrayList<StatusData>();
        }
        return this.statusData;
    }

}
