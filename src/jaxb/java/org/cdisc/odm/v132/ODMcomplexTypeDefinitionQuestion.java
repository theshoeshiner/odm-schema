
package org.cdisc.odm.v132;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Question", propOrder = {
    "translatedText"
})
public class ODMcomplexTypeDefinitionQuestion {

    @XmlElement(name = "TranslatedText", required = true)
    protected List<ODMcomplexTypeDefinitionTranslatedText> translatedText;

    
    public ODMcomplexTypeDefinitionQuestion() {
        super();
    }

    
    public ODMcomplexTypeDefinitionQuestion(final List<ODMcomplexTypeDefinitionTranslatedText> translatedText) {
        this.translatedText = translatedText;
    }

    
    public List<ODMcomplexTypeDefinitionTranslatedText> getTranslatedText() {
        if (translatedText == null) {
            translatedText = new ArrayList<ODMcomplexTypeDefinitionTranslatedText>();
        }
        return this.translatedText;
    }

}
