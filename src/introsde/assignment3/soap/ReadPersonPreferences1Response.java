
package introsde.assignment3.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readPersonPreferences1Response complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readPersonPreferences1Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readPersonPreferences" type="{http://soap.assignment3.introsde/}preference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonPreferences1Response", propOrder = {
    "readPersonPreferences"
})
public class ReadPersonPreferences1Response {

    protected List<Preference> readPersonPreferences;

    /**
     * Gets the value of the readPersonPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readPersonPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadPersonPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Preference }
     * 
     * 
     */
    public List<Preference> getReadPersonPreferences() {
        if (readPersonPreferences == null) {
            readPersonPreferences = new ArrayList<Preference>();
        }
        return this.readPersonPreferences;
    }

}
