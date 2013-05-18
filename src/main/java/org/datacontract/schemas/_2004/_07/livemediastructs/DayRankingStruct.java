
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DayRankingStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayRankingStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompetitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LstTeamRankingStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS}ArrayOfTeamDayRankingStruct" minOccurs="0"/>
 *         &lt;element name="NumDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SeasonEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SeasonStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayRankingStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", propOrder = {
    "competitionName",
    "lstTeamRankingStruct",
    "numDay",
    "seasonEndDate",
    "seasonStartDate"
})
public class DayRankingStruct {

    @XmlElementRef(name = "CompetitionName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competitionName;
    @XmlElementRef(name = "LstTeamRankingStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTeamDayRankingStruct> lstTeamRankingStruct;
    @XmlElement(name = "NumDay")
    protected Integer numDay;
    @XmlElementRef(name = "SeasonEndDate", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> seasonEndDate;
    @XmlElementRef(name = "SeasonStartDate", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> seasonStartDate;

    /**
     * Gets the value of the competitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompetitionName() {
        return competitionName;
    }

    /**
     * Sets the value of the competitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompetitionName(JAXBElement<String> value) {
        this.competitionName = value;
    }

    /**
     * Gets the value of the lstTeamRankingStruct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamDayRankingStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTeamDayRankingStruct> getLstTeamRankingStruct() {
        return lstTeamRankingStruct;
    }

    /**
     * Sets the value of the lstTeamRankingStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamDayRankingStruct }{@code >}
     *     
     */
    public void setLstTeamRankingStruct(JAXBElement<ArrayOfTeamDayRankingStruct> value) {
        this.lstTeamRankingStruct = value;
    }

    /**
     * Gets the value of the numDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDay() {
        return numDay;
    }

    /**
     * Sets the value of the numDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDay(Integer value) {
        this.numDay = value;
    }

    /**
     * Gets the value of the seasonEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSeasonEndDate() {
        return seasonEndDate;
    }

    /**
     * Sets the value of the seasonEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSeasonEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.seasonEndDate = value;
    }

    /**
     * Gets the value of the seasonStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSeasonStartDate() {
        return seasonStartDate;
    }

    /**
     * Sets the value of the seasonStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSeasonStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.seasonStartDate = value;
    }

}
