
package org.datacontract.schemas._2004._07.livemediastructs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamMatchFilActionLightStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamMatchFilActionLightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTeam" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LstCIS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS}ArrayOfCIS" minOccurs="0"/>
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
@XmlType(name = "TeamMatchFilActionLightStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", propOrder = {
    "codeName",
    "idTeam",
    "lstCIS",
    "teamName"
})
public class TeamMatchFilActionLightStruct {

    @XmlElementRef(name = "CodeName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeName;
    @XmlElement(name = "IdTeam")
    protected Integer idTeam;
    @XmlElementRef(name = "LstCIS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCIS> lstCIS;
    @XmlElementRef(name = "TeamName", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", type = JAXBElement.class, required = false)
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
