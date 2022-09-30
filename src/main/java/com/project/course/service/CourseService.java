package com.project.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.project.course.model.Course;
import com.project.course.model.PurchaseCourse;
import com.project.course.repo.CourseRepository;

@Service

public class CourseService {
	@Autowired
	CourseRepository courseRepo;

	public Course addCourse(Course course) {
		return courseRepo.save(course);

	}

	public Page<Course> getCourseByPagination() {
		Pageable pageable = PageRequest.of(1, 10);
		Page<Course> courses = courseRepo.findAll(pageable);
		return courses;
	}

	public Page<Course> getCourseByCategory() {
		Pageable pageable = PageRequest.of(0, 20, Sort.by("Category"));
		Page<Course> courseCategory = courseRepo.findAll(pageable);
		return courseCategory;
	}

	public List<Course> getCourseByCost(Float cost) {
		return courseRepo.findByCostLessThan(cost);
	}

	public List<Course> getCourseByDuration(String duration) {

		return courseRepo.findByDurationLessThan(duration);
	}
	public List<PurchaseCourse> enrollCourse(List<PurchaseCourse> purchaseCourse) {
		return courseRepo.save(purchaseCourse);
	}

}
