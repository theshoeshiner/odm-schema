package org.cdisc.odm.v132;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
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
			} catch (JAXBException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			} catch (IOException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			} catch (SAXException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			} catch (URISyntaxException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			}
		}
		return CONTEXT;
	}
	
	public static Schema getSchema() {
		if (SCHEMA == null) {
			try {
				generateObjects();
			} catch (JAXBException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			} catch (IOException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			} catch (SAXException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			} catch (URISyntaxException e) {
				throw new RuntimeException("Could not generate Schema object", e);
			}
		}
		return SCHEMA;

	}
	
	public static ODM parseOdmStream(InputStream stream) throws JAXBException {
		return parseOdmStream(stream, ValidationEvent.FATAL_ERROR);
	}

	public static ODM parseOdmStream(InputStream stream, int faillevel) throws JAXBException {
		ODM odm = (ODM) parseStreamInternal(stream,faillevel);
		return odm;
	}

	protected static Object parseStreamInternal(InputStream stream, int failureLevel) throws JAXBException {
		Schema schema = getSchema();
		Unmarshaller um = getContext().createUnmarshaller();
		um.setEventHandler(new OdmValidationEventHandler(failureLevel));
		um.setSchema(schema);
		StreamSource source = new StreamSource(stream);
		Object object = um.unmarshal(source);
		if (object instanceof JAXBElement<?>) {
			JAXBElement<?> element = (JAXBElement<?>) object;
			object = element.getValue();
		}
		return object;
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
		LOGGER.info("stream: {}", is);

		Schema schema = schemaFactory.newSchema(new Source[] { new StreamSource(is)});

		LOGGER.info("Schema: {}", schema);
		return schema;
	}
}
