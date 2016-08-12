package com.chandra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandra.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
