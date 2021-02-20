package com.suthan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suthan.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
