package com.suthan;



import java.io.FileInputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suthan.model.Student;
import com.suthan.repo.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	
	
	
	@Autowired
	public StudentRepository studentRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		

	}

}
