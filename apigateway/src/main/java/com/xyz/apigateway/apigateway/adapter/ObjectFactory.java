//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.28 a las 04:49:36 PM COT 
//


package com.xyz.apigateway.apigateway.adapter;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xyz.apigateway.apigateway.adapter package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xyz.apigateway.apigateway.adapter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetCustomerRequest }
     * 
     */
    public SetCustomerRequest createSetCustomerRequest() {
        return new SetCustomerRequest();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link SetCustomerResponse }
     * 
     */ 
    public SetCustomerResponse createSetCustomerResponse() {
        return new SetCustomerResponse();
    }

    /**
     * Create an instance of {@link MsgError }
     * 
     */
    public MsgError createMsgError() {
        return new MsgError();
    }

}
