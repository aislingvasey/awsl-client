
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActorLightStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActorLightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LstCIS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS}ArrayOfCIS" minOccurs="0"/>
 *         &lt;element name="NN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActorLightStruct", propOrder = {
    "fn",
    "idA",
    "lstCIS",
    "nn",
    "sn",
    "ufn"
})
public class ActorLightStruct {

    @XmlElementRef(name = "FN", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fn;
    @XmlElement(name = "IdA")
    protected Integer idA;
    @XmlElementRef(name = "LstCIS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCIS> lstCIS;
    @XmlElementRef(name = "NN", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nn;
    @XmlElementRef(name = "SN", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sn;
    @XmlElementRef(name = "UFN", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufn;

    /**
     * Gets the value of the fn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFN() {
        return fn;
    }

    /**
     * Sets the value of the fn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFN(JAXBElement<String> value) {
        this.fn = value;
    }

    /**
     * Gets the value of the idA property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdA() {
        return idA;
    }

    /**
     * Sets the value of the idA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdA(Integer value) {
        this.idA = value;
    }

    /**
     * Gets the value of the lstCIS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCIS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCIS> getLstCIS() {
        return lstCIS;
    }

    /**
     * Sets the value of the lstCIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCIS }{@code >}
     *     
     */
    public void setLstCIS(JAXBElement<ArrayOfCIS> value) {
        this.lstCIS = value;
    }

    /**
     * Gets the value of the nn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNN() {
        return nn;
    }

    /**
     * Sets the value of the nn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNN(JAXBElement<String> value) {
        this.nn = value;
    }

    /**
     * Gets the value of the sn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSN() {
        return sn;
    }

    /**
     * Sets the value of the sn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSN(JAXBElement<String> value) {
        this.sn = value;
    }

    /**
     * Gets the value of the ufn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFN() {
        return ufn;
    }

    /**
     * Sets the value of the ufn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFN(JAXBElement<String> value) {
        this.ufn = value;
    }

}
