
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMatchFilActionStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMatchFilActionStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchFilActionStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}MatchFilActionStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMatchFilActionStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", propOrder = {
    "matchFilActionStruct"
})
public class ArrayOfMatchFilActionStruct {

    @XmlElement(name = "MatchFilActionStruct", nillable = true)
    protected List<MatchFilActionStruct> matchFilActionStruct;

    /**
     * Gets the value of the matchFilActionStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchFilActionStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchFilActionStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchFilActionStruct }
     * 
     * 
     */
    public List<MatchFilActionStruct> getMatchFilActionStruct() {
        if (matchFilActionStruct == null) {
            matchFilActionStruct = new ArrayList<MatchFilActionStruct>();
        }
        return this.matchFilActionStruct;
    }

}
