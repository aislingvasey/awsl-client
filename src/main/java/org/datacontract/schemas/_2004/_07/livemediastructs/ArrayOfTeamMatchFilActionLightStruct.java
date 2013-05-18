
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTeamMatchFilActionLightStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTeamMatchFilActionLightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeamMatchFilActionLightStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}TeamMatchFilActionLightStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTeamMatchFilActionLightStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", propOrder = {
    "teamMatchFilActionLightStruct"
})
public class ArrayOfTeamMatchFilActionLightStruct {

    @XmlElement(name = "TeamMatchFilActionLightStruct", nillable = true)
    protected List<TeamMatchFilActionLightStruct> teamMatchFilActionLightStruct;

    /**
     * Gets the value of the teamMatchFilActionLightStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamMatchFilActionLightStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamMatchFilActionLightStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMatchFilActionLightStruct }
     * 
     * 
     */
    public List<TeamMatchFilActionLightStruct> getTeamMatchFilActionLightStruct() {
        if (teamMatchFilActionLightStruct == null) {
            teamMatchFilActionLightStruct = new ArrayList<TeamMatchFilActionLightStruct>();
        }
        return this.teamMatchFilActionLightStruct;
    }

}
