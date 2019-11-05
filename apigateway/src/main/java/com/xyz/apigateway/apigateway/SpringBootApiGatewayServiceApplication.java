package com.xyz.apigateway.apigateway;

import java.util.Date;

import com.xyz.apigateway.apigateway.entities.Client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication(scanBasePackages = {"com.xyz.apigateway"})
public class SpringBootApiGatewayServiceApplication {
    
	
	/*@RequestMapping(value = "/echoClientName/{name}")
    public String echoClientName(@PathVariable(name = "name") String name) {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }*/
	
/*   @RequestMapping(value = "/getClientDetails/{name}")
    public Client getClientDetails(@PathVariable(name = "name") String name) {
        return new Client(name, "1020304050", "40", "Male");
    }
  */
   

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiGatewayServiceApplication.class, args);
    }
}