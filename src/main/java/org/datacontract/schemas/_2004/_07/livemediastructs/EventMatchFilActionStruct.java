
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventMatchFilActionStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventMatchFilActionStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Actor1" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}ActorMatchFilActionStruct" minOccurs="0"/>
 *         &lt;element name="Actor2" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}ActorMatchFilActionStruct" minOccurs="0"/>
 *         &lt;element name="HalfId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdEvent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsHalfTimeSubstitution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PhaseStartTimeMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Team1" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}TeamMatchFilActionStruct" minOccurs="0"/>
 *         &lt;element name="Team2" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}TeamMatchFilActionStruct" minOccurs="0"/>
 *         &lt;element name="TimeMatchMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeMatchStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventMatchFilActionStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", propOrder = {
    "actor1",
    "actor2",
    "halfId",
    "idEvent",
    "isHalfTimeSubstitution",
    "phaseStartTimeMs",
    "scoreA",
    "scoreB",
    "team1",
    "team2",
    "timeMatchMs",
    "timeMatchStr",
    "x",
    "y"
})
public class EventMatchFilActionStruct {

    @XmlElementRef(name = "Actor1", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ActorMatchFilActionStruct> actor1;
    @XmlElementRef(name = "Actor2", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ActorMatchFilActionStruct> actor2;
    @XmlElementRef(name = "HalfId", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> halfId;
    @XmlElement(name = "IdEvent")
    protected Integer idEvent;
    @XmlElementRef(name = "IsHalfTimeSubstitution", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isHalfTimeSubstitution;
    @XmlElementRef(name = "PhaseStartTimeMs", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> phaseStartTimeMs;
    @XmlElementRef(name = "ScoreA", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreA;
    @XmlElementRef(name = "ScoreB", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreB;
    @XmlElementRef(name = "Team1", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<TeamMatchFilActionStruct> team1;
    @XmlElementRef(name = "Team2", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<TeamMatchFilActionStruct> team2;
    @XmlElementRef(name = "TimeMatchMs", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeMatchMs;
    @XmlElementRef(name = "TimeMatchStr", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeMatchStr;
    @XmlElementRef(name = "X", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x;
    @XmlElementRef(name = "Y", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> y;

    /**
     * Gets the value of the actor1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActorMatchFilActionStruct }{@code >}
     *     
     */
    public JAXBElement<ActorMatchFilActionStruct> getActor1() {
        return actor1;
    }

    /**
     * Sets the value of the actor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActorMatchFilActionStruct }{@code >}
     *     
     */
    public void setActor1(JAXBElement<ActorMatchFilActionStruct> value) {
        this.actor1 = value;
    }

    /**
     * Gets the value of the actor2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActorMatchFilActionStruct }{@code >}
     *     
     */
    public JAXBElement<ActorMatchFilActionStruct> getActor2() {
        return actor2;
    }

    /**
     * Sets the value of the actor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActorMatchFilActionStruct }{@code >}
     *     
     */
    public void setActor2(JAXBElement<ActorMatchFilActionStruct> value) {
        this.actor2 = value;
    }

    /**
     * Gets the value of the halfId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHalfId() {
        return halfId;
    }

    /**
     * Sets the value of the halfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHalfId(JAXBElement<Integer> value) {
        this.halfId = value;
    }

    /**
     * Gets the value of the idEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEvent() {
        return idEvent;
    }

    /**
     * Sets the value of the idEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEvent(Integer value) {
        this.idEvent = value;
    }

    /**
     * Gets the value of the isHalfTimeSubstitution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsHalfTimeSubstitution() {
        return isHalfTimeSubstitution;
    }

    /**
     * Sets the value of the isHalfTimeSubstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsHalfTimeSubstitution(JAXBElement<Boolean> value) {
        this.isHalfTimeSubstitution = value;
    }

    /**
     * Gets the value of the phaseStartTimeMs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhaseStartTimeMs() {
        return phaseStartTimeMs;
    }

    /**
     * Sets the value of the phaseStartTimeMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhaseStartTimeMs(JAXBElement<Integer> value) {
        this.phaseStartTimeMs = value;
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
     * Gets the value of the team1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeamMatchFilActionStruct }{@code >}
     *     
     */
    public JAXBElement<TeamMatchFilActionStruct> getTeam1() {
        return team1;
    }

    /**
     * Sets the value of the team1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeamMatchFilActionStruct }{@code >}
     *     
     */
    public void setTeam1(JAXBElement<TeamMatchFilActionStruct> value) {
        this.team1 = value;
    }

    /**
     * Gets the value of the team2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeamMatchFilActionStruct }{@code >}
     *     
     */
    public JAXBElement<TeamMatchFilActionStruct> getTeam2() {
        return team2;
    }

    /**
     * Sets the value of the team2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeamMatchFilActionStruct }{@code >}
     *     
     */
    public void setTeam2(JAXBElement<TeamMatchFilActionStruct> value) {
        this.team2 = value;
    }

    /**
     * Gets the value of the timeMatchMs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeMatchMs() {
        return timeMatchMs;
    }

    /**
     * Sets the value of the timeMatchMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeMatchMs(JAXBElement<Integer> value) {
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

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX(JAXBElement<Integer> value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setY(JAXBElement<Integer> value) {
        this.y = value;
    }

}
