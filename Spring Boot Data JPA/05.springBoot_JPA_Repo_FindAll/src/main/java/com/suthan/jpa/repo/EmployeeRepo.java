package com.suthan.jpa.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.suthan.jpa.model.Employee;

@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
	

}
