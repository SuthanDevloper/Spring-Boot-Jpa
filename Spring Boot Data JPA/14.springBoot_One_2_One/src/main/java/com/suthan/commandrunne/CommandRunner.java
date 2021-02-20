package com.suthan.commandrunne;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suthan.model.Department;
import com.suthan.model.Employee;
import com.suthan.repo.EmployeeRepo;
import com.suthan.repo.DepartRepo;

@Component
public class CommandRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepo emprepo;
	
	@Autowired
	private DepartRepo deprepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Employee e =  new Employee(100,"Suthan");
		Employee e1 = new Employee(101,"Arun");
		
		Employee e2=  new Employee(102,"Suresh");
		Employee e3 = new Employee(103,"Aji");
		
		emprepo.save(e);
		emprepo.save(e1);
		emprepo.save(e2);
		emprepo.save(e3);
		
		Department p1 = new Department(1,"DEV",Arrays.asList(e,e1));
		Department p2 = new Department(2,"QA",Arrays.asList(e2,e3));
		//Department p3 = new Department(3,"pencil",5,ven);
		
		deprepo.save(p1);
		deprepo.save(p2);
		

}
	
}
