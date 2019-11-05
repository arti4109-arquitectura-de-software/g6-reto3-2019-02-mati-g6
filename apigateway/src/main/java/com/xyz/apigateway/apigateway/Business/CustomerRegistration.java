package com.xyz.apigateway.apigateway.Business;

import java.util.ArrayList;
import java.util.List;
import com.xyz.apigateway.apigateway.entities.*;
import com.xyz.apigateway.apigateway.parser.MetaClient;

public class CustomerRegistration {
	private List<MetaClient> CustomerRecords;
	private static CustomerRegistration stdregd = null;

	private CustomerRegistration() {
		CustomerRecords = new ArrayList<MetaClient>();
	}

	public static CustomerRegistration getInstance() {
		if (stdregd == null) {
			stdregd = new CustomerRegistration();
			return stdregd;
		} else {
			return stdregd;
		}
	}

	public void add(MetaClient std) {
		CustomerRecords.add(std);
	}

	public String updateOrCreateCustomer(MetaClient std) {
		for (int i = 0; i < CustomerRecords.size(); i++) {
			MetaClient stdn = CustomerRecords.get(i);
			if (stdn.getIdentificacion().equals(std.getIdentificacion())) {
				CustomerRecords.set(i, std);// update the new record
				return "Update successful";
			}
		}
		CustomerRecords.add(std);
		return "Create successful";
	}

	public String deleteCustomer(String registrationNumber) {
		for (int i = 0; i < CustomerRecords.size(); i++) {
			MetaClient stdn = CustomerRecords.get(i);
			if (stdn.getIdentificacion().equals(registrationNumber)) {
				CustomerRecords.remove(i);// update the new record
				return "Delete successful";
			}
		}
		return "Delete un-successful";
	}

	public List<MetaClient> getCustomerRecords() {
		return CustomerRecords;
	}

}
