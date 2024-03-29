
package org.cdisc.odm.v132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Picture")
public class ODMcomplexTypeDefinitionPicture {

    @XmlAttribute(name = "PictureFileName", required = true)
    protected String pictureFileName;
    @XmlAttribute(name = "ImageType")
    protected String imageType;

    
    public ODMcomplexTypeDefinitionPicture() {
        super();
    }

    
    public ODMcomplexTypeDefinitionPicture(final String pictureFileName, final String imageType) {
        this.pictureFileName = pictureFileName;
        this.imageType = imageType;
    }

    
    public String getPictureFileName() {
        return pictureFileName;
    }

    
    public void setPictureFileName(String value) {
        this.pictureFileName = value;
    }

    
    public String getImageType() {
        return imageType;
    }

    
    public void setImageType(String value) {
        this.imageType = value;
    }

}
