
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfDayRankingStruct;


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
 *         &lt;element name="DayRankingStructListResult" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS}ArrayOfDayRankingStruct" minOccurs="0"/>
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
    "dayRankingStructListResult"
})
@XmlRootElement(name = "DayRankingStructListResponse")
public class DayRankingStructListResponse {

    @XmlElementRef(name = "DayRankingStructListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDayRankingStruct> dayRankingStructListResult;

    /**
     * Gets the value of the dayRankingStructListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDayRankingStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDayRankingStruct> getDayRankingStructListResult() {
        return dayRankingStructListResult;
    }

    /**
     * Sets the value of the dayRankingStructListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDayRankingStruct }{@code >}
     *     
     */
    public void setDayRankingStructListResult(JAXBElement<ArrayOfDayRankingStruct> value) {
        this.dayRankingStructListResult = value;
    }

}
