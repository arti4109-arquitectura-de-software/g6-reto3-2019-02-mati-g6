package com.xyz.apigateway.apigateway.message;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.xyz.apigateway.apigateway.parser.MetaClient;
import com.xyz.apigateway.apigateway.Business.*;


public class Receiver {
    public static final String RECEIVE_METHOD_NAME = "receiveMessage";

   /* @Autowired
    private BookRepository repository;*/
    private static final Logger log = LoggerFactory.getLogger(Receiver.class);
    
    public void receiveMessage(String message) {
   	  log.info("StartReceiver...");
   	  ObjectMapper mapper = new ObjectMapper();
   	   try {
		MetaClient cliente=mapper.readValue(message,MetaClient.class);
		CustomerRegistration.getInstance().updateOrCreateCustomer(cliente);
		System.out.println("[************ Receiver *******************] ha recibido el mensaje \"" + message + '"');
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
   	
        
        
    }
}