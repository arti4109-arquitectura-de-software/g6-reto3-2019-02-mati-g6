package com.xyz.client.Client.reciever;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.xyz.client.Client.reciever.entities.Client;
import com.xyz.client.Client.reciever.entities.MetaClient;
import com.xyz.client.Client.reciever.messages.RabbitMqConfig;
import com.xyz.client.Client.reciever.parser.MetaParser;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

@RestController
@SpringBootApplication
public class ClientReceiverApplication {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "/echoClientMeta/")
    public String echoClientMeta() {
        ObjectMapper mapper = new ObjectMapper();
        MetaClient metaClient = new MetaClient();
        String client_canonical = "";
        try {
            client_canonical = mapper.writeValueAsString(metaClient);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return client_canonical;
    }

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

    @PostMapping(path = "/setMetaClient", consumes = "application/json", produces = "application/json")
    public ResponseEntity setNewEntityClient(@RequestBody String client) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JSONParser parser = new JSONParser(client);
            JSONObject json = (JSONObject) parser.parse();
            String client_canonical = mapper.writeValueAsString(client);
            rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, client_canonical);
            System.out.println(client_canonical);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public File loadClientWithSpringInternalClass()
            throws FileNotFoundException {
        return ResourceUtils.getFile(
                "classpath:clientSchema1.json");
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientReceiverApplication.class, args);
    }
}
