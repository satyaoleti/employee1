package com.employeemanagement.employeedetails.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement.employeedetails.model.employee;

@Repository
public interface employeerepository extends JpaRepository<employee,Long> {

}
