package org.cdisc.odm;

import java.io.InputStream;

import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;

import org.cdisc.odm.v132.ODM;
import org.cdisc.odm.v132.ODMcomplexTypeDefinitionMetaDataVersion;
import org.cdisc.odm.v132.OdmSchema;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class SchemaTest {

	protected static final Logger LOGGER = LoggerFactory.getLogger(SchemaTest.class);
	
	
	@Test
	public void testSnapshot() throws JAXBException{
		InputStream stream = SchemaTest.class.getResourceAsStream("odm-snapshot.xml");
		Object object = OdmSchema.parseOdmStream(stream);
	}
	
	@Test
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
	}
	
	@Test
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
	
	@Test(expected = UnmarshalException.class )
	public void testFail() throws JAXBException {
		InputStream stream = SchemaTest.class.getResourceAsStream("odm-transactional-invalid.xml");
		ODM odm = OdmSchema.parseOdmStream(stream);
		LOGGER.info("ODM: {}",odm);
	}
	
}
