
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

    @XmlAttribute(name = "Verified")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean verified;
    @XmlAttribute(name = "Frozen")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean frozen;
    @XmlAttribute(name = "Locked")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean locked;
    @XmlAttribute(name = "Conformant")
    @XmlJavaTypeAdapter(YesOrNoAdapter.class)
    protected Boolean conformant;

    
    public StatusData() {
        super();
    }

    
    public StatusData(final Boolean verified, final Boolean frozen, final Boolean locked, final Boolean conformant) {
        this.verified = verified;
        this.frozen = frozen;
        this.locked = locked;
        this.conformant = conformant;
    }

    
    public Boolean getVerified() {
        return verified;
    }

    
    public void setVerified(Boolean value) {
        this.verified = value;
    }

    
    public Boolean getFrozen() {
        return frozen;
    }

    
    public void setFrozen(Boolean value) {
        this.frozen = value;
    }

    
    public Boolean getLocked() {
        return locked;
    }

    
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    
    public Boolean getConformant() {
        return conformant;
    }

    
    public void setConformant(Boolean value) {
        this.conformant = value;
    }

}
