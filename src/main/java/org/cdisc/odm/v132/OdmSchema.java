package org.cdisc.odm.v132;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3.dom.ls.ClasspathResourceResolver;
import org.xml.sax.SAXException;

public class OdmSchema {

	protected static final Logger LOGGER = LoggerFactory.getLogger(OdmSchema.class);

	private static JAXBContext CONTEXT;
	
	private static final String SCHEMA_FILE = "ODM1-3-2-extended.xsd";
	private static Schema SCHEMA;

	public static JAXBContext getContext() {
		if (CONTEXT == null) {
			try {
				generateObjects();
			} catch (JAXBException | IOException | SAXException | URISyntaxException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			} 
		}
		return CONTEXT;
	}
	
	public static Schema getSchema() {
		if (SCHEMA == null) {
			try {
				generateObjects();
			} catch (JAXBException | IOException | SAXException | URISyntaxException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			} 
		}
		return SCHEMA;

	}
	
	public static ODM parseOdmStream(InputStream stream) throws JAXBException {
		return parseOdmStream(stream, -1);
	}
	
	public static ODM parseOdmStream(InputStream stream, int failOnSeverity,int stackOn,int logOn) throws JAXBException {
		return (ODM) parseStreamInternal(stream,failOnSeverity,stackOn,logOn);
	}

	public static ODM parseOdmStream(InputStream stream, int failOnSeverity) throws JAXBException {
		ODM odm = (ODM) parseStreamInternal(stream,failOnSeverity,-1,-1);
		return odm;
	}
	
	public static void marshalOdm(ODM odm,OutputStream stream) throws JAXBException {
		marshalOdm(odm, stream, -1);
	}
	
	public static void marshalOdm(ODM odm,OutputStream stream, int failOnSeverity) throws JAXBException {
		marshalStreamInternal(odm, stream, failOnSeverity,-1,-1);
	}

	protected static Object parseStreamInternal(InputStream stream, int failOnSeverity,int stackOn,int logOn) throws JAXBException {
		Schema schema = getSchema();
		Unmarshaller um = getContext().createUnmarshaller();
		um.setEventHandler(new OdmValidationEventHandler(failOnSeverity,stackOn,logOn));
		um.setSchema(schema);
		StreamSource source = new StreamSource(stream);
		Object object = um.unmarshal(source);
		if (object instanceof JAXBElement<?>) {
			JAXBElement<?> element = (JAXBElement<?>) object;
			object = element.getValue();
		}
		return object;
	}
	
	protected static void marshalStreamInternal(Object object,OutputStream stream, int failOnSeverity,int stackOn,int logOn) throws JAXBException {
		Schema schema = getSchema();
		Marshaller mar = getContext().createMarshaller();
		mar.setSchema(schema);
		mar.setEventHandler(new OdmValidationEventHandler(failOnSeverity,stackOn,logOn));
		mar.marshal(object, stream);
	}

	protected static void generateObjects() throws JAXBException, IOException, SAXException, URISyntaxException {
		CONTEXT = generateContextObject();
		SCHEMA = generateSchemaObject();
	}

	protected static JAXBContext generateContextObject() throws JAXBException, IOException, SAXException {
		return JAXBContext.newInstance(ODM.class);
	}

	

	

	protected static Schema generateSchemaObject() throws JAXBException, IOException, SAXException, URISyntaxException {
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		schemaFactory.setResourceResolver(new ClasspathResourceResolver(OdmSchema.class));
		InputStream is = OdmSchema.class.getResourceAsStream(SCHEMA_FILE);
		Schema schema = schemaFactory.newSchema(new Source[] { new StreamSource(is)});
		return schema;
	}
}
