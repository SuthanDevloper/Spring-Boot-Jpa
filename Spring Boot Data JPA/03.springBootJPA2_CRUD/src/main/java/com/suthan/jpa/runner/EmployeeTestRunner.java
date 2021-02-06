package com.suthan.jpa.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
		// insert one query 
		/*
		employeeRepo.save(new Employee(1000,"suthan",10000.0));
		employeeRepo.save(new Employee(1000,"suthanji",10000.0));*/
		
		employeeRepo.saveAll( 
				Arrays.asList(
				
				new Employee(1000,"suthan",10000.0),
				new Employee(1003,"kannan",10000.0),
				new Employee(1004,"arun",10000.0),
				new Employee(1005,"james",10000.0),
				new Employee(1006,"null",10000.0),
				new Employee(1007,"kannanji",10000.0),
				new Employee(1008,"null",10000.0),
				new Employee(1009,"null",10000.0)
				)
				);
		
		System.out.println("------------find all----------------");
		
		employeeRepo.findAll().forEach(System.out::println);
		
		 System.out.println("------------findById----------------");
		 	employeeRepo.findAllById(List.of(1000,1003)).forEach(System.out::println); 
	
			
		
		 Optional<Employee> opt =employeeRepo.findById(1000);
		 if(opt.isPresent()) 
			 System.out.println(opt.get());
		  else
			 System.out.println("no records ");
		 
		
		 System.out.println("-------------existsById---------------");
		boolean employeedata = employeeRepo.existsById(1000);
		if(employeedata != false) {
			System.out.println(employeedata);
		}else
			System.out.println("employee data not present");
		
		 System.out.println("-----------count -----------------");
		  
		 System.out.println(employeeRepo.count());
		 /*
		 System.out.println("-----------deleteByid Spring JPA after record-----------------");
		 
		 employeeRepo.deleteById(1005);
		 employeeRepo.findAll().forEach(System.out::println);
		 
		 System.out.println("-----------delete(object) by object after record-----------------");
		 
		 Employee emp = new Employee();
		 
		 emp.setEno(1002);
		 employeeRepo.delete(emp);
		 
		 employeeRepo.findAll().forEach(System.out::println);
		 
//		 System.out.println("-----------deleteAll(object) by object after record-----------------");
//		 
//		 //java 9 verstion 
//		 employeeRepo.deleteAll(
//				 List.of(
//						 )
//				 
//				 
//				 
//				 );
		 
		 employeeRepo.deleteAll();*/
		
	}

}
