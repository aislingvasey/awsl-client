
package org.datacontract.schemas._2004._07.livemediastructs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCIS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCIS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIS" type="{http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS}CIS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCIS", namespace = "http://schemas.datacontract.org/2004/07/LiveMediaStructs.CommonNS", propOrder = {
    "cis"
})
public class ArrayOfCIS {

    @XmlElement(name = "CIS", nillable = true)
    protected List<CIS> cis;

    /**
     * Gets the value of the cis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIS }
     * 
     * 
     */
    public List<CIS> getCIS() {
        if (cis == null) {
            cis = new ArrayList<CIS>();
        }
        return this.cis;
    }

}
