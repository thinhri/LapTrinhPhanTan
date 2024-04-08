
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nhanvienbean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nhanvienbean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hoten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nhanvienbean", propOrder = {
    "hoten",
    "manv"
})
public class Nhanvienbean {

    protected String hoten;
    protected String manv;

    /**
     * Gets the value of the hoten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoten() {
        return hoten;
    }

    /**
     * Sets the value of the hoten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoten(String value) {
        this.hoten = value;
    }

    /**
     * Gets the value of the manv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManv() {
        return manv;
    }

    /**
     * Sets the value of the manv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManv(String value) {
        this.manv = value;
    }

}
