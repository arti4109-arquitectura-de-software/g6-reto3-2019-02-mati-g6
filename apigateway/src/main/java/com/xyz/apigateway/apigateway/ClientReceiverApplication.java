package com.xyz.apigateway.apigateway;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyz.apigateway.apigateway.entities.Client;
import com.xyz.apigateway.apigateway.message.RabbitMqConfig;
import com.xyz.apigateway.apigateway.parser.MetaClient;
import com.xyz.apigateway.apigateway.parser.MetaParser;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ClientReceiverApplication { 
/*
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "/echoClientName/{name}")
    public String echoClientName(@PathVariable(name = "name") String name) {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }

    @RequestMapping(value = "/getClientDetails/{name}")
    public Client getClientDetails(@PathVariable(name = "name") String name) {
        return new Client(name, "1020304050", "40", "Male");
    }

    @PostMapping(path = "/setJsonClient", consumes = "application/json", produces = "application/json")
    public ResponseEntity saveJsonClient(@RequestBody Client client) {
        MetaClient message = MetaParser.parseClient(client);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String client_canonical = mapper.writeValueAsString(message);
            rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, client_canonical);
            System.out.println(client_canonical);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(path = "/setXmlClient", consumes = "application/xml", produces = "application/xml")
    public ResponseEntity saveXmlClient(@RequestBody Client client) {

            MetaClient message = MetaParser.parseClient(client);
            ObjectMapper mapper = new ObjectMapper();
        try {
            String client_canonical = mapper.writeValueAsString(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(path = "/setJsonClient", consumes = "application/json", produces = "application/json")
    public ResponseEntity setNewEntityClient(@RequestBody MetaClient client) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String client_canonical = mapper.writeValueAsString(client);
            rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, client_canonical);
            System.out.println(client_canonical);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity(HttpStatus.OK);
    }

 */
}
