
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MatchFilActionLightStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchFilActionLightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompetitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdMatch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LstCIS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS}ArrayOfCIS" minOccurs="0"/>
 *         &lt;element name="LstTeamMatchFilActionStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}ArrayOfTeamMatchFilActionLightStruct" minOccurs="0"/>
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
@XmlType(name = "MatchFilActionLightStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", propOrder = {
    "codeMatch",
    "competitionName",
    "dateAndTime",
    "day",
    "idMatch",
    "lstCIS",
    "lstTeamMatchFilActionStruct",
    "seasonEndDate",
    "seasonStartDate"
})
public class MatchFilActionLightStruct {

    @XmlElementRef(name = "CodeMatch", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeMatch;
    @XmlElementRef(name = "CompetitionName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competitionName;
    @XmlElement(name = "DateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTime;
    @XmlElementRef(name = "Day", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> day;
    @XmlElement(name = "IdMatch")
    protected Integer idMatch;
    @XmlElementRef(name = "LstCIS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCIS> lstCIS;
    @XmlElementRef(name = "LstTeamMatchFilActionStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTeamMatchFilActionLightStruct> lstTeamMatchFilActionStruct;
    @XmlElementRef(name = "SeasonEndDate", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> seasonEndDate;
    @XmlElementRef(name = "SeasonStartDate", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> seasonStartDate;

    /**
     * Gets the value of the codeMatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeMatch() {
        return codeMatch;
    }

    /**
     * Sets the value of the codeMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeMatch(JAXBElement<String> value) {
        this.codeMatch = value;
    }

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
     * Gets the value of the dateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTime() {
        return dateAndTime;
    }

    /**
     * Sets the value of the dateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTime(XMLGregorianCalendar value) {
        this.dateAndTime = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDay(JAXBElement<Integer> value) {
        this.day = value;
    }

    /**
     * Gets the value of the idMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMatch() {
        return idMatch;
    }

    /**
     * Sets the value of the idMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMatch(Integer value) {
        this.idMatch = value;
    }

    /**
     * Gets the value of the lstCIS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCIS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCIS> getLstCIS() {
        return lstCIS;
    }

    /**
     * Sets the value of the lstCIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCIS }{@code >}
     *     
     */
    public void setLstCIS(JAXBElement<ArrayOfCIS> value) {
        this.lstCIS = value;
    }

    /**
     * Gets the value of the lstTeamMatchFilActionStruct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamMatchFilActionLightStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTeamMatchFilActionLightStruct> getLstTeamMatchFilActionStruct() {
        return lstTeamMatchFilActionStruct;
    }

    /**
     * Sets the value of the lstTeamMatchFilActionStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamMatchFilActionLightStruct }{@code >}
     *     
     */
    public void setLstTeamMatchFilActionStruct(JAXBElement<ArrayOfTeamMatchFilActionLightStruct> value) {
        this.lstTeamMatchFilActionStruct = value;
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
