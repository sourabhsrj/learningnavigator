package com.example.learningnavigator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learningnavigator.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}