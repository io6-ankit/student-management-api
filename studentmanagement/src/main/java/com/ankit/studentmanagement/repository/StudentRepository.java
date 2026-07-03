package com.ankit.studentmanagement.repository;

import com.ankit.studentmanagement.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
