package com.example.learningnavigator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learningnavigator.Model.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {}