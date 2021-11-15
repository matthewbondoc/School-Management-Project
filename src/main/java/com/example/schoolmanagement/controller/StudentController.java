package com.example.schoolmanagement.controller;

import java.util.List;

import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.repository.StudentData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

        @Autowired
        private StudentData studentData;
        
        @PostMapping("/add")
        public void addStudent(@RequestBody Student student) {
                studentData.insert(student);

        }

        @PostMapping("/delete/{idNumber}")
        public void deleteStudent(@PathVariable String idNumber) {
                studentData.deleteById(idNumber);

        }

        @GetMapping("/list")
        public List<Student> listStudents()   {
           return studentData.findAll();

        }

    
}   