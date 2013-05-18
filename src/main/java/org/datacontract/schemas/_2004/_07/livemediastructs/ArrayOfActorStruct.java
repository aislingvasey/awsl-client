
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActorStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActorStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActorStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ActorStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActorStruct", propOrder = {
    "actorStruct"
})
public class ArrayOfActorStruct {

    @XmlElement(name = "ActorStruct", nillable = true)
    protected List<ActorStruct> actorStruct;

    /**
     * Gets the value of the actorStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actorStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActorStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActorStruct }
     * 
     * 
     */
    public List<ActorStruct> getActorStruct() {
        if (actorStruct == null) {
            actorStruct = new ArrayList<ActorStruct>();
        }
        return this.actorStruct;
    }

}
