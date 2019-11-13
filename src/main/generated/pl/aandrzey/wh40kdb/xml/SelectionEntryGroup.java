//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 01:45:58 PM CET 
//


package pl.aandrzey.wh40kdb.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.battlescribe.net/schema/catalogueSchema}modifiers"/&gt;
 *         &lt;element ref="{http://www.battlescribe.net/schema/catalogueSchema}constraints"/&gt;
 *         &lt;element ref="{http://www.battlescribe.net/schema/catalogueSchema}entryLinks"/&gt;
 *         &lt;element ref="{http://www.battlescribe.net/schema/catalogueSchema}selectionEntries"/&gt;
 *         &lt;element ref="{http://www.battlescribe.net/schema/catalogueSchema}selectionEntryGroups"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="collective" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="import" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="defaultSelectionEntryId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modifiersOrConstraintsOrEntryLinks"
})
@XmlRootElement(name = "selectionEntryGroup")
public class SelectionEntryGroup {

    @XmlElements({
        @XmlElement(name = "modifiers", type = Modifiers.class),
        @XmlElement(name = "constraints", type = Constraints.class),
        @XmlElement(name = "entryLinks", type = EntryLinks.class),
        @XmlElement(name = "selectionEntries", type = SelectionEntries.class),
        @XmlElement(name = "selectionEntryGroups", type = SelectionEntryGroups.class)
    })
    protected List<Object> modifiersOrConstraintsOrEntryLinks;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "hidden")
    protected String hidden;
    @XmlAttribute(name = "collective")
    protected String collective;
    @XmlAttribute(name = "import")
    protected String _import;
    @XmlAttribute(name = "defaultSelectionEntryId")
    protected String defaultSelectionEntryId;

    /**
     * Gets the value of the modifiersOrConstraintsOrEntryLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifiersOrConstraintsOrEntryLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifiersOrConstraintsOrEntryLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modifiers }
     * {@link Constraints }
     * {@link EntryLinks }
     * {@link SelectionEntries }
     * {@link SelectionEntryGroups }
     * 
     * 
     */
    public List<Object> getModifiersOrConstraintsOrEntryLinks() {
        if (modifiersOrConstraintsOrEntryLinks == null) {
            modifiersOrConstraintsOrEntryLinks = new ArrayList<Object>();
        }
        return this.modifiersOrConstraintsOrEntryLinks;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHidden(String value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the collective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollective() {
        return collective;
    }

    /**
     * Sets the value of the collective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollective(String value) {
        this.collective = value;
    }

    /**
     * Gets the value of the import property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImport() {
        return _import;
    }

    /**
     * Sets the value of the import property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImport(String value) {
        this._import = value;
    }

    /**
     * Gets the value of the defaultSelectionEntryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSelectionEntryId() {
        return defaultSelectionEntryId;
    }

    /**
     * Sets the value of the defaultSelectionEntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSelectionEntryId(String value) {
        this.defaultSelectionEntryId = value;
    }

}