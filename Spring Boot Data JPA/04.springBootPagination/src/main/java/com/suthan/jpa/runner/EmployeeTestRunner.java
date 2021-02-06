package com.suthan.jpa.runner;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
		
		
//		System.out.println("------------sort all----------------");
//		employeeRepo.findAll(Sort.by(Direction.DESC,"ename")).forEach(System.out::println);

		employeeRepo.findAll().forEach(System.out::println);
		
		//page number,,start with 0) page size
		Pageable pageable= PageRequest.of(1,3);
		
		
		Page <Employee> page=employeeRepo.findAll(pageable);
		
		List<Employee> list =page.getContent();
		list.forEach(System.out::println);
		
		System.out.println(page.isEmpty());
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		System.out.println(page.hasNext());
		System.out.println(page.hasPrevious());
		
		int pagesize =page.getNumber();
		System.out.println(pagesize);
		
		System.out.println(page.getTotalPages());
		
		System.out.println(page.getTotalElements());
		
		
		
		
		
		
		
		
		
		
	}

}
