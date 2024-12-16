package com.example.learningnavigator.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learningnavigator.Exception.ResourceNotFoundException;
import com.example.learningnavigator.Model.Exam;
import com.example.learningnavigator.Model.Student;
import com.example.learningnavigator.Repository.ExamRepository;
import com.example.learningnavigator.Repository.StudentRepository;

@Service
public class ExamService {
    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private StudentRepository studentRepository;

    public Exam registerStudentForExam(Long examId, Long studentId) {
        Exam exam = examRepository.findById(examId)
                .orElseThrow(() -> new ResourceNotFoundException("Exam not found"));
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        if (!student.getEnrolledSubjects().contains(exam.getSubject())) {
            throw new IllegalArgumentException("Student not enrolled in the subject");
        }

        exam.getEnrolledStudents().add(student);
        student.getRegisteredExams().add(exam);

        studentRepository.save(student);
        return examRepository.save(exam);
    }
}
