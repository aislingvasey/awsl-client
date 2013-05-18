
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchLightStruct;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchLightStructListResult" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfMatchLightStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matchLightStructListResult"
})
@XmlRootElement(name = "MatchLightStructListResponse")
public class MatchLightStructListResponse {

    @XmlElementRef(name = "MatchLightStructListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMatchLightStruct> matchLightStructListResult;

    /**
     * Gets the value of the matchLightStructListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMatchLightStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMatchLightStruct> getMatchLightStructListResult() {
        return matchLightStructListResult;
    }

    /**
     * Sets the value of the matchLightStructListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMatchLightStruct }{@code >}
     *     
     */
    public void setMatchLightStructListResult(JAXBElement<ArrayOfMatchLightStruct> value) {
        this.matchLightStructListResult = value;
    }

}
