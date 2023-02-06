package org.cdisc.odm.v132;

import java.util.List;

import org.cdisc.odm.v132.query.QueryData;
import org.cdisc.odm.v132.review.ReviewData;
import org.cdisc.odm.v132.status.StatusData;

public interface HasStatusQueryReviewData {

	  public List<QueryData> getQueryData();
	  public List<ReviewData> getReviewData();
	  public StatusData getStatusData();
	
	//List<Object> getDataElementExtension();
	/*
	  public default List<QueryData> getQueryData(){
		  return getDataElementExtension().stream().filter(o -> o instanceof QueryData).map(o -> (QueryData)o).collect(Collectors.toList());
	  }
	
	  public default List<ReviewData> getReviewData(){
		  return getDataElementExtension().stream().filter(o -> o instanceof ReviewData).map(o -> (ReviewData)o).collect(Collectors.toList());
	  }
	
	    
	  public default StatusData getStatusData() {
		  return getDataElementExtension().stream().filter(o -> o instanceof StatusData).map(o -> (StatusData)o).findFirst().orElse(null);
	  }
	*/
	
}
