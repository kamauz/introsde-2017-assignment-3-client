
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readPersonPreferences2Response complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readPersonPreferences2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readPreferences" type="{http://soap.assignment3.introsde/}preference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonPreferences2Response", propOrder = {
    "readPreferences"
})
public class ReadPersonPreferences2Response {

    protected Preference readPreferences;

    /**
     * Recupera il valore della proprietà readPreferences.
     * 
     * @return
     *     possible object is
     *     {@link Preference }
     *     
     */
    public Preference getReadPreferences() {
        return readPreferences;
    }

    /**
     * Imposta il valore della proprietà readPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link Preference }
     *     
     */
    public void setReadPreferences(Preference value) {
        this.readPreferences = value;
    }

}
