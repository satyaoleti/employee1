package com.employeemanagement.employeedetails.exception;

public class EmployeeNotFoundException extends Exception {
	private long id;
	public EmployeeNotFoundException(Long id) {
		super(String.format("Employee is not found with id:'%s'",id));
	}

}
