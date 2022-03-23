package com.example.mongocourse;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SudentRepository extends MongoRepository<Student, String> {

    Optional<Student> findStudentByEmail(String email);

}
