
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfScorerStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfScorerStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScorerStruct" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.MatchNS}ScorerStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScorerStruct", propOrder = {
    "scorerStruct"
})
public class ArrayOfScorerStruct {

    @XmlElement(name = "ScorerStruct", nillable = true)
    protected List<ScorerStruct> scorerStruct;

    /**
     * Gets the value of the scorerStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorerStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorerStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScorerStruct }
     * 
     * 
     */
    public List<ScorerStruct> getScorerStruct() {
        if (scorerStruct == null) {
            scorerStruct = new ArrayList<ScorerStruct>();
        }
        return this.scorerStruct;
    }

}
