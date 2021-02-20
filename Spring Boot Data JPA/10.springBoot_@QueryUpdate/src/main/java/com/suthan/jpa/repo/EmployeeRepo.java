package com.suthan.jpa.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.suthan.jpa.model.Employee;

@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Transactional
	@Modifying
	@Query("delete from Employee e where e.ename=:ename")
	int removeDataByName(String ename);
	
	
	
}
