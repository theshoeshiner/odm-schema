package org.cdisc.odm;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;
import org.xml.sax.SAXException;


public class XsltTest {

	@Test
	 public void test () throws ParserConfigurationException, SAXException, IOException, TransformerException {

		 String stylesheet = "transform.xsl";
		 String source = "clinical.xml";
    	 //File stylesheet = new File(argv[0]);
         //File datafile = new File(argv[1]);

         //DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         //DocumentBuilder builder = factory.newDocumentBuilder();
         //Document document = builder.parse(XsltTest.class.getResourceAsStream(source));

         StreamSource sourcestream = new StreamSource(XsltTest.class.getResourceAsStream(source)); 
         
         TransformerFactory tf = new net.sf.saxon.TransformerFactoryImpl();
         //TransformerFactory tf = TransformerFactory.newInstance();
         //Source xslt = new StreamSource(new File("transform.xslt"));
         //Transformer transformer = factory.newTransformer(xslt);
         
         
         StreamSource stylesource = new StreamSource(XsltTest.class.getResourceAsStream(stylesheet)); 
         Transformer transformer = tf.newTransformer(stylesource);
         
         
	        
         transformer.transform(sourcestream, new StreamResult(new File("output.xml")));
	 }	
	
}
