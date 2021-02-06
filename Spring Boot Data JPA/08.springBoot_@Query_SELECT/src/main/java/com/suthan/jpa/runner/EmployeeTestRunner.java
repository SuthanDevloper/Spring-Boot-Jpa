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
		// ---Multiple row output--------
//		employeeRepo.getEmpAllDetails().forEach(System.out::println);
//		employeeRepo.getEnnameById().forEach(ob->System.out.println(ob[0]+"---"+ob[1]));
//		employeeRepo.getEmpName().forEach(System.out::println);
		
		
		//------------Single row -------------------
		String s = employeeRepo.getEnameById(1000);
		System.out.println(s);
		
		Object o =employeeRepo.getDataById(1000);
		Object[] oa= (Object[]) o;
		System.out.println(oa[0]+"..."+oa[1]);
		
		
	}

}
