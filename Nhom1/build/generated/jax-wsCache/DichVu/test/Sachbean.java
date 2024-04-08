
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sachbean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sachbean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gia" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maloai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soluong" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tensach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sachbean", propOrder = {
    "gia",
    "maloai",
    "masach",
    "soluong",
    "tensach"
})
public class Sachbean {

    protected long gia;
    protected String maloai;
    protected String masach;
    protected long soluong;
    protected String tensach;

    /**
     * Gets the value of the gia property.
     * 
     */
    public long getGia() {
        return gia;
    }

    /**
     * Sets the value of the gia property.
     * 
     */
    public void setGia(long value) {
        this.gia = value;
    }

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
     * Gets the value of the masach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasach() {
        return masach;
    }

    /**
     * Sets the value of the masach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasach(String value) {
        this.masach = value;
    }

    /**
     * Gets the value of the soluong property.
     * 
     */
    public long getSoluong() {
        return soluong;
    }

    /**
     * Sets the value of the soluong property.
     * 
     */
    public void setSoluong(long value) {
        this.soluong = value;
    }

    /**
     * Gets the value of the tensach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTensach() {
        return tensach;
    }

    /**
     * Sets the value of the tensach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTensach(String value) {
        this.tensach = value;
    }

}
