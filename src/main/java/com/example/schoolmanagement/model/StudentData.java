package com.example.schoolmanagement.repository;

import org.springframework.data.annotation.Id;


@Repository
public interface StudentData extends MongoRepository<Student, String>{



}