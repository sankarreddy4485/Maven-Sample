package com.myapp.validator;

import com.myapp.dto.Employee;
import org.apache.commons.logging.LogFactory;
public class Validator {
	public void validate(Employee employee) throws Exception {
		try {
			if(employee.getName()==null || employee.getName().isBlank())
				throw new Exception("Validator.INVALID_EMPLOYEE_NAME");
			if( employee.getId()<1000)
				throw new Exception("Validator.INVALID_EMPLOYEE_ID");
			if( employee.getSal()<10000 )
				throw new Exception("Validator.EMPLOYEE_SALARY_RANGE");
		}
		catch(Exception exception) {
			LogFactory.getLog(this.getClass()).error(exception.getMessage(), exception);
			throw exception;
		}
	}
}
