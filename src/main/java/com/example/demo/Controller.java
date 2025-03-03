package com.example.demo;


import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Repositorystudent student;

    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        List<Student> f= student.findAll();
        return f;
    }

}
