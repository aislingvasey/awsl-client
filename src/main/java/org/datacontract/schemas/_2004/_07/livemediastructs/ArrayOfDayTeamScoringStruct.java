
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDayTeamScoringStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDayTeamScoringStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayTeamScoringStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS}DayTeamScoringStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDayTeamScoringStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.ScoringNS", propOrder = {
    "dayTeamScoringStruct"
})
public class ArrayOfDayTeamScoringStruct {

    @XmlElement(name = "DayTeamScoringStruct", nillable = true)
    protected List<DayTeamScoringStruct> dayTeamScoringStruct;

    /**
     * Gets the value of the dayTeamScoringStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayTeamScoringStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayTeamScoringStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayTeamScoringStruct }
     * 
     * 
     */
    public List<DayTeamScoringStruct> getDayTeamScoringStruct() {
        if (dayTeamScoringStruct == null) {
            dayTeamScoringStruct = new ArrayList<DayTeamScoringStruct>();
        }
        return this.dayTeamScoringStruct;
    }

}
