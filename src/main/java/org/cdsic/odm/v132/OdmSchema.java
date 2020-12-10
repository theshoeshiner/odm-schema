package org.cdsic.odm.v132;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;

public class OdmSchema {

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
		Unmarshaller um = getContext().createUnmarshaller();
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
	}
	
	protected static JAXBContext generateContextObject() throws JAXBException, IOException, SAXException{
		return JAXBContext.newInstance(ODM.class);
	}
	

}
