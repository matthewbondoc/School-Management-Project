package com.example.schoolmanagement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

    @Id
    private int idNumber;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
