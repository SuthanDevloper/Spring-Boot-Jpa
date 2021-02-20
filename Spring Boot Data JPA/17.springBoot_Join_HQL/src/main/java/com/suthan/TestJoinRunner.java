package com.suthan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suthan.repo.StudentRepo;
@Component
public class TestJoinRunner implements CommandLineRunner {

	@Autowired
	private StudentRepo stdRepo;
	
	@Override
	public void run(String... args) throws Exception {
		List<Object[]> list =stdRepo.getStudentNameAndCourseName();
		
		for(Object[] obj:list) {
			System.out.println(obj[0]+"---"+obj[1]);
		}
	}

}
