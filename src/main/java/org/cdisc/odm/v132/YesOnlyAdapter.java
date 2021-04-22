package org.cdisc.odm.v132;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class YesOnlyAdapter extends XmlAdapter<String, Boolean>{

	@Override
	public Boolean unmarshal(String v) throws Exception {
		if(v == null) return null;
		else return true;
	}

	@Override
	public String marshal(Boolean v) throws Exception {
		if(v==null) return null;
		else return v?YesOrNoAdapter.YES:null;
	}

}