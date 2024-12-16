package com.example.learningnavigator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningnavigator.Model.Exam;
import com.example.learningnavigator.Service.ExamService;

@RestController
@RequestMapping("/exams")
public class ExamController {
    @Autowired
    private ExamService examService;

    @PostMapping("/{examId}")
    public ResponseEntity<Exam> registerStudentForExam(@PathVariable Long examId, @RequestBody Long studentId) {
        return ResponseEntity.ok(examService.registerStudentForExam(examId, studentId));
    }
}
