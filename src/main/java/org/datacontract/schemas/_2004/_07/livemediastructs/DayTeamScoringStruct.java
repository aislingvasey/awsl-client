
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayTeamScoringStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayTeamScoringStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTeam" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsTeamA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Score_EndOfficialTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Score_HalfTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayTeamScoringStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", propOrder = {
    "codeName",
    "idTeam",
    "isTeamA",
    "scoreEndOfficialTime",
    "scoreHalfTime",
    "teamName"
})
public class DayTeamScoringStruct {

    @XmlElementRef(name = "CodeName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeName;
    @XmlElementRef(name = "IdTeam", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idTeam;
    @XmlElement(name = "IsTeamA")
    protected Boolean isTeamA;
    @XmlElementRef(name = "Score_EndOfficialTime", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreEndOfficialTime;
    @XmlElementRef(name = "Score_HalfTime", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreHalfTime;
    @XmlElementRef(name = "TeamName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teamName;

    /**
     * Gets the value of the codeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeName() {
        return codeName;
    }

    /**
     * Sets the value of the codeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeName(JAXBElement<String> value) {
        this.codeName = value;
    }

    /**
     * Gets the value of the idTeam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdTeam() {
        return idTeam;
    }

    /**
     * Sets the value of the idTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdTeam(JAXBElement<Integer> value) {
        this.idTeam = value;
    }

    /**
     * Gets the value of the isTeamA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTeamA() {
        return isTeamA;
    }

    /**
     * Sets the value of the isTeamA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTeamA(Boolean value) {
        this.isTeamA = value;
    }

    /**
     * Gets the value of the scoreEndOfficialTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreEndOfficialTime() {
        return scoreEndOfficialTime;
    }

    /**
     * Sets the value of the scoreEndOfficialTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreEndOfficialTime(JAXBElement<Integer> value) {
        this.scoreEndOfficialTime = value;
    }

    /**
     * Gets the value of the scoreHalfTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreHalfTime() {
        return scoreHalfTime;
    }

    /**
     * Sets the value of the scoreHalfTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreHalfTime(JAXBElement<Integer> value) {
        this.scoreHalfTime = value;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeamName(JAXBElement<String> value) {
        this.teamName = value;
    }

}
