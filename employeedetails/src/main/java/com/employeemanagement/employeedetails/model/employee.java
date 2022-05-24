package com.employeemanagement.employeedetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class employee {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String desgination;
	private int salary;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public employee() {
		super();
		//TODO Auto-generated constructor stub
	}
	public employee(Long id,String name,String desgination,int salary) {
		super();
		this.id=id;
		this.name=name;
		this.desgination=desgination;
		this.salary=salary;
		
		
	}
	

}
