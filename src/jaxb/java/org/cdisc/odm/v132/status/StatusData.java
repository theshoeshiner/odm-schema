
package org.cdisc.odm.v132.status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.cdisc.odm.v132.YesOrNoAdapter;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusData")
public class StatusData {

    @XmlAttribute(name = "Entered")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean entered;
    @XmlAttribute(name = "Frozen")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean frozen;
    @XmlAttribute(name = "Conformant")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean conformant;

    
    public Boolean getEntered() {
        return entered;
    }

    
    public void setEntered(Boolean value) {
        this.entered = value;
    }

    
    public Boolean getFrozen() {
        return frozen;
    }

    
    public void setFrozen(Boolean value) {
        this.frozen = value;
    }

    
    public Boolean getConformant() {
        return conformant;
    }

    
    public void setConformant(Boolean value) {
        this.conformant = value;
    }

}
