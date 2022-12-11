
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cdisc.odm.v132.query.QueryData;
import org.cdisc.odm.v132.review.ReviewData;
import org.cdisc.odm.v132.status.StatusData;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormData", propOrder = {
    "queryData",
    "reviewData",
    "statusData"
})
public class ODMcomplexTypeDefinitionFormData
    extends OriginalODMcomplexTypeDefinitionFormData
{

    @XmlElement(name = "QueryData", namespace = "http://www.cdisc.org/ns/odm/v1.3/query")
    protected List<QueryData> queryData;
    @XmlElement(name = "ReviewData", namespace = "http://www.cdisc.org/ns/odm/v1.3/review")
    protected List<ReviewData> reviewData;
    @XmlElement(name = "StatusData", namespace = "http://www.cdisc.org/ns/odm/v1.3/status")
    protected StatusData statusData;

    
    public ODMcomplexTypeDefinitionFormData() {
        super();
    }

    
    public ODMcomplexTypeDefinitionFormData(final ODMcomplexTypeDefinitionAuditRecord auditRecord, final ODMcomplexTypeDefinitionSignature signature, final ODMcomplexTypeDefinitionArchiveLayoutRef archiveLayoutRef, final List<ODMcomplexTypeDefinitionAnnotation> annotation, final List<ODMcomplexTypeDefinitionItemGroupData> itemGroupData, final String formOID, final String formRepeatKey, final TransactionType transactionType, final Object auditRecordID, final List<QueryData> queryData, final List<ReviewData> reviewData, final StatusData statusData) {
        super(auditRecord, signature, archiveLayoutRef, annotation, itemGroupData, formOID, formRepeatKey, transactionType, auditRecordID);
        this.queryData = queryData;
        this.reviewData = reviewData;
        this.statusData = statusData;
    }

    
    public List<QueryData> getQueryData() {
        if (queryData == null) {
            queryData = new ArrayList<QueryData>();
        }
        return this.queryData;
    }

    
    public List<ReviewData> getReviewData() {
        if (reviewData == null) {
            reviewData = new ArrayList<ReviewData>();
        }
        return this.reviewData;
    }

    
    public StatusData getStatusData() {
        return statusData;
    }

    
    public void setStatusData(StatusData value) {
        this.statusData = value;
    }

}
