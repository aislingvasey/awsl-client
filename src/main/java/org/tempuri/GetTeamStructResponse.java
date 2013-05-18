
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.livemediastructs.TeamStruct;


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
 *         &lt;element name="GetTeamStructResult" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}TeamStruct" minOccurs="0"/>
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
    "getTeamStructResult"
})
@XmlRootElement(name = "GetTeamStructResponse")
public class GetTeamStructResponse {

    @XmlElementRef(name = "GetTeamStructResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TeamStruct> getTeamStructResult;

    /**
     * Gets the value of the getTeamStructResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeamStruct }{@code >}
     *     
     */
    public JAXBElement<TeamStruct> getGetTeamStructResult() {
        return getTeamStructResult;
    }

    /**
     * Sets the value of the getTeamStructResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeamStruct }{@code >}
     *     
     */
    public void setGetTeamStructResult(JAXBElement<TeamStruct> value) {
        this.getTeamStructResult = value;
    }

}
