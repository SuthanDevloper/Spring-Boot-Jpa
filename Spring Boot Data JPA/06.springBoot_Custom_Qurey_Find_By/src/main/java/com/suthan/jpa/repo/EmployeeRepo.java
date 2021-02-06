package com.suthan.jpa.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.suthan.jpa.model.Employee;

@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
	//select * from emp_tab1 where empDep=?
	List< Employee>findByEmpDep(String empDep);
	
	//select * from emp_table1 where ename=?
	List<Employee>findByEname(String ename);
	
	//select * from emp_table1 where esal<?
	List<Employee> findByEsalLessThan(Double esal);
	
	//select * from emp_table1 where esal<=?
	List<Employee> findByEsalLessThanEqual(Double esal);
	//select * from emp_table1 where esal>=?
	List<Employee> findByEsalGreaterThanEqual(Double esal);
	
	List<Employee> findByEmpDepNot(String empDep);
	
	List<Employee> findByEnameIsNull();
	
	List<Employee> findByEnameNotNull();
	
	//find by ename where like 
	
	// select * from emp_table1 where ename like ?
	List<Employee> findByEnameLike(String ename);
	
	// select * from emp_table1 where ename not like ?
	List<Employee> findByEnameNotLike(String ename);
	
	// select * from emp-table1 where ename like ?% (%automaticcly come)
	
	List<Employee> findByEnameStartingWith(String ename);
	
	// select * from emp-table1 where ename like %? (%automaticcly come)
	List<Employee> findByEnameEndingWith(String ename);
	
	// select * from emp-table1 where ename like %?% (%automaticcly come)
	List<Employee> findByEnameContaining(String ename);
	
//---------------------------------------Two condition--------------------------
	
	List<Employee> findByEnameAndEsal(String ename, Double esal);
	
	List<Employee> findByEnameOrEsalLessThan(String ename, Double esal);
	
	List<Employee> findByEnameIsNotNullOrEsalGreaterThanEqual(Double esal);
	
}
