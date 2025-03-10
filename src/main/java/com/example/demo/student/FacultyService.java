package com.example.demo.student;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class FacultyService {

        @Autowired
        private FacultyRepository facultyRepository;

        // Get Faculty with the highest salary
        public Faculty getFacultyWithHighestSalary() {
            return facultyRepository.findFacultyWithHighestSalary();
        }

        // Get top 5 faculties with the highest salary
        public List<Faculty> getTop5FacultyWithHighestSalary() {
            return facultyRepository.findTop5FacultyWithHighestSalary();
        }
    }


