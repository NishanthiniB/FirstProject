package com.project.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.model.Course;
import com.project.course.model.PurchaseCourse;
import com.project.course.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseService;
	@PostMapping
	public ResponseEntity <Course> addCourse(@RequestBody Course course) {
		return new ResponseEntity<>(courseService.addCourse(course), HttpStatus.CREATED);
		
	}
	@GetMapping
	public Page<Course> getCourseByPagination(){
		return courseService.getCourseByPagination();
	}
	@GetMapping("/byCategory")
	public Page<Course> getCourseByCategory(){
		return courseService.getCourseByCategory();
	}
	@GetMapping("/byCost")
	public List<Course> getCourseByCost(@RequestParam(name= "cost") Float cost){
		return courseService.getCourseByCost(cost);
	}
	@GetMapping("/byDuration")
	public List<Course> getCourseByDuration(@RequestParam(name= "duration") String duration){
		return courseService.getCourseByDuration(duration);
	}
	@PostMapping("/enroll")
	public List<PurchaseCourse> enrollCourse(@RequestBody List<PurchaseCourse> purchaseCourse) {
		return courseService.enrollCourse(purchaseCourse);
	}

}
