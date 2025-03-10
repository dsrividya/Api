package com.example.demo.student;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Entity
    public class Faculty {

        @Id
        private Long id;
        private String name;
        private Double salary;
        // Getters and Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Double getSalary() {
            return salary;
        }
        public void setSalary(Double salary) {
            this.salary = salary;
        }
    }



