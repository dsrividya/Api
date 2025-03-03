package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorystudent extends JpaRepository<Student, Integer>{


}
