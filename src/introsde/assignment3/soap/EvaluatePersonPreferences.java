
package introsde.assignment3.soap;

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
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://soap.assignment3.introsde/}preference" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "arg0",
    "arg1",
    "arg2"
})
public class EvaluatePersonPreferences {

    protected Long arg0;
    protected Preference arg1;
    protected int arg2;

    /**
     * Recupera il valore della propriet� arg0.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della propriet� arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg0(Long value) {
        this.arg0 = value;
    }

    /**
     * Recupera il valore della propriet� arg1.
     * 
     * @return
     *     possible object is
     *     {@link Preference }
     *     
     */
    public Preference getArg1() {
        return arg1;
    }

    /**
     * Imposta il valore della propriet� arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Preference }
     *     
     */
    public void setArg1(Preference value) {
        this.arg1 = value;
    }

    /**
     * Recupera il valore della propriet� arg2.
     * 
     */
    public int getArg2() {
        return arg2;
    }

    /**
     * Imposta il valore della propriet� arg2.
     * 
     */
    public void setArg2(int value) {
        this.arg2 = value;
    }

}
