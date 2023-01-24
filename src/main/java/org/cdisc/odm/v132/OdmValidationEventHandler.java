package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OdmValidationEventHandler implements ValidationEventHandler {

	protected static final Logger LOGGER = LoggerFactory.getLogger(OdmValidationEventHandler.class);
	
	protected int failOnSeverity = ValidationEvent.ERROR+1;
	protected int stacktraceOnSeverity = ValidationEvent.ERROR;
	protected int logOnSeverity = ValidationEvent.ERROR;
	protected List<ValidationEvent> events = new ArrayList<>();
	
	public OdmValidationEventHandler() {}
	

	public OdmValidationEventHandler(int failOnSeverity, int stacktraceOnSeverity, int logOnSeverity) {
		this.failOnSeverity = failOnSeverity;
		this.logOnSeverity = logOnSeverity;
		this.stacktraceOnSeverity = stacktraceOnSeverity;
		LOGGER.trace("OdmValidationEventHandler failOnSeverity: {} stacktraceOnSeverity: {} logOnSeverity: {}",failOnSeverity,stacktraceOnSeverity,logOnSeverity);
	}



	public OdmValidationEventHandler(int failOnSeverity) {
		this(failOnSeverity,failOnSeverity-1,failOnSeverity-2);
	}
	
	@Override
	public boolean handleEvent(ValidationEvent event) {
		events.add(event);
		if (stacktraceOnSeverity >= 0 && event.getSeverity() >= stacktraceOnSeverity) {
			LOGGER.error("Level {} Validation Error Line: {}",event.getSeverity(),event.getLocator().getLineNumber(),event.getLinkedException());
		}
		else if (logOnSeverity >= 0 && event.getSeverity() >= logOnSeverity) {
			LOGGER.warn("Level {} Validation Error Line: {} Msg: {}",event.getSeverity(),event.getLocator().getLineNumber(),event.getMessage());
		}
		return !(failOnSeverity >=0 && event.getSeverity() >= failOnSeverity);
	}

}
