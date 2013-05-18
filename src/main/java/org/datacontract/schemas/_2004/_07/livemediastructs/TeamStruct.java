
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbbrevClubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coach" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ActorLightStruct" minOccurs="0"/>
 *         &lt;element name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorHexa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTeam" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsTeamA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LstActorStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfActorStruct" minOccurs="0"/>
 *         &lt;element name="LstActorSubstitutionStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfActorSubstitutionStruct" minOccurs="0"/>
 *         &lt;element name="LstCIS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS}ArrayOfCIS" minOccurs="0"/>
 *         &lt;element name="LstSDTS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfSDTS" minOccurs="0"/>
 *         &lt;element name="LstScorerStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ArrayOfScorerStruct" minOccurs="0"/>
 *         &lt;element name="MediaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScoreEndOfficialTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreFinalShot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreHafTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreOverTime1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreOverTime2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "TeamStruct", propOrder = {
    "abbrevClubName",
    "city",
    "clubName",
    "coach",
    "codeName",
    "colorHexa",
    "idTeam",
    "isTeamA",
    "lstActorStruct",
    "lstActorSubstitutionStruct",
    "lstCIS",
    "lstSDTS",
    "lstScorerStruct",
    "mediaName",
    "scoreEndOfficialTime",
    "scoreFinalShot",
    "scoreHafTime",
    "scoreOverTime1",
    "scoreOverTime2",
    "teamName"
})
public class TeamStruct {

    @XmlElementRef(name = "AbbrevClubName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abbrevClubName;
    @XmlElementRef(name = "City", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "ClubName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubName;
    @XmlElementRef(name = "Coach", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ActorLightStruct> coach;
    @XmlElementRef(name = "CodeName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeName;
    @XmlElementRef(name = "ColorHexa", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> colorHexa;
    @XmlElement(name = "IdTeam")
    protected Integer idTeam;
    @XmlElement(name = "IsTeamA")
    protected Boolean isTeamA;
    @XmlElementRef(name = "LstActorStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfActorStruct> lstActorStruct;
    @XmlElementRef(name = "LstActorSubstitutionStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfActorSubstitutionStruct> lstActorSubstitutionStruct;
    @XmlElementRef(name = "LstCIS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCIS> lstCIS;
    @XmlElementRef(name = "LstSDTS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSDTS> lstSDTS;
    @XmlElementRef(name = "LstScorerStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfScorerStruct> lstScorerStruct;
    @XmlElementRef(name = "MediaName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mediaName;
    @XmlElementRef(name = "ScoreEndOfficialTime", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreEndOfficialTime;
    @XmlElementRef(name = "ScoreFinalShot", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreFinalShot;
    @XmlElementRef(name = "ScoreHafTime", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreHafTime;
    @XmlElementRef(name = "ScoreOverTime1", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreOverTime1;
    @XmlElementRef(name = "ScoreOverTime2", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreOverTime2;
    @XmlElementRef(name = "TeamName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teamName;

    /**
     * Gets the value of the abbrevClubName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbbrevClubName() {
        return abbrevClubName;
    }

    /**
     * Sets the value of the abbrevClubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbbrevClubName(JAXBElement<String> value) {
        this.abbrevClubName = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the clubName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubName() {
        return clubName;
    }

    /**
     * Sets the value of the clubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubName(JAXBElement<String> value) {
        this.clubName = value;
    }

    /**
     * Gets the value of the coach property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActorLightStruct }{@code >}
     *     
     */
    public JAXBElement<ActorLightStruct> getCoach() {
        return coach;
    }

    /**
     * Sets the value of the coach property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActorLightStruct }{@code >}
     *     
     */
    public void setCoach(JAXBElement<ActorLightStruct> value) {
        this.coach = value;
    }

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
     * Gets the value of the colorHexa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getColorHexa() {
        return colorHexa;
    }

    /**
     * Sets the value of the colorHexa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setColorHexa(JAXBElement<String> value) {
        this.colorHexa = value;
    }

    /**
     * Gets the value of the idTeam property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTeam() {
        return idTeam;
    }

    /**
     * Sets the value of the idTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTeam(Integer value) {
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
     * Gets the value of the lstActorStruct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActorStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfActorStruct> getLstActorStruct() {
        return lstActorStruct;
    }

    /**
     * Sets the value of the lstActorStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActorStruct }{@code >}
     *     
     */
    public void setLstActorStruct(JAXBElement<ArrayOfActorStruct> value) {
        this.lstActorStruct = value;
    }

    /**
     * Gets the value of the lstActorSubstitutionStruct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActorSubstitutionStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfActorSubstitutionStruct> getLstActorSubstitutionStruct() {
        return lstActorSubstitutionStruct;
    }

    /**
     * Sets the value of the lstActorSubstitutionStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActorSubstitutionStruct }{@code >}
     *     
     */
    public void setLstActorSubstitutionStruct(JAXBElement<ArrayOfActorSubstitutionStruct> value) {
        this.lstActorSubstitutionStruct = value;
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
     * Gets the value of the lstScorerStruct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorerStruct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfScorerStruct> getLstScorerStruct() {
        return lstScorerStruct;
    }

    /**
     * Sets the value of the lstScorerStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorerStruct }{@code >}
     *     
     */
    public void setLstScorerStruct(JAXBElement<ArrayOfScorerStruct> value) {
        this.lstScorerStruct = value;
    }

    /**
     * Gets the value of the mediaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMediaName() {
        return mediaName;
    }

    /**
     * Sets the value of the mediaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMediaName(JAXBElement<String> value) {
        this.mediaName = value;
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
     * Gets the value of the scoreFinalShot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreFinalShot() {
        return scoreFinalShot;
    }

    /**
     * Sets the value of the scoreFinalShot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreFinalShot(JAXBElement<Integer> value) {
        this.scoreFinalShot = value;
    }

    /**
     * Gets the value of the scoreHafTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreHafTime() {
        return scoreHafTime;
    }

    /**
     * Sets the value of the scoreHafTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreHafTime(JAXBElement<Integer> value) {
        this.scoreHafTime = value;
    }

    /**
     * Gets the value of the scoreOverTime1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreOverTime1() {
        return scoreOverTime1;
    }

    /**
     * Sets the value of the scoreOverTime1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreOverTime1(JAXBElement<Integer> value) {
        this.scoreOverTime1 = value;
    }

    /**
     * Gets the value of the scoreOverTime2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreOverTime2() {
        return scoreOverTime2;
    }

    /**
     * Sets the value of the scoreOverTime2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreOverTime2(JAXBElement<Integer> value) {
        this.scoreOverTime2 = value;
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
