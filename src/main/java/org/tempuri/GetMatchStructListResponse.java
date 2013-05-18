
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchStruct;


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
 *         &lt;element name="GetMatchStructListResult" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfMatchStruct" minOccurs="0"/>
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
    "getMatchStructListResult"
})
@XmlRootElement(name = "GetMatchStructListResponse")
public class GetMatchStructListResponse {

    @XmlElementRef(name = "GetMatchStructListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMatchStruct> getMatchStructListResult;

    /**
     * Gets the value of the getMatchStructListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMatchStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMatchStruct> getGetMatchStructListResult() {
        return getMatchStructListResult;
    }

    /**
     * Sets the value of the getMatchStructListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMatchStruct }{@code >}
     *     
     */
    public void setGetMatchStructListResult(JAXBElement<ArrayOfMatchStruct> value) {
        this.getMatchStructListResult = value;
    }

}
