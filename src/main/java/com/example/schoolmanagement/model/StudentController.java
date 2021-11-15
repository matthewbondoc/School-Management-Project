package com.example.schoolmanagement.controller;


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
        public List<Student> listStudent()   {
           return studentData.findAll();

        }

    
}   