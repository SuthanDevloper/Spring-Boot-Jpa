package com.suthan.jpa.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.suthan.jpa.model.Employee;

@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	//-------------Multiple Row---------------------
	
	@Query("from Employee e")
	List<Employee> getEmpAllDetails();
	
	@Query("select e.eno,e.ename  from Employee e")
	List<Object[]> getEnnameById();
	
	@Query("select e.ename from Employee e")
	List<String> getEmpName();
	
	//-------------------Single row Manupilation -----------------
	
	
	@Query("select e.ename from Employee e where e.eno=:eno")
	String getEnameById(Integer eno);
	
	
	@Query("select e.ename , e.eno from Employee e where e.eno=:eno")
	Object getDataById(Integer eno);
	
	
	
}
