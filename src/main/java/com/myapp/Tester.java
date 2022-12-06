package com.myapp;

import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import com.myapp.dto.Employee;
import com.myapp.validator.Validator;

public class Tester {

	public static void main(String[] args) throws ConfigurationException {
		// TODO Auto-generated method stub
		
		try {
			Employee employee = new Employee(1234,"SIVA",5000);
			new Validator().validate(employee);
			System.out.println("The employee details are successfully validated.");
		} 
		catch (Exception exception) {
			System.out.println(new Configurations().properties("configuration.properties").getProperty(exception.getMessage()));
		}

	}

}
