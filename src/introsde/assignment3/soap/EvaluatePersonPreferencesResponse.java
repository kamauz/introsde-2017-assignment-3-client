
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per evaluatePersonPreferencesResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="evaluatePersonPreferencesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evaluatePersonPreferences" type="{http://soap.assignment3.introsde/}preference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluatePersonPreferencesResponse", propOrder = {
    "evaluatePersonPreferences"
})
public class EvaluatePersonPreferencesResponse {

    protected Preference evaluatePersonPreferences;

    /**
     * Recupera il valore della proprietà evaluatePersonPreferences.
     * 
     * @return
     *     possible object is
     *     {@link Preference }
     *     
     */
    public Preference getEvaluatePersonPreferences() {
        return evaluatePersonPreferences;
    }

    /**
     * Imposta il valore della proprietà evaluatePersonPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link Preference }
     *     
     */
    public void setEvaluatePersonPreferences(Preference value) {
        this.evaluatePersonPreferences = value;
    }

}
