package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentData extends MongoRepository<Student, String> {



}