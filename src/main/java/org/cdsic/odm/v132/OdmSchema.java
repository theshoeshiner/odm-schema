package org.cdsic.odm.v132;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class OdmSchema {

	protected static final Logger LOGGER = LoggerFactory.getLogger(OdmSchema.class);
	
	private static JAXBContext CONTEXT;
	
	public static JAXBContext getContext() {
		if(CONTEXT == null) {
			try {
				generateObjects();
			}
			catch(JAXBException e){
				throw new RuntimeException("Could not generate Schema object",e);
			} catch (IOException e) {
				throw new RuntimeException("Could not generate Schema object",e);
			} catch (SAXException e) {
				throw new RuntimeException("Could not generate Schema object",e);
			} catch (URISyntaxException e) {
				throw new RuntimeException("Could not generate Schema object",e);
			}
		}
		return CONTEXT;
	}
	
	public static ODM parseOdmStream(InputStream stream) throws JAXBException {
		ODM odm = (ODM) parseStreamInternal(stream);
		return odm;
	}
	
	protected static Object parseStreamInternal(InputStream stream) throws JAXBException {
		Schema schema = getSchema();
		Unmarshaller um = getContext().createUnmarshaller();
		um.setSchema(schema);
		StreamSource source = new StreamSource(stream);
		Object object = um.unmarshal(source);
		if(object instanceof JAXBElement<?>){
			JAXBElement<?> element = (JAXBElement<?>) object;
			object = element.getValue();
		}
		return object;
	}
	
	protected static void generateObjects() throws JAXBException, IOException, SAXException, URISyntaxException{
		CONTEXT = generateContextObject();
		SCHEMA = generateSchemaObject();
	}
	
	protected static JAXBContext generateContextObject() throws JAXBException, IOException, SAXException{
		return JAXBContext.newInstance(ODM.class);
	}
	
	private static final String SCHEMA_FILE = "ODM1-3-2.xsd";
	private static Schema SCHEMA;
	
	public static Schema getSchema() {
		if(SCHEMA == null) {
			try {
				generateObjects();
			}
			catch(JAXBException e){
				throw new RuntimeException("Could not generate Schema object",e);
			} catch (IOException e) {
				throw new RuntimeException("Could not generate Schema object",e);
			} catch (SAXException e) {
				throw new RuntimeException("Could not generate Schema object",e);
			} catch (URISyntaxException e) {
				throw new RuntimeException("Could not generate Schema object",e);
			}
		}
		return SCHEMA;
		
	}
	
	protected static Schema generateSchemaObject() throws JAXBException, IOException, SAXException, URISyntaxException{
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		//schemaFactory.setResourceResolver(new ClassResourceResolver(RaveOdmSchema.class));
		schemaFactory.setErrorHandler(new ErrorHandler() {
			public void warning(SAXParseException exception) throws SAXException {}
			public void fatalError(SAXParseException exception) throws SAXException {}
			public void error(SAXParseException exception) throws SAXException {}
		});
		Schema schema = schemaFactory.newSchema(new Source[]{
			new StreamSource(OdmSchema.class.getResourceAsStream(SCHEMA_FILE)),
			//new StreamSource(RaveOdmSchema.class.getResourceAsStream(SUBJECTS_SCHEMA)),
		});
		LOGGER.info("Schema: {}",schema);
		return schema;
	}
	

}
