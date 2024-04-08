
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loaibean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loaibean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maloai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenloai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loaibean", propOrder = {
    "maloai",
    "tenloai"
})
public class Loaibean {

    protected String maloai;
    protected String tenloai;

    /**
     * Gets the value of the maloai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaloai() {
        return maloai;
    }

    /**
     * Sets the value of the maloai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaloai(String value) {
        this.maloai = value;
    }

    /**
     * Gets the value of the tenloai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenloai() {
        return tenloai;
    }

    /**
     * Sets the value of the tenloai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenloai(String value) {
        this.tenloai = value;
    }

}
