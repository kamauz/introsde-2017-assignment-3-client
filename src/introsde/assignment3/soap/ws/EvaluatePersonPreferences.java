
package introsde.assignment3.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per evaluatePersonPreferences complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="evaluatePersonPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activityIn" type="{http://ws.soap.assignment3.introsde/}activity" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluatePersonPreferences", propOrder = {
    "personId",
    "activityIn",
    "rating"
})
public class EvaluatePersonPreferences {

    protected int personId;
    protected Activity activityIn;
    protected int rating;

    /**
     * Recupera il valore della proprietà personId.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Imposta il valore della proprietà personId.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

    /**
     * Recupera il valore della proprietà activityIn.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivityIn() {
        return activityIn;
    }

    /**
     * Imposta il valore della proprietà activityIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivityIn(Activity value) {
        this.activityIn = value;
    }

    /**
     * Recupera il valore della proprietà rating.
     * 
     */
    public int getRating() {
        return rating;
    }

    /**
     * Imposta il valore della proprietà rating.
     * 
     */
    public void setRating(int value) {
        this.rating = value;
    }

}
