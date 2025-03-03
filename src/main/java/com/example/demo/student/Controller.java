package com.example.demo.student;


import com.example.demo.Repositorystudent;
import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

    @Component
    public class Controller implements CommandLineRunner {

        @Autowired
        private Repositorystudent studentRepo;

        @Override
        public void run(String... args) throws Exception {
            // Add some test students
            studentRepo.save(new Student(1, "John Doe", 85.5f, "Computer Science"));
            studentRepo.save(new Student(2, "Jane Smith", 92.0f, "Electrical Engineering"));
        }
    }


