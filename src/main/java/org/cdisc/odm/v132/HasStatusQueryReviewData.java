package org.cdisc.odm.v132;

import java.util.List;

import org.cdisc.odm.v132.query.QueryData;
import org.cdisc.odm.v132.review.ReviewData;
import org.cdisc.odm.v132.status.StatusData;

public interface HasStatusQueryReviewData {

	  public List<QueryData> getQueryData();
	  public List<ReviewData> getReviewData();
	  public StatusData getStatusData();
	
}
