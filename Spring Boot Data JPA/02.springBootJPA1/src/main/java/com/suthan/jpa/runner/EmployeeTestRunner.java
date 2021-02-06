package com.suthan.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suthan.jpa.model.Employee;
import com.suthan.jpa.repo.EmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	public EmployeeRepository employeeRepo ;
	
	@Override
	public void run(String... args) throws Exception {
		
		 employeeRepo.save(new Employee(100,"suthan",9000.0));
		 employeeRepo.save(new Employee(101,"arun",	10000.0));
		 employeeRepo.save(new Employee(102,"saru",8000.0));
		 employeeRepo.save(new Employee(103,"null",9000.0));
		 employeeRepo.save(new Employee(104,"arun",	10000.0));
		 employeeRepo.save(new Employee(105,"null",8000.0));

	}

}
