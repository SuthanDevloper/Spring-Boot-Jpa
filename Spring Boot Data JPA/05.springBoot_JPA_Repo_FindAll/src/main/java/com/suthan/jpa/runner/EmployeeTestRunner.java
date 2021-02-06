package com.suthan.jpa.runner;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.expression.spel.ast.OpAnd;
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
		employeeRepo.findAll().forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		
		/*
		 * Employee emp = new Employee(); emp.setEdep("dev");
		 * 
		 * Example<Employee> example = Example.of(emp);
		 * 
		 * List<Employee> list =employeeRepo.findAll(example);
		 * 
		 * list.forEach(System.out::println);
		 */
		
	}

}
