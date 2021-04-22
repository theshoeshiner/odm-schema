package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OdmValidationEventHandler implements ValidationEventHandler {

	protected static final Logger LOGGER = LoggerFactory.getLogger(OdmValidationEventHandler.class);
	
	protected int failureLevel = 2;
	protected List<ValidationEvent> events = new ArrayList<>();
	
	public OdmValidationEventHandler() {}
	
	public OdmValidationEventHandler(int faillevel) {
		this.failureLevel = faillevel;
	}
	
	@Override
	public boolean handleEvent(ValidationEvent event) {
		events.add(event);
		
		LOGGER.error("Level {} Validation Error Line: {} Msg: {}",event.getSeverity(),event.getLocator().getLineNumber(),event.getMessage(),event.getLinkedException());
		
		return event.getSeverity() < failureLevel;

	}

}
