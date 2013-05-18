
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
 * <p>Java class for MatchDayScoringStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchDayScoringStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompetitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IdMatch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LstTeamScoringStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS}ArrayOfDayTeamScoringStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchDayScoringStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", propOrder = {
    "codeMatch",
    "competitionName",
    "dateAndTime",
    "idMatch",
    "idStatus",
    "lstTeamScoringStruct"
})
public class MatchDayScoringStruct {

    @XmlElementRef(name = "CodeMatch", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeMatch;
    @XmlElementRef(name = "CompetitionName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competitionName;
    @XmlElement(name = "DateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTime;
    @XmlElement(name = "IdMatch")
    protected Integer idMatch;
    @XmlElementRef(name = "IdStatus", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idStatus;
    @XmlElementRef(name = "LstTeamScoringStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDayTeamScoringStruct> lstTeamScoringStruct;

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
     * Gets the value of the lstTeamScoringStruct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDayTeamScoringStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDayTeamScoringStruct> getLstTeamScoringStruct() {
        return lstTeamScoringStruct;
    }

    /**
     * Sets the value of the lstTeamScoringStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDayTeamScoringStruct }{@code >}
     *     
     */
    public void setLstTeamScoringStruct(JAXBElement<ArrayOfDayTeamScoringStruct> value) {
        this.lstTeamScoringStruct = value;
    }

}
