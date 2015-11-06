//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				data about the car body of a vehicle and its payload
 * 			
 * 
 * <p>Java class for eWagon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eWagon">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tWagon">
 *       &lt;sequence>
 *         &lt;element name="passenger" type="{http://www.railml.org/schemas/2009}ePassenger" minOccurs="0"/>
 *         &lt;element name="goods" type="{http://www.railml.org/schemas/2009}tGoods" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eWagon", propOrder = {
    "passenger",
    "goods"
})
public class EWagon
    extends TWagon
{

    protected EPassenger passenger;
    protected TGoods goods;

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link EPassenger }
     *     
     */
    public EPassenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPassenger }
     *     
     */
    public void setPassenger(EPassenger value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link TGoods }
     *     
     */
    public TGoods getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGoods }
     *     
     */
    public void setGoods(TGoods value) {
        this.goods = value;
    }

}
