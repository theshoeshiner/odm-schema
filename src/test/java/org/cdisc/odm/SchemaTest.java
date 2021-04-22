package org.cdisc.odm;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;

import org.cdisc.odm.v132.ODM;
import org.cdisc.odm.v132.ODMcomplexTypeDefinitionMetaDataVersion;
import org.cdisc.odm.v132.OdmSchema;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SuppressWarnings("unused")
public class SchemaTest {

	protected static final Logger LOGGER = LoggerFactory.getLogger(SchemaTest.class);
	
	
	@Test
	public void testTest2Snapshot1() throws JAXBException{
		javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter a;
		InputStream stream = SchemaTest.class.getResourceAsStream("test2-snapshot-1.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	@Test
	public void testTest2Snapshot2() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("test2-snapshot-2.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	@Test
	public void testTest2Snapshot3() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("test2-snapshot-3.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	@Test
	public void testTest3Transactional1() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("test3-transactional-1.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	@Test
	public void testHarrisonaTransactional1() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("harrisona-transactional-1.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	@Test
	public void testMediflex() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("mediflex.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	/*@Test
	public void testSnapshot2() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("odm-snapshot-2.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	@Test
	public void testSnapshot3() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("odm-snapshot-3.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	@Test
	public void testTransactional2() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("odm-transactional-2.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}*/
	
	/*	@Test
		public void testTransactional() throws JAXBException{
			 
			
			InputStream stream = SchemaTest.class.getResourceAsStream("odm-transactional.xml");
			
			Object object = OdmSchema.parseOdmStream(stream);
			
			LOGGER.info("Unmarshalled: {}",object);
			
			ODM odm = (ODM) object;
			ODMcomplexTypeDefinitionMetaDataVersion mdv = odm.getStudy().get(0).getMetaDataVersion().get(0);
	
			try {
				LOGGER.info("items: {}", mdv.getItemDef().size());
			}
			catch(Exception e) {
				LOGGER.error("",e);
				
			}
			
			
			odm.getClinicalData().forEach(cd -> {
				cd.getSubjectData().forEach(sd -> {
					sd.getStudyEventData().forEach(ed -> {
						ed.getFormData().forEach(fd -> {
							fd.getStatusData().forEach(s -> {
								LOGGER.info("status: {} = {}",sd.getSubjectKey(),s);
							});
							fd.getItemGroupData().forEach(gd -> {
								gd.getItemDataGroup().forEach(id -> {
									id.getQueryData().forEach(q -> {
										LOGGER.info("Query: {}",q.getQueryKey());
									});
								});
							});
						});
					});
				});
			});
			
	
			LOGGER.info("DONE");
			
		}
		*/
	@Test(expected = UnmarshalException.class )
	public void testFail() throws JAXBException {
		InputStream stream = SchemaTest.class.getResourceAsStream("test3-transactional-invalid.xml");
		ODM odm = OdmSchema.parseOdmStream(stream);
		LOGGER.info("ODM: {}",odm);
	}
	
}
