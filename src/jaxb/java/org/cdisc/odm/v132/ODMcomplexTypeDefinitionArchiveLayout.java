
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ArchiveLayout")
public class ODMcomplexTypeDefinitionArchiveLayout {

    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "PdfFileName", required = true)
    protected String pdfFileName;
    @XmlAttribute(name = "PresentationOID")
    protected String presentationOID;

    
    public ODMcomplexTypeDefinitionArchiveLayout() {
        super();
    }

    
    public ODMcomplexTypeDefinitionArchiveLayout(final String oid, final String pdfFileName, final String presentationOID) {
        this.oid = oid;
        this.pdfFileName = pdfFileName;
        this.presentationOID = presentationOID;
    }

    
    public String getOID() {
        return oid;
    }

    
    public void setOID(String value) {
        this.oid = value;
    }

    
    public String getPdfFileName() {
        return pdfFileName;
    }

    
    public void setPdfFileName(String value) {
        this.pdfFileName = value;
    }

    
    public String getPresentationOID() {
        return presentationOID;
    }

    
    public void setPresentationOID(String value) {
        this.presentationOID = value;
    }

}
