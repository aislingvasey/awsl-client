
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfDayScoringStruct;


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
 *         &lt;element name="DayScoringStructListResult" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS}ArrayOfDayScoringStruct" minOccurs="0"/>
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
    "dayScoringStructListResult"
})
@XmlRootElement(name = "DayScoringStructListResponse")
public class DayScoringStructListResponse {

    @XmlElementRef(name = "DayScoringStructListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDayScoringStruct> dayScoringStructListResult;

    /**
     * Gets the value of the dayScoringStructListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDayScoringStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDayScoringStruct> getDayScoringStructListResult() {
        return dayScoringStructListResult;
    }

    /**
     * Sets the value of the dayScoringStructListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDayScoringStruct }{@code >}
     *     
     */
    public void setDayScoringStructListResult(JAXBElement<ArrayOfDayScoringStruct> value) {
        this.dayScoringStructListResult = value;
    }

}
