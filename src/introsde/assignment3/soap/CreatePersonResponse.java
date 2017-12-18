
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createPersonResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createPersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="create" type="{http://soap.assignment3.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPersonResponse", propOrder = {
    "create"
})
public class CreatePersonResponse {

    protected Person create;

    /**
     * Recupera il valore della proprietà create.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getCreate() {
        return create;
    }

    /**
     * Imposta il valore della proprietà create.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setCreate(Person value) {
        this.create = value;
    }

}
