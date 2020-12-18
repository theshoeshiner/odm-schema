
package org.cdisc.odm.v132.status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.cdisc.odm.v132.YesOrNo;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusData")
public class StatusData {

    @XmlAttribute(name = "Entered")
    protected YesOrNo entered;
    @XmlAttribute(name = "Frozen")
    protected YesOrNo frozen;
    @XmlAttribute(name = "Conformant")
    protected YesOrNo conformant;

    
    public YesOrNo getEntered() {
        return entered;
    }

    
    public void setEntered(YesOrNo value) {
        this.entered = value;
    }

    
    public YesOrNo getFrozen() {
        return frozen;
    }

    
    public void setFrozen(YesOrNo value) {
        this.frozen = value;
    }

    
    public YesOrNo getConformant() {
        return conformant;
    }

    
    public void setConformant(YesOrNo value) {
        this.conformant = value;
    }

}
