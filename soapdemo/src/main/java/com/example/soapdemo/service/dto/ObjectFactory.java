//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.19 a las 11:47:14 PM COT 
//


package com.example.soapdemo.service.dto;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soapdemo.service.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soapdemo.service.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCardRequest }
     * 
     */
    public GetCardRequest createGetCardRequest() {
        return new GetCardRequest();
    }

    /**
     * Create an instance of {@link GetCardResponse }
     * 
     */
    public GetCardResponse createGetCardResponse() {
        return new GetCardResponse();
    }

    /**
     * Create an instance of {@link CardResponse }
     * 
     */
    public CardResponse createCardResponse() {
        return new CardResponse();
    }

    /**
     * Create an instance of {@link DoExampleResponse }
     * 
     */
    public DoExampleResponse createDoExampleResponse() {
        return new DoExampleResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link DoTransactionRequest }
     * 
     */
    public DoTransactionRequest createDoTransactionRequest() {
        return new DoTransactionRequest();
    }

    /**
     * Create an instance of {@link DoTransactionResponse }
     * 
     */
    public DoTransactionResponse createDoTransactionResponse() {
        return new DoTransactionResponse();
    }

    /**
     * Create an instance of {@link DoExampleRequest }
     * 
     */
    public DoExampleRequest createDoExampleRequest() {
        return new DoExampleRequest();
    }

}
