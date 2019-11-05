package com.xyz.apigateway.apigateway.adapter2XML;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;


import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyz.apigateway.apigateway.adapter.MsgError;
import com.xyz.apigateway.apigateway.adapter.SetCustomerRequest;
import com.xyz.apigateway.apigateway.adapter.SetCustomerResponse;
import com.xyz.apigateway.apigateway.message.RabbitMqConfig;
import com.xyz.apigateway.apigateway.parser.MetaParser;


@Endpoint
public class CustomerEndpoint {
 
    private static final String NAMESPACE_URI = "http://www.xyz.com/apigateway/apigateway/adapter";
 
   /* private CountryRepository countryRepository;
 
    @Autowired
    public CustomerEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
 */
	@Autowired
	private RabbitTemplate rabbitTemplate;

    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "set_CustomerRequest")
    @ResponsePayload
    public SetCustomerResponse set_CustomerRequest(@RequestPayload SetCustomerRequest request) {
    	
    	ObjectMapper mapper = new ObjectMapper();

		try {
			String client_canonical = mapper.writeValueAsString(MetaParser.parseClientSoap(request.getCustomer()));
			System.out.println("[************ Cliente *******************] antes de enviar a la cola");
			rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, client_canonical);
			
		}

		catch (Exception ee) {
			ee.printStackTrace();
		}
 
    	SetCustomerResponse response = new SetCustomerResponse();
    	MsgError msgError=new MsgError();
    	msgError.setDescStatus("OK!!!");
    	msgError.setStatus(0);
    	//response.setStatus("OK!!!");
        //response.setCountry(countryRepository.findCountry(request.getName()));
    	response.setRespuesta(msgError);
        return response;
    }
}
