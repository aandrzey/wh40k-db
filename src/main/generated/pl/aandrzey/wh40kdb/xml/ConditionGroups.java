//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 01:45:58 PM CET 
//


package pl.aandrzey.wh40kdb.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.battlescribe.net/schema/catalogueSchema}conditionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conditionGroup"
})
@XmlRootElement(name = "conditionGroups")
public class ConditionGroups {

    @XmlElement(required = true)
    protected ConditionGroup conditionGroup;

    /**
     * Gets the value of the conditionGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionGroup }
     *     
     */
    public ConditionGroup getConditionGroup() {
        return conditionGroup;
    }

    /**
     * Sets the value of the conditionGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionGroup }
     *     
     */
    public void setConditionGroup(ConditionGroup value) {
        this.conditionGroup = value;
    }

}
