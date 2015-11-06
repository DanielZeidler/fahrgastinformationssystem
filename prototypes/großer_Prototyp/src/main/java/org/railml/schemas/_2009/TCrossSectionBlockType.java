//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCrossSectionBlockType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tCrossSectionBlockType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="station"/>
 *     &lt;enumeration value="block"/>
 *     &lt;enumeration value="autoblock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tCrossSectionBlockType")
@XmlEnum
public enum TCrossSectionBlockType {

    @XmlEnumValue("station")
    STATION("station"),
    @XmlEnumValue("block")
    BLOCK("block"),
    @XmlEnumValue("autoblock")
    AUTOBLOCK("autoblock");
    private final String value;

    TCrossSectionBlockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TCrossSectionBlockType fromValue(String v) {
        for (TCrossSectionBlockType c: TCrossSectionBlockType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
