//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eGeoMappings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eGeoMappings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="geoMapping" type="{http://www.railml.org/schemas/2009}tPlacedElement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eGeoMappings", propOrder = {
    "geoMapping"
})
public class EGeoMappings {

    protected List<TPlacedElement> geoMapping;

    /**
     * Gets the value of the geoMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPlacedElement }
     * 
     * 
     */
    public List<TPlacedElement> getGeoMapping() {
        if (geoMapping == null) {
            geoMapping = new ArrayList<TPlacedElement>();
        }
        return this.geoMapping;
    }

}
