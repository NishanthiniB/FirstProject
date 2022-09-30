package com.project.course.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.course.model.Student;
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
