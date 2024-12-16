package com.example.learningnavigator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learningnavigator.Model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {}
