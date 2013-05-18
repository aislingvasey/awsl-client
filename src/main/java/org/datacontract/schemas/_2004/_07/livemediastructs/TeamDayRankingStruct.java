
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamDayRankingStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamDayRankingStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbbrevClubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EvolutionOfRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GoalAgainst" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GoalAverage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GoalFor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTeam" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LstCIS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS}ArrayOfCIS" minOccurs="0"/>
 *         &lt;element name="MediaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NbDraw" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbLost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbMatchesPlayed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbWon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "TeamDayRankingStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", propOrder = {
    "abbrevClubName",
    "city",
    "clubName",
    "codeName",
    "evolutionOfRank",
    "goalAgainst",
    "goalAverage",
    "goalFor",
    "idTeam",
    "lstCIS",
    "mediaName",
    "nbDraw",
    "nbLost",
    "nbMatchesPlayed",
    "nbPoints",
    "nbWon",
    "rank",
    "teamName"
})
public class TeamDayRankingStruct {

    @XmlElementRef(name = "AbbrevClubName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abbrevClubName;
    @XmlElementRef(name = "City", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "ClubName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubName;
    @XmlElementRef(name = "CodeName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeName;
    @XmlElementRef(name = "EvolutionOfRank", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> evolutionOfRank;
    @XmlElement(name = "GoalAgainst")
    protected Integer goalAgainst;
    @XmlElement(name = "GoalAverage")
    protected Integer goalAverage;
    @XmlElement(name = "GoalFor")
    protected Integer goalFor;
    @XmlElement(name = "IdTeam")
    protected Integer idTeam;
    @XmlElementRef(name = "LstCIS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCIS> lstCIS;
    @XmlElementRef(name = "MediaName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mediaName;
    @XmlElement(name = "NbDraw")
    protected Integer nbDraw;
    @XmlElement(name = "NbLost")
    protected Integer nbLost;
    @XmlElement(name = "NbMatchesPlayed")
    protected Integer nbMatchesPlayed;
    @XmlElement(name = "NbPoints")
    protected Integer nbPoints;
    @XmlElement(name = "NbWon")
    protected Integer nbWon;
    @XmlElement(name = "Rank")
    protected Integer rank;
    @XmlElementRef(name = "TeamName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", type = JAXBElement.class, required = false)
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
     * Gets the value of the evolutionOfRank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvolutionOfRank() {
        return evolutionOfRank;
    }

    /**
     * Sets the value of the evolutionOfRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvolutionOfRank(JAXBElement<Integer> value) {
        this.evolutionOfRank = value;
    }

    /**
     * Gets the value of the goalAgainst property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalAgainst() {
        return goalAgainst;
    }

    /**
     * Sets the value of the goalAgainst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalAgainst(Integer value) {
        this.goalAgainst = value;
    }

    /**
     * Gets the value of the goalAverage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalAverage() {
        return goalAverage;
    }

    /**
     * Sets the value of the goalAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalAverage(Integer value) {
        this.goalAverage = value;
    }

    /**
     * Gets the value of the goalFor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalFor() {
        return goalFor;
    }

    /**
     * Sets the value of the goalFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalFor(Integer value) {
        this.goalFor = value;
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
     * Gets the value of the nbDraw property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbDraw() {
        return nbDraw;
    }

    /**
     * Sets the value of the nbDraw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbDraw(Integer value) {
        this.nbDraw = value;
    }

    /**
     * Gets the value of the nbLost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbLost() {
        return nbLost;
    }

    /**
     * Sets the value of the nbLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbLost(Integer value) {
        this.nbLost = value;
    }

    /**
     * Gets the value of the nbMatchesPlayed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbMatchesPlayed() {
        return nbMatchesPlayed;
    }

    /**
     * Sets the value of the nbMatchesPlayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbMatchesPlayed(Integer value) {
        this.nbMatchesPlayed = value;
    }

    /**
     * Gets the value of the nbPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbPoints() {
        return nbPoints;
    }

    /**
     * Sets the value of the nbPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbPoints(Integer value) {
        this.nbPoints = value;
    }

    /**
     * Gets the value of the nbWon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbWon() {
        return nbWon;
    }

    /**
     * Sets the value of the nbWon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbWon(Integer value) {
        this.nbWon = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRank(Integer value) {
        this.rank = value;
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
