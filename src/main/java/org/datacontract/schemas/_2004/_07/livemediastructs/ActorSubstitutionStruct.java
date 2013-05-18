
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActorSubstitutionStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActorSubstitutionStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HalfId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlayerIn" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ActorLightStruct" minOccurs="0"/>
 *         &lt;element name="PlayerOut" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ActorLightStruct" minOccurs="0"/>
 *         &lt;element name="TimeMatchMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeMatchStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActorSubstitutionStruct", propOrder = {
    "halfId",
    "playerIn",
    "playerOut",
    "timeMatchMs",
    "timeMatchStr"
})
public class ActorSubstitutionStruct {

    @XmlElement(name = "HalfId")
    protected Integer halfId;
    @XmlElementRef(name = "PlayerIn", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ActorLightStruct> playerIn;
    @XmlElementRef(name = "PlayerOut", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ActorLightStruct> playerOut;
    @XmlElement(name = "TimeMatchMs")
    protected Integer timeMatchMs;
    @XmlElementRef(name = "TimeMatchStr", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeMatchStr;

    /**
     * Gets the value of the halfId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHalfId() {
        return halfId;
    }

    /**
     * Sets the value of the halfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHalfId(Integer value) {
        this.halfId = value;
    }

    /**
     * Gets the value of the playerIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActorLightStruct }{@code >}
     *     
     */
    public JAXBElement<ActorLightStruct> getPlayerIn() {
        return playerIn;
    }

    /**
     * Sets the value of the playerIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActorLightStruct }{@code >}
     *     
     */
    public void setPlayerIn(JAXBElement<ActorLightStruct> value) {
        this.playerIn = value;
    }

    /**
     * Gets the value of the playerOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActorLightStruct }{@code >}
     *     
     */
    public JAXBElement<ActorLightStruct> getPlayerOut() {
        return playerOut;
    }

    /**
     * Sets the value of the playerOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActorLightStruct }{@code >}
     *     
     */
    public void setPlayerOut(JAXBElement<ActorLightStruct> value) {
        this.playerOut = value;
    }

    /**
     * Gets the value of the timeMatchMs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeMatchMs() {
        return timeMatchMs;
    }

    /**
     * Sets the value of the timeMatchMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeMatchMs(Integer value) {
        this.timeMatchMs = value;
    }

    /**
     * Gets the value of the timeMatchStr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeMatchStr() {
        return timeMatchStr;
    }

    /**
     * Sets the value of the timeMatchStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeMatchStr(JAXBElement<String> value) {
        this.timeMatchStr = value;
    }

}
