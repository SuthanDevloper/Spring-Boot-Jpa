package com.suthan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suthan.model.Student;

public interface  StudentRepo extends JpaRepository<Student, Integer> {

}
