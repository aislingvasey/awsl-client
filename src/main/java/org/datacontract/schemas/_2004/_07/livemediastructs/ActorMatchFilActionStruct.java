
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActorMatchFilActionStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActorMatchFilActionStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdActor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LstCIS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS}ArrayOfCIS" minOccurs="0"/>
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActorMatchFilActionStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", propOrder = {
    "idActor",
    "lstCIS",
    "nickName"
})
public class ActorMatchFilActionStruct {

    @XmlElement(name = "IdActor")
    protected Integer idActor;
    @XmlElementRef(name = "LstCIS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCIS> lstCIS;
    @XmlElementRef(name = "NickName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nickName;

    /**
     * Gets the value of the idActor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdActor() {
        return idActor;
    }

    /**
     * Sets the value of the idActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdActor(Integer value) {
        this.idActor = value;
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
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNickName(JAXBElement<String> value) {
        this.nickName = value;
    }

}
