package com.suthan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suthan.model.Student;

public interface  StudentRepo extends JpaRepository<Student, Integer> {
	
	//@Query("select  S.sname, C.cname from Student S INNER JOIN S.cssub AS C")
	//@Query("select  S.sname, C.cname from Student S LEFT OUTER JOIN S.cssub AS C")
	@Query("select DISTINCT S.sname, C.cname from Student S LEFT  JOIN S.cssub AS C")
	public List<Object[]> getStudentNameAndCourseName();

}
