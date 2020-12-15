
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Decode", propOrder = {
    "translatedText"
})
public class ODMcomplexTypeDefinitionDecode {

    @XmlElement(name = "TranslatedText", required = true)
    protected List<ODMcomplexTypeDefinitionTranslatedText> translatedText;

    
    public List<ODMcomplexTypeDefinitionTranslatedText> getTranslatedText() {
        if (translatedText == null) {
            translatedText = new ArrayList<ODMcomplexTypeDefinitionTranslatedText>();
        }
        return this.translatedText;
    }

}
