
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDayRankingStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDayRankingStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayRankingStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS}DayRankingStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDayRankingStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.RankingNS", propOrder = {
    "dayRankingStruct"
})
public class ArrayOfDayRankingStruct {

    @XmlElement(name = "DayRankingStruct", nillable = true)
    protected List<DayRankingStruct> dayRankingStruct;

    /**
     * Gets the value of the dayRankingStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayRankingStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayRankingStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayRankingStruct }
     * 
     * 
     */
    public List<DayRankingStruct> getDayRankingStruct() {
        if (dayRankingStruct == null) {
            dayRankingStruct = new ArrayList<DayRankingStruct>();
        }
        return this.dayRankingStruct;
    }

}
