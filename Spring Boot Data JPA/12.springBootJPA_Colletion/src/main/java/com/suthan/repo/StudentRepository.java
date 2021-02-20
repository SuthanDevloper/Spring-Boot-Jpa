package com.suthan.repo;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suthan.model.Student;

public interface StudentRepository extends JpaRepository<Student, Id> {

}
