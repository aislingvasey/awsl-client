
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring;


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
 *         &lt;element name="GetMatchStructDetailAvailableResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintstring" minOccurs="0"/>
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
    "getMatchStructDetailAvailableResult"
})
@XmlRootElement(name = "GetMatchStructDetailAvailableResponse")
public class GetMatchStructDetailAvailableResponse {

    @XmlElementRef(name = "GetMatchStructDetailAvailableResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfintstring> getMatchStructDetailAvailableResult;

    /**
     * Gets the value of the getMatchStructDetailAvailableResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfintstring> getGetMatchStructDetailAvailableResult() {
        return getMatchStructDetailAvailableResult;
    }

    /**
     * Sets the value of the getMatchStructDetailAvailableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}
     *     
     */
    public void setGetMatchStructDetailAvailableResult(JAXBElement<ArrayOfKeyValueOfintstring> value) {
        this.getMatchStructDetailAvailableResult = value;
    }

}
