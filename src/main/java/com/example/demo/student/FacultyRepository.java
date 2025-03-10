package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    // Method to get the faculty with the highest salary
    @Query("SELECT f FROM Faculty f WHERE f.salary = (SELECT MAX(f2.salary) FROM Faculty f2)")
    Faculty findFacultyWithHighestSalary();

    // Method to get top 5 faculties with the highest salary
    @Query("SELECT f FROM Faculty f ORDER BY f.salary DESC")
    List<Faculty> findTop5FacultyWithHighestSalary();
}
