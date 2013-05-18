
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorerStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorerStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HalfId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdGoalType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlayerScorer" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ActorLightStruct" minOccurs="0"/>
 *         &lt;element name="ScoreA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeMatchMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeMatchStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorerStruct", propOrder = {
    "halfId",
    "idGoalType",
    "playerScorer",
    "scoreA",
    "scoreB",
    "timeMatchMs",
    "timeMatchStr"
})
public class ScorerStruct {

    @XmlElement(name = "HalfId")
    protected Integer halfId;
    @XmlElement(name = "IdGoalType")
    protected Integer idGoalType;
    @XmlElementRef(name = "PlayerScorer", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ActorLightStruct> playerScorer;
    @XmlElementRef(name = "ScoreA", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreA;
    @XmlElementRef(name = "ScoreB", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreB;
    @XmlElement(name = "TimeMatchMs")
    protected Integer timeMatchMs;
    @XmlElementRef(name = "TimeMatchStr", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeMatchStr;

    /**
     * Gets the value of the halfId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHalfId() {
        return halfId;
    }

    /**
     * Sets the value of the halfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHalfId(Integer value) {
        this.halfId = value;
    }

    /**
     * Gets the value of the idGoalType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdGoalType() {
        return idGoalType;
    }

    /**
     * Sets the value of the idGoalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdGoalType(Integer value) {
        this.idGoalType = value;
    }

    /**
     * Gets the value of the playerScorer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActorLightStruct }{@code >}
     *     
     */
    public JAXBElement<ActorLightStruct> getPlayerScorer() {
        return playerScorer;
    }

    /**
     * Sets the value of the playerScorer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActorLightStruct }{@code >}
     *     
     */
    public void setPlayerScorer(JAXBElement<ActorLightStruct> value) {
        this.playerScorer = value;
    }

    /**
     * Gets the value of the scoreA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreA() {
        return scoreA;
    }

    /**
     * Sets the value of the scoreA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreA(JAXBElement<Integer> value) {
        this.scoreA = value;
    }

    /**
     * Gets the value of the scoreB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreB() {
        return scoreB;
    }

    /**
     * Sets the value of the scoreB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreB(JAXBElement<Integer> value) {
        this.scoreB = value;
    }

    /**
     * Gets the value of the timeMatchMs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeMatchMs() {
        return timeMatchMs;
    }

    /**
     * Sets the value of the timeMatchMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeMatchMs(Integer value) {
        this.timeMatchMs = value;
    }

    /**
     * Gets the value of the timeMatchStr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeMatchStr() {
        return timeMatchStr;
    }

    /**
     * Sets the value of the timeMatchStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeMatchStr(JAXBElement<String> value) {
        this.timeMatchStr = value;
    }

}
