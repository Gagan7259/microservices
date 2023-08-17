package com.example.New2023.Controller;

import com.example.New2023.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(new Student(1, "Gagan"), new Student(2, "Mounika"), new Student(3, "Manoj"), new Student(4, "Sai"));

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Student studentId) {
        return STUDENTS.stream().filter(student -> studentId.equals(student.getStudentId())).findFirst().orElseThrow(() -> new IllegalCallerException("StudentIOd " + studentId + "Does't exist "));
    }
}
