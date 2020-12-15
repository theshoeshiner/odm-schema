package org.cdisc.odm;

import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.cdisc.odm.v132.ODM;
import org.cdisc.odm.v132.ODMcomplexTypeDefinitionMetaDataVersion;
import org.cdisc.odm.v132.OdmSchema;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SchemaTest {

	protected static final Logger LOGGER = LoggerFactory.getLogger(SchemaTest.class);
	
	@Test
	public void testObjects() throws JAXBException{
		
		
		InputStream stream = SchemaTest.class.getResourceAsStream("odm-transactional.xml");
		
		/*
		  LOGGER.info("stream: {}",stream);
		  
		  JAXBContext context = OdmSchema.getContext();
		  
		  LOGGER.info("context: {}",context);
		  
		  Unmarshaller um = context.createUnmarshaller(); //um.setSchema(sm);
		  //um.setEventHandler(getValidationEventHandler());
		  
		  LOGGER.info("Unmarshaller: {}",um);
		  
		  StreamSource source = new StreamSource(stream);
		  
		  LOGGER.info("StreamSource: {}",source);*/
		 
		
		Object object = OdmSchema.parseOdmStream(stream);
		
		LOGGER.info("Unmarshalled: {}",object);
		
		ODM odm = (ODM) object;
		
		LOGGER.info("odm: {}",odm);
		
		List itemDefs = odm.getStudy().get(0).getMetaDataVersion().get(0).getItemDef();
		
		
		
		ODMcomplexTypeDefinitionMetaDataVersion mdv = odm.getStudy().get(0).getMetaDataVersion().get(0);
		
		LOGGER.info("mdv: {}", mdv);
		
		LOGGER.info("mdv: {}", mdv.getName());
		LOGGER.info("mdv: {}", mdv.getOID());
		LOGGER.info("protocol: {}", mdv.getProtocol());
		
		LOGGER.info("events: {}", mdv.getStudyEventDef());
		LOGGER.info("forms: {}", mdv.getFormDef());
		LOGGER.info("groups: {}", mdv.getItemGroupDef());
		
		try {
			LOGGER.info("items: {}", mdv.getItemDef().size());
		}
		catch(Exception e) {
			LOGGER.error("",e);
			
		}
		
		
		/* for(ODMcomplexTypeDefinitionItemDef id : mdv.getItemDef()) {
		 LOGGER.info("item: {}", id); }*/
		 
		
		//LOGGER.info("here2: {}", odm.getStudy().get(0).getMetaDataVersion().get(0).getItemDef());
		
		//LOGGER.info("itemDefs: {}",itemDefs);
		
		//LOGGER.info("Item defs: {} = {}",itemDefs.size(),itemDefs);
		
		
		/*
		 * if(object instanceof JAXBElement<?>){ JAXBElement<?> element =
		 * (JAXBElement<?>) object; object = element.getValue(); }
		 */
		
		
		//return object;
		
		//JAXBContext c = RaveOdmSchema.getContext();
		//Schema s = RaveOdmSchema.getSchema();
		//LOGGER.debug("context: {}",c);
		//LOGGER.debug("schema: {}",s);
		
		LOGGER.info("DONE");
		
	}
	
	@Test
	public void testFail() throws JAXBException {
		InputStream stream = SchemaTest.class.getResourceAsStream("odm-transactional-invalid.xml");
		ODM odm = OdmSchema.parseOdmStream(stream);
		LOGGER.info("ODM: {}",odm);
	}
	
}
