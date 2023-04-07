
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ErrorMessage", propOrder = {
    "translatedText"
})
public class ODMcomplexTypeDefinitionErrorMessage {

    @XmlElement(name = "TranslatedText", required = true)
    protected List<ODMcomplexTypeDefinitionTranslatedText> translatedText;

    
    public ODMcomplexTypeDefinitionErrorMessage() {
        super();
    }

    
    public ODMcomplexTypeDefinitionErrorMessage(final List<ODMcomplexTypeDefinitionTranslatedText> translatedText) {
        this.translatedText = translatedText;
    }

    
    public List<ODMcomplexTypeDefinitionTranslatedText> getTranslatedText() {
        if (translatedText == null) {
            translatedText = new ArrayList<ODMcomplexTypeDefinitionTranslatedText>();
        }
        return this.translatedText;
    }

}
