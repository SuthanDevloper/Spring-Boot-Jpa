package com.suthan.jpa.runner;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.suthan.jpa.model.Employee;
import com.suthan.jpa.repo.EmployeeRepo;

@Component
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	public EmployeeRepo employeeRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//
		employeeRepo.getAllEmps().forEach(System.out::println);
		
		System.out.println("-------");
		
		employeeRepo.getEmpByEdept("dev").forEach(System.out::println);
		
		System.out.println("-------");
		
		employeeRepo.getEmployeeByDept(9000.0,"dev").forEach(System.out::println);
		
		//Not allow
		//employeeRepo.getEmployeeByDept("dev",9000.0).forEach(System.out::println);
		
		//--Nameparameters
		
		//employeeRepo.getEmployeeByDept("dev").forEach(System.out::println);

	}

}
