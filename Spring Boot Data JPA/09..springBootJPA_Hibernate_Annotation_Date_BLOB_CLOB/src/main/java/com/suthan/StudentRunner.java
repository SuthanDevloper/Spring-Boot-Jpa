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
		
		FileInputStream fis = new FileInputStream("C:\\Wishes-for-Success.jpg");
		byte[] img = new byte[fis.available()];
		fis.read(img);
		
		String text = "ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,ujjjnljnlnslknalkxnalkxnlknlkanxlkanklnlk,";
	char[] desc=	text.toCharArray();
		
		studentRepo.save(new Student(101,"stu9090",9000.0, img, desc));
		fis.close();

	}

}
