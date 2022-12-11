
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
@XmlType(name = "ODMcomplexTypeDefinition-SubjectData", propOrder = {
    "queryData",
    "reviewData",
    "statusData"
})
public class ODMcomplexTypeDefinitionSubjectData
    extends OriginalODMcomplexTypeDefinitionSubjectData
{

    @XmlElement(name = "QueryData", namespace = "http://www.cdisc.org/ns/odm/v1.3/query")
    protected List<QueryData> queryData;
    @XmlElement(name = "ReviewData", namespace = "http://www.cdisc.org/ns/odm/v1.3/review")
    protected List<ReviewData> reviewData;
    @XmlElement(name = "StatusData", namespace = "http://www.cdisc.org/ns/odm/v1.3/status")
    protected StatusData statusData;

    
    public ODMcomplexTypeDefinitionSubjectData() {
        super();
    }

    
    public ODMcomplexTypeDefinitionSubjectData(final ODMcomplexTypeDefinitionAuditRecord auditRecord, final ODMcomplexTypeDefinitionSignature signature, final ODMcomplexTypeDefinitionInvestigatorRef investigatorRef, final ODMcomplexTypeDefinitionSiteRef siteRef, final List<ODMcomplexTypeDefinitionAnnotation> annotation, final List<ODMcomplexTypeDefinitionStudyEventData> studyEventData, final String subjectKey, final TransactionType transactionType, final String subjectName, final String subjectNumber, final Object auditRecordID, final List<QueryData> queryData, final List<ReviewData> reviewData, final StatusData statusData) {
        super(auditRecord, signature, investigatorRef, siteRef, annotation, studyEventData, subjectKey, transactionType, subjectName, subjectNumber, auditRecordID);
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
