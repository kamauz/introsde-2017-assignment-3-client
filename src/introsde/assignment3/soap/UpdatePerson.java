
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updatePerson complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updatePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="p" type="{http://soap.assignment3.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePerson", propOrder = {
    "p"
})
public class UpdatePerson {

    protected Person p;

    /**
     * Recupera il valore della propriet� p.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getP() {
        return p;
    }

    /**
     * Imposta il valore della propriet� p.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setP(Person value) {
        this.p = value;
    }

}
