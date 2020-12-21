package org.cdisc.odm.v132;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class YesOrNoAdapter extends XmlAdapter<YesOrNo, Boolean>{

	@Override
	public Boolean unmarshal(YesOrNo v) throws Exception {
		if(v == null) return null;
		else return v == YesOrNo.YES;
	}

	@Override
	public YesOrNo marshal(Boolean v) throws Exception {
		if(v==null) return null;
		else return v?YesOrNo.YES:YesOrNo.NO;
	}

}

