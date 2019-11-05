package com.xyz.apigateway.apigateway;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyz.apigateway.apigateway.Business.CustomerRegistration;
import com.xyz.apigateway.apigateway.Business.CustomerRegistrationReply;
import com.xyz.apigateway.apigateway.entities.*;
import com.xyz.apigateway.apigateway.message.RabbitMqConfig;
import com.xyz.apigateway.apigateway.parser.MetaClient;
import com.xyz.apigateway.apigateway.parser.MetaParser;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientRegistrationController {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@RequestMapping(method = RequestMethod.POST, value = "/register/customer")
	@ResponseBody
	public CustomerRegistrationReply registerCustomer(@RequestBody CustomerRest customer) {
		CustomerRegistrationReply stdregreply = new CustomerRegistrationReply();
		ObjectMapper mapper = new ObjectMapper();

		try {
			String client_canonical = mapper.writeValueAsString(MetaParser.parseClientRest(customer));
			rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, client_canonical);
			System.out.println(client_canonical);
		}

		catch (Exception ee) {
			ee.printStackTrace();
		}

		// We are setting the below value just to reply a message back to the caller
		stdregreply.setName(customer.getName());
		stdregreply.setAge(customer.getAge());
		stdregreply.setIdentificationNumber(customer.getIdentificationNumber());
		stdregreply.setRegistrationStatus("Successful");
		return stdregreply;

	}
	
	

}
