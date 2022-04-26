package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OdmValidationEventHandler implements ValidationEventHandler {

	protected static final Logger LOGGER = LoggerFactory.getLogger(OdmValidationEventHandler.class);
	
	protected int allowEventSeverity = ValidationEvent.ERROR;
	protected int stackEventSeverity = ValidationEvent.ERROR;
	protected List<ValidationEvent> events = new ArrayList<>();
	
	public OdmValidationEventHandler() {}
	
	public OdmValidationEventHandler(int allowSeverity) {
		this.allowEventSeverity = allowSeverity;
	}
	
	@Override
	public boolean handleEvent(ValidationEvent event) {
		events.add(event);
		
		if (event.getSeverity() >= stackEventSeverity) {
			LOGGER.error("Level {} Validation Error Line: {}",event.getSeverity(),event.getLocator().getLineNumber(),event.getLinkedException());
		}
		else {
			LOGGER.warn("Level {} Validation Error Line: {} Msg: {}",event.getSeverity(),event.getLocator().getLineNumber(),event.getMessage());
		}

		return event.getSeverity() <= allowEventSeverity;
	}

}
