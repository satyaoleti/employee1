package com.employeemanagement.employeedetails.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employeemanagement.employeedetails.exception.EmployeeNotFoundException;
import com.employeemanagement.employeedetails.model.employee;
import com.employeemanagement.employeedetails.repository.employeerepository;

@RestController
public class employeecontroller {
	@Autowired
	employeerepository EmployeeRepository;
	
	
	@GetMapping("/employee")
	public List<employee> getallemployee() {
		return EmployeeRepository.findAll();
		
	}
	@PostMapping("/employee")
	public employee createemployee(@Validated @RequestBody employee Employee) {
		return EmployeeRepository.save(Employee);
		
	}
	
	@PutMapping("/employee/{id}")
	public employee updateemployee(@PathVariable(value="id") Long id,
			@Validated @RequestBody employee employeedetails)throws EmployeeNotFoundException{
		employee Employee=EmployeeRepository.findById(id)
		                      .orElseThrow(()->new EmployeeNotFoundException(id));
	Employee.setName(employeedetails.getName())	;
	                     Employee.setDesgination(employeedetails.getDesgination());
	                     Employee.setSalary(employeedetails.getSalary());
	                     employee updatedemployee=EmployeeRepository.save(Employee);
	                     return updatedemployee;
	}

	
	
	

}
