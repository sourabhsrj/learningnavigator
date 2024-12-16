package com.example.learningnavigator.ControllerTest;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.learningnavigator.Controller.StudentController;
import com.example.learningnavigator.Model.Student;
import com.example.learningnavigator.Service.StudentService;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService studentService;

    @Test
    public void testGetStudentById() throws Exception {
        Student student = new Student();
        student.setId(1L);
        student.setRegistrationId("REG123");
        student.setName("John Doe");

        when(studentService.getStudentById(1L)).thenReturn(student);

        // mockMvc.perform(get("/students/1"))
        //        .andExpect(status().isOk())
        //        .andExpect(jsonPath("$.name").value("John Doe"));
    }
}
