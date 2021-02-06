package com.suthan.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.suthan.jpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	

}
