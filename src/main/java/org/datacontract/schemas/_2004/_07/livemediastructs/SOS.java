
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETHms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ETHstr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ETMms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ETMstr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdH" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="STHms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="STHstr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="STMstr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOS", propOrder = {
    "etHms",
    "etHstr",
    "etMms",
    "etMstr",
    "idH",
    "stHms",
    "stHstr",
    "stMms",
    "stMstr"
})
public class SOS {

    @XmlElementRef(name = "ETHms", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> etHms;
    @XmlElementRef(name = "ETHstr", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etHstr;
    @XmlElementRef(name = "ETMms", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> etMms;
    @XmlElementRef(name = "ETMstr", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etMstr;
    @XmlElement(name = "IdH")
    protected Integer idH;
    @XmlElementRef(name = "STHms", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stHms;
    @XmlElementRef(name = "STHstr", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stHstr;
    @XmlElementRef(name = "STMms", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stMms;
    @XmlElementRef(name = "STMstr", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stMstr;

    /**
     * Gets the value of the etHms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getETHms() {
        return etHms;
    }

    /**
     * Sets the value of the etHms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setETHms(JAXBElement<Integer> value) {
        this.etHms = value;
    }

    /**
     * Gets the value of the etHstr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getETHstr() {
        return etHstr;
    }

    /**
     * Sets the value of the etHstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setETHstr(JAXBElement<String> value) {
        this.etHstr = value;
    }

    /**
     * Gets the value of the etMms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getETMms() {
        return etMms;
    }

    /**
     * Sets the value of the etMms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setETMms(JAXBElement<Integer> value) {
        this.etMms = value;
    }

    /**
     * Gets the value of the etMstr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getETMstr() {
        return etMstr;
    }

    /**
     * Sets the value of the etMstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setETMstr(JAXBElement<String> value) {
        this.etMstr = value;
    }

    /**
     * Gets the value of the idH property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdH() {
        return idH;
    }

    /**
     * Sets the value of the idH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdH(Integer value) {
        this.idH = value;
    }

    /**
     * Gets the value of the stHms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSTHms() {
        return stHms;
    }

    /**
     * Sets the value of the stHms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSTHms(JAXBElement<Integer> value) {
        this.stHms = value;
    }

    /**
     * Gets the value of the stHstr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTHstr() {
        return stHstr;
    }

    /**
     * Sets the value of the stHstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTHstr(JAXBElement<String> value) {
        this.stHstr = value;
    }

    /**
     * Gets the value of the stMms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSTMms() {
        return stMms;
    }

    /**
     * Sets the value of the stMms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSTMms(JAXBElement<Integer> value) {
        this.stMms = value;
    }

    /**
     * Gets the value of the stMstr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTMstr() {
        return stMstr;
    }

    /**
     * Sets the value of the stMstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTMstr(JAXBElement<String> value) {
        this.stMstr = value;
    }

}
