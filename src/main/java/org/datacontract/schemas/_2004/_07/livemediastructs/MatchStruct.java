
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
 * <p>Java class for MatchStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompetitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentHalf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdCertificationState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdMatch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LstCIS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS}ArrayOfCIS" minOccurs="0"/>
 *         &lt;element name="LstReferees" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfActorLightStruct" minOccurs="0"/>
 *         &lt;element name="LstSDTS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfSDTS" minOccurs="0"/>
 *         &lt;element name="LstTeamStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfTeamStruct" minOccurs="0"/>
 *         &lt;element name="SeasonEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SeasonStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StadiumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchStruct", propOrder = {
    "codeMatch",
    "competitionName",
    "currentHalf",
    "dateAndTime",
    "day",
    "idCertificationState",
    "idMatch",
    "idStatus",
    "lstCIS",
    "lstReferees",
    "lstSDTS",
    "lstTeamStruct",
    "seasonEndDate",
    "seasonStartDate",
    "source",
    "stadiumName"
})
public class MatchStruct {

    @XmlElementRef(name = "CodeMatch", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeMatch;
    @XmlElementRef(name = "CompetitionName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competitionName;
    @XmlElementRef(name = "CurrentHalf", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> currentHalf;
    @XmlElement(name = "DateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTime;
    @XmlElementRef(name = "Day", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> day;
    @XmlElementRef(name = "IdCertificationState", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCertificationState;
    @XmlElement(name = "IdMatch")
    protected Integer idMatch;
    @XmlElementRef(name = "IdStatus", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idStatus;
    @XmlElementRef(name = "LstCIS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCIS> lstCIS;
    @XmlElementRef(name = "LstReferees", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfActorLightStruct> lstReferees;
    @XmlElementRef(name = "LstSDTS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSDTS> lstSDTS;
    @XmlElementRef(name = "LstTeamStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTeamStruct> lstTeamStruct;
    @XmlElementRef(name = "SeasonEndDate", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> seasonEndDate;
    @XmlElementRef(name = "SeasonStartDate", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> seasonStartDate;
    @XmlElementRef(name = "Source", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> source;
    @XmlElementRef(name = "StadiumName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stadiumName;

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
     * Gets the value of the currentHalf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCurrentHalf() {
        return currentHalf;
    }

    /**
     * Sets the value of the currentHalf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCurrentHalf(JAXBElement<Integer> value) {
        this.currentHalf = value;
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
     * Gets the value of the idCertificationState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCertificationState() {
        return idCertificationState;
    }

    /**
     * Sets the value of the idCertificationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCertificationState(JAXBElement<Integer> value) {
        this.idCertificationState = value;
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
     * Gets the value of the idStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdStatus() {
        return idStatus;
    }

    /**
     * Sets the value of the idStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdStatus(JAXBElement<Integer> value) {
        this.idStatus = value;
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
     * Gets the value of the lstReferees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActorLightStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfActorLightStruct> getLstReferees() {
        return lstReferees;
    }

    /**
     * Sets the value of the lstReferees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActorLightStruct }{@code >}
     *     
     */
    public void setLstReferees(JAXBElement<ArrayOfActorLightStruct> value) {
        this.lstReferees = value;
    }

    /**
     * Gets the value of the lstSDTS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSDTS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSDTS> getLstSDTS() {
        return lstSDTS;
    }

    /**
     * Sets the value of the lstSDTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSDTS }{@code >}
     *     
     */
    public void setLstSDTS(JAXBElement<ArrayOfSDTS> value) {
        this.lstSDTS = value;
    }

    /**
     * Gets the value of the lstTeamStruct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTeamStruct> getLstTeamStruct() {
        return lstTeamStruct;
    }

    /**
     * Sets the value of the lstTeamStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamStruct }{@code >}
     *     
     */
    public void setLstTeamStruct(JAXBElement<ArrayOfTeamStruct> value) {
        this.lstTeamStruct = value;
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

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSource(JAXBElement<String> value) {
        this.source = value;
    }

    /**
     * Gets the value of the stadiumName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStadiumName() {
        return stadiumName;
    }

    /**
     * Sets the value of the stadiumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStadiumName(JAXBElement<String> value) {
        this.stadiumName = value;
    }

}
