package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping("/highest-salary")
    public Faculty getFacultyWithHighestSalary() {
        return facultyService.getFacultyWithHighestSalary();
    }

    @GetMapping("/top5-highest-salary")
    public List<Faculty> getTop5FacultyWithHighestSalary() {
        return facultyService.getTop5FacultyWithHighestSalary();
    }
}
