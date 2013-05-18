
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.livemediastructs.MatchFilActionStruct;


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
 *         &lt;element name="GetMatchFilActionStructResult" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}MatchFilActionStruct" minOccurs="0"/>
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
    "getMatchFilActionStructResult"
})
@XmlRootElement(name = "GetMatchFilActionStructResponse")
public class GetMatchFilActionStructResponse {

    @XmlElementRef(name = "GetMatchFilActionStructResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<MatchFilActionStruct> getMatchFilActionStructResult;

    /**
     * Gets the value of the getMatchFilActionStructResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MatchFilActionStruct }{@code >}
     *     
     */
    public JAXBElement<MatchFilActionStruct> getGetMatchFilActionStructResult() {
        return getMatchFilActionStructResult;
    }

    /**
     * Sets the value of the getMatchFilActionStructResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MatchFilActionStruct }{@code >}
     *     
     */
    public void setGetMatchFilActionStructResult(JAXBElement<MatchFilActionStruct> value) {
        this.getMatchFilActionStructResult = value;
    }

}
