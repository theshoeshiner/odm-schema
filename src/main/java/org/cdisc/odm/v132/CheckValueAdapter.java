package org.cdisc.odm.v132;

import javax.xml.bind.annotation.adapters.XmlAdapter;

//FIXME REMOVE
@Deprecated
public class CheckValueAdapter extends XmlAdapter<ODMcomplexTypeDefinitionCheckValue, String>{

	@Override
	public String unmarshal(ODMcomplexTypeDefinitionCheckValue v) throws Exception {
		if(v == null) return null;
		else return v.getValue();
	}

	@Override
	public ODMcomplexTypeDefinitionCheckValue marshal(String v) throws Exception {
		if(v==null) return null;
		else {
			ODMcomplexTypeDefinitionCheckValue cv = new ODMcomplexTypeDefinitionCheckValue();
			cv.setValue(v);
			return cv;
		}
	}

}

