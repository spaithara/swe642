package com.example.swe642.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.swe642.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	
}
