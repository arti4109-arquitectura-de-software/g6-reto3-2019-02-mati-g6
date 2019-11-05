package com.xyz.apigateway.apigateway.parser;

import com.xyz.apigateway.apigateway.adapter.Customer;
import com.xyz.apigateway.apigateway.entities.Client;
import com.xyz.apigateway.apigateway.entities.CustomerRest;

public class MetaParser {

    public static MetaClient parseClient(Client client) {
        MetaClient metaClient = new MetaClient();
        metaClient.setNombre(client.getName());
        metaClient.setGenero(client.getGender());
        metaClient.setIdentificacion(client.getIdentification());
        metaClient.setEdad(Integer.parseInt(client.getAge()));
        return metaClient;
    }

    public static MetaClient parseClientSoap(Customer customer) {
        MetaClient metaClient = new MetaClient();
        metaClient.setNombre(customer.getName());
        metaClient.setGenero(customer.getGender());
        metaClient.setIdentificacion(customer.getIdentificationNumber());
        metaClient.setEdad(customer.getAge());
        return metaClient;
    }  
    
    public static MetaClient parseClientRest(CustomerRest customer) {
        MetaClient metaClient = new MetaClient();
        metaClient.setNombre(customer.getName());
        metaClient.setGenero(customer.getGender());
        metaClient.setIdentificacion(customer.getIdentificationNumber());
        metaClient.setEdad(customer.getAge());
        return metaClient;
    } 

}