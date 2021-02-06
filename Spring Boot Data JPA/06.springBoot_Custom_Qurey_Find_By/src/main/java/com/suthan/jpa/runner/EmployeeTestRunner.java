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
		
		employeeRepo.saveAll( 
				Arrays.asList(
				
				new Employee(1000,"suthan",9000.0,"dev"),
				new Employee(1003,"kannan",8000.0,"QA"),
				new Employee(1004,"arun",1000.0,"TESTER"),
				new Employee(1005,"null",5000.0,"dev"),
				new Employee(1006,"xxx",12000.0,"QA"),
				new Employee(1007,"null",19000.0,"TESTER")
				)
				);
		
		//employeeRepo.findAll().forEach(System.out::println);
//
			employeeRepo.findByEmpDep("dev").forEach(System.out::println);
			System.out.println();
			employeeRepo.findByEname("suthan").forEach(System.out::println);
			System.out.println();
			
		employeeRepo.findByEsalLessThan(9000.0).forEach(System.out::println);
		System.out.println();
		
		employeeRepo.findByEsalLessThan(9000.0).forEach(System.out::println);
		System.out.println();
		
		employeeRepo.findByEsalGreaterThanEqual(9000.0).forEach(System.out::println);
		System.out.println();
		employeeRepo.findByEmpDepNot("QA").forEach(System.out::println);
		System.out.println();
		employeeRepo.findByEnameIsNull().forEach(System.out::println);
		
		System.out.println();
		
		employeeRepo.findByEnameNotNull().forEach(System.out::println);
		
		System.out.println("--");
		
		//Start with s
		employeeRepo.findByEnameLike("s%").forEach(System.out::println);
		System.out.println("--");
		//Not start with s
		employeeRepo.findByEnameNotLike("s%").forEach(System.out::println);
		System.out.println("--");
		
		employeeRepo.findByEnameStartingWith("A").forEach(System.out::println);
		System.out.println("--");
		
		employeeRepo.findByEnameEndingWith("n").forEach(System.out::println);
		System.out.println("--");
		employeeRepo.findByEnameContaining("u").forEach(System.out::println);
		
		System.out.println("--");
		employeeRepo.findByEnameAndEsal("suthan", 9000.0).forEach(System.out::println);
		System.out.println("--");
		employeeRepo.findByEnameOrEsalLessThan("suthan", 9000.0).forEach(System.out::println);
		
		//employeeRepo.findByEnameIsNotNullOrEsalGreaterThanEqual(9000.00).forEach(System.out::println);
	}

}
