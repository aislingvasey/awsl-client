
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActorLightStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActorLightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActorLightStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ActorLightStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActorLightStruct", propOrder = {
    "actorLightStruct"
})
public class ArrayOfActorLightStruct {

    @XmlElement(name = "ActorLightStruct", nillable = true)
    protected List<ActorLightStruct> actorLightStruct;

    /**
     * Gets the value of the actorLightStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actorLightStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActorLightStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActorLightStruct }
     * 
     * 
     */
    public List<ActorLightStruct> getActorLightStruct() {
        if (actorLightStruct == null) {
            actorLightStruct = new ArrayList<ActorLightStruct>();
        }
        return this.actorLightStruct;
    }

}
