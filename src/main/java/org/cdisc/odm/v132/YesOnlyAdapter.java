package org.cdisc.odm.v132;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class YesOnlyAdapter extends XmlAdapter<YesOnly, Boolean>{

	@Override
	public Boolean unmarshal(YesOnly v) throws Exception {
		if(v == null) return null;
		else return true;
	}

	@Override
	public YesOnly marshal(Boolean v) throws Exception {
		if(v==null) return null;
		else return v?YesOnly.YES:null;
	}

}