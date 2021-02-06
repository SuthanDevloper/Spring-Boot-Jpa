package com.suthan.jpa.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.suthan.jpa.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	//select from emp_table1
	@Query("select e from Employee e")
	List<Employee>getAllEmps();
	
	@Query("select e from Employee e where e.empDep=?1")
	List<Employee> getEmpByEdept(String empDep);
	
	// ****Must provide numbers otherwise error
	//**order must be provide where number applicaple 
	@Query("select e from Employee e where e. empDep=?2 or e.esal=?1")
	List<Employee> getEmployeeByDept(Double b,String a);
	
	
	
	//-------------Name Parameters ---------------------------
	
	//@Query("select e from Employee e where e.empDep=:a")
		//List<Employee> getEmployeeByDept(String a);
	
	
	
	
	
}
