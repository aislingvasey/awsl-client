
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchFilActionLightStruct;


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
 *         &lt;element name="MatchFilActionLightStructListResult" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}ArrayOfMatchFilActionLightStruct" minOccurs="0"/>
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
    "matchFilActionLightStructListResult"
})
@XmlRootElement(name = "MatchFilActionLightStructListResponse")
public class MatchFilActionLightStructListResponse {

    @XmlElementRef(name = "MatchFilActionLightStructListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMatchFilActionLightStruct> matchFilActionLightStructListResult;

    /**
     * Gets the value of the matchFilActionLightStructListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMatchFilActionLightStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMatchFilActionLightStruct> getMatchFilActionLightStructListResult() {
        return matchFilActionLightStructListResult;
    }

    /**
     * Sets the value of the matchFilActionLightStructListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMatchFilActionLightStruct }{@code >}
     *     
     */
    public void setMatchFilActionLightStructListResult(JAXBElement<ArrayOfMatchFilActionLightStruct> value) {
        this.matchFilActionLightStructListResult = value;
    }

}
