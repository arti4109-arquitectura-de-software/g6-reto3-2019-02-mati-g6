package com.xyz.apigateway.apigateway;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xyz.apigateway.apigateway.Business.CustomerRegistration;
import com.xyz.apigateway.apigateway.parser.MetaClient;



@Controller
public class CustomerRetrieveController {
	@RequestMapping(method = RequestMethod.GET, value="/customer/allCustomer")

	@ResponseBody
	public List<MetaClient> getCustomer() {
		return CustomerRegistration.getInstance().getCustomerRecords();
	}

}
