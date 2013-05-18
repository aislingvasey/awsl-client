
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEventMatchFilActionStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventMatchFilActionStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventMatchFilActionStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS}EventMatchFilActionStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventMatchFilActionStruct", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.FilActionNS", propOrder = {
    "eventMatchFilActionStruct"
})
public class ArrayOfEventMatchFilActionStruct {

    @XmlElement(name = "EventMatchFilActionStruct", nillable = true)
    protected List<EventMatchFilActionStruct> eventMatchFilActionStruct;

    /**
     * Gets the value of the eventMatchFilActionStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventMatchFilActionStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventMatchFilActionStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventMatchFilActionStruct }
     * 
     * 
     */
    public List<EventMatchFilActionStruct> getEventMatchFilActionStruct() {
        if (eventMatchFilActionStruct == null) {
            eventMatchFilActionStruct = new ArrayList<EventMatchFilActionStruct>();
        }
        return this.eventMatchFilActionStruct;
    }

}
