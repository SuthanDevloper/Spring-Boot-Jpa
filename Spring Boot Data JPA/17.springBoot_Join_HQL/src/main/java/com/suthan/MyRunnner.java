package com.suthan;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suthan.model.Course;
import com.suthan.model.Student;
import com.suthan.repo.CourseRepo;
import com.suthan.repo.StudentRepo;

@Component
public class MyRunnner implements CommandLineRunner {
	
	@Autowired
	private CourseRepo crepo;
	
	@Autowired
	private StudentRepo stdRepo;

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(100,"java",9000.00);
		Course c2 = new Course(101,"javascript",2000.00);
		Course c3 = new Course(102,"spring",9000.00);
		Course c4 = new Course(103,"hibernate",9000.00);
		Course c5 = new Course(104,"angular",9000.00);
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		crepo.save(c4);
		crepo.save(c5);
		Student s = new Student(1001,"suthan",Arrays.asList(c1,c2));
		Student s1 = new Student(1002,"Arun",Arrays.asList(c1,c3));
		Student s2 = new Student(1003,"param",Arrays.asList());
		stdRepo.save(s);
		stdRepo.save(s1);
		stdRepo.save(s2);
	}
	

}
