
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchFilActionStruct;


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
 *         &lt;element name="GetMatchFilActionStructListResult" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}ArrayOfMatchFilActionStruct" minOccurs="0"/>
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
    "getMatchFilActionStructListResult"
})
@XmlRootElement(name = "GetMatchFilActionStructListResponse")
public class GetMatchFilActionStructListResponse {

    @XmlElementRef(name = "GetMatchFilActionStructListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMatchFilActionStruct> getMatchFilActionStructListResult;

    /**
     * Gets the value of the getMatchFilActionStructListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMatchFilActionStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMatchFilActionStruct> getGetMatchFilActionStructListResult() {
        return getMatchFilActionStructListResult;
    }

    /**
     * Sets the value of the getMatchFilActionStructListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMatchFilActionStruct }{@code >}
     *     
     */
    public void setGetMatchFilActionStructListResult(JAXBElement<ArrayOfMatchFilActionStruct> value) {
        this.getMatchFilActionStructListResult = value;
    }

}
