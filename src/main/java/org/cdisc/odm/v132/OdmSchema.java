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
import javax.xml.bind.ValidationEventHandler;
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

	public static ODM parseOdmStream(InputStream stream) throws JAXBException {
		ODM odm = (ODM) parseStreamInternal(stream);
		return odm;
	}

	protected static Object parseStreamInternal(InputStream stream) throws JAXBException {
		Schema schema = getSchema();
		Unmarshaller um = getContext().createUnmarshaller();
		um.setEventHandler(new ValidationEventHandler() {

			@Override
			public boolean handleEvent(ValidationEvent event) {
				
				String message = event.getMessage();
				if(message.matches(".*?UC-MDV-OID-unique.*?")) {
					//skip
				}
				else {
					LOGGER.error("Level {} Validation Error Line: {} Msg: {}",event.getSeverity(),event.getLocator().getLineNumber(),event.getMessage(),event.getLinkedException());
				}
				
				//Object node = event.getLocator().getLineNumber();
				//LOGGER.error("handle event: {} , {}", event.getSeverity(), event.getMessage());
				
				
				//LOGGER.error("Object: {}",node);
				//event.getLinkedException()
				return true;
			}
		});
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

	private static final String SCHEMA_FILE = "ODM1-3-2.xsd";
	private static Schema SCHEMA;

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

	protected static Schema generateSchemaObject() throws JAXBException, IOException, SAXException, URISyntaxException {
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		//schemaFactory.setResourceResolver(new ClassResourceResolver(OdmSchema.class));
		schemaFactory.setResourceResolver(new ClasspathResourceResolver(OdmSchema.class));
		/*
		* schemaFactory.setErrorHandler(new ErrorHandler() { public void
		* warning(SAXParseException exception) throws SAXException {} public void
		* fatalError(SAXParseException exception) throws SAXException {} public void
		* error(SAXParseException exception) throws SAXException {} });
		*/

		InputStream is = OdmSchema.class.getResourceAsStream(SCHEMA_FILE);
		LOGGER.info("stream: {}", is);

		Schema schema = schemaFactory.newSchema(new Source[] { new StreamSource(is),
				//new StreamSource(OdmSchema.class.getResourceAsStream("ODM1-3-2-foundation.xsd")),
				//new StreamSource(RaveOdmSchema.class.getResourceAsStream(SUBJECTS_SCHEMA)),
		});

		LOGGER.info("Schema: {}", schema);
		return schema;
	}

	/*public static class ResourceResolver implements LSResourceResolver {
	
		@Override
		public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId,
				String baseURI) {
			LOGGER.info("Resolve resource: {},{},{},{},{}",
					new Object[] { type, namespaceURI, publicId, systemId, baseURI });
	
		
	
			InputStream is = OdmSchema.class.getResourceAsStream(systemId);
			if (is == null)
				throw new IllegalArgumentException(systemId + " was null");
	
			LSInputImpl ls = new LSInputImpl(publicId, systemId, namespaceURI, is);
	
			return ls;
		}
	
	}
	
	public static class LSInputImpl implements LSInput {
	
		public LSInputImpl(String publicId, String systemId, String baseURI, InputStream byteStream) {
			super();
			this.publicId = publicId;
			this.systemId = systemId;
			this.baseURI = baseURI;
			this.byteStream = byteStream;
		}
	
		protected String publicId = null;
		protected String systemId = null;
		protected String baseSystemId = null;
		protected String baseURI = null;
		protected InputStream byteStream = null;
		protected Reader charStream = null;
		protected String data = null;
		protected String encoding = null;
		protected Boolean certifiedText = false;
	
		public String getPublicId() {
			return publicId;
		}
	
		public void setPublicId(String publicId) {
			this.publicId = publicId;
		}
	
		public String getSystemId() {
			return systemId;
		}
	
		public void setSystemId(String systemId) {
			this.systemId = systemId;
		}
	
		public String getBaseSystemId() {
			return baseSystemId;
		}
	
		public void setBaseSystemId(String baseSystemId) {
			this.baseSystemId = baseSystemId;
		}
	
		public InputStream getByteStream() {
			return byteStream;
		}
	
		public void setByteStream(InputStream byteStream) {
			this.byteStream = byteStream;
		}
	
		public boolean getCertifiedText() {
			return certifiedText;
		}
	
		public void setCertifiedText(boolean certifiedText) {
			this.certifiedText = certifiedText;
		}
	
		public String getEncoding() {
			return encoding;
		}
	
		public void setEncoding(String encoding) {
			this.encoding = encoding;
		}
	
		public String getBaseURI() {
			return baseURI;
		}
	
		public void setBaseURI(String baseURI) {
			this.baseURI = baseURI;
		}
	
		@Override
		public Reader getCharacterStream() {
			return charStream;
		}
	
		@Override
		public void setCharacterStream(Reader characterStream) {
			this.charStream = characterStream;
		}
	
		@Override
		public String getStringData() {
			return data;
		}
	
		@Override
		public void setStringData(String stringData) {
			this.data = stringData;
		}
	
	}
	*/
}
