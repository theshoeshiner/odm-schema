package org.cdisc.odm.v132;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class YesOrNoAdapter extends XmlAdapter<String, Boolean>{
	
	public static final String YES = "Yes";
	public static final String NO = "No";

	@Override
	public Boolean unmarshal(String v) throws Exception {
		if(v == null) return null;
		else return v.equals(YES);
	}

	@Override
	public String marshal(Boolean v) throws Exception {
		if(v==null) return null;
		else return v?YES:NO;
	}

}

