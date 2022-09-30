package com.project.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.model.Student;
import com.project.course.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
	}
@GetMapping
public List<Student> getStudents(){
	return studentService.getStudents();
}
}
