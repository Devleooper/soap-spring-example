//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.19 a las 11:47:14 PM COT 
//


package com.example.soapdemo.service.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardResponse" type="{http://localhost:8080/services/cards/v1}CardResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardResponse"
})
@XmlRootElement(name = "getCardResponse", namespace = "http://localhost:8080/services/cards/v1")
public class GetCardResponse {

    @XmlElement(name = "CardResponse", namespace = "", required = true)
    protected CardResponse cardResponse;

    /**
     * Obtiene el valor de la propiedad cardResponse.
     * 
     * @return
     *     possible object is
     *     {@link CardResponse }
     *     
     */
    public CardResponse getCardResponse() {
        return cardResponse;
    }

    /**
     * Define el valor de la propiedad cardResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CardResponse }
     *     
     */
    public void setCardResponse(CardResponse value) {
        this.cardResponse = value;
    }

}
