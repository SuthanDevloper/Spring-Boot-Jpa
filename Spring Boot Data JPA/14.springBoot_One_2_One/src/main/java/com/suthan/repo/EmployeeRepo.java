package com.suthan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suthan.model.Department;
import com.suthan.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
