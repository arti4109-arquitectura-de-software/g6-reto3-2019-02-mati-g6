package com.xyz.apigateway.apigateway.entities;

public class CustomerRest {
	String name;
	int age;   
	String identificationNumber;
	String gender;
	
	public String getGender() {
		return gender;
	}

	public void setTypeId(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
}
