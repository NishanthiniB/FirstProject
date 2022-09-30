package com.project.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.course.model.Student;
import com.project.course.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepo;

	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	public List<Student> getStudents() {

		return studentRepo.findAll();
	}

}
