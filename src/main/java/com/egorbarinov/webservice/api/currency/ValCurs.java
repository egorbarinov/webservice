//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.06 at 03:01:50 PM MSK 
//


package com.egorbarinov.webservice.api.currency;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Valute" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NumCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                   &lt;element name="CharCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Nominal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valute"
})
@XmlRootElement(name = "ValCurs")
@Entity
@Table
public class ValCurs {

//    @XmlElement(name = "Valute", required = true)
    @XmlAnyElement(lax=true)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id")
    protected List<ValCurs.Valute> valute;
    @XmlAttribute(name = "Date", required = true)
    @Id
    protected String date;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the valute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValCurs.Valute }
     * 
     * 
     */
    public List<ValCurs.Valute> getValute() {
        if (valute == null) {
            valute = new ArrayList<ValCurs.Valute>();
        }
        return this.valute;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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

    @Override
    public String toString() {
        return "ValCurs{" +
                "valute=" + valute +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NumCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
     *         &lt;element name="CharCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Nominal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "numCode",
        "charCode",
        "nominal",
        "name",
        "value"
    })
    @XmlRootElement(name = "Valute")
    @Entity
    @Table
    public static class Valute {

        @XmlElement(name = "NumCode")
        @XmlSchemaType(name = "unsignedShort")
        protected int numCode;
        @XmlElement(name = "CharCode", required = true)
        protected String charCode;
        @XmlElement(name = "Nominal")
        @XmlSchemaType(name = "unsignedInt")
        protected long nominal;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Value", required = true)
        protected String value;
        @XmlAttribute(name = "ID", required = true)
        @Id
        protected String id;

        /**
         * Gets the value of the numCode property.
         * 
         */
        public int getNumCode() {
            return numCode;
        }

        /**
         * Sets the value of the numCode property.
         * 
         */
        public void setNumCode(int value) {
            this.numCode = value;
        }

        /**
         * Gets the value of the charCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharCode() {
            return charCode;
        }

        /**
         * Sets the value of the charCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharCode(String value) {
            this.charCode = value;
        }

        /**
         * Gets the value of the nominal property.
         * 
         */
        public long getNominal() {
            return nominal;
        }

        /**
         * Sets the value of the nominal property.
         * 
         */
        public void setNominal(long value) {
            this.nominal = value;
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
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
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
        public void setID(String value) {
            this.id = value;
        }

        @Override
        public String toString() {
            return "Valute{" +
                    "numCode=" + numCode +
                    ", charCode='" + charCode + '\'' +
                    ", nominal=" + nominal +
                    ", name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }
    }

}
