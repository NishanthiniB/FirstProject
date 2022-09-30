package com.project.course.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.course.model.Course;
import com.project.course.model.PurchaseCourse;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

	Page<Course> findAll(Pageable pageable);

//	Page<Course> findCostByLessThan(String cost, Pageable pageable);
	@Query(value = "{'cost' : {$lte:?0}}")
	List<Course> findByCostLessThan(Float cost );

	@Query(value = "{'duration' : {$lte:?0}}")
	List<Course> findByDurationLessThan(String duration);

	List<PurchaseCourse> save(List<PurchaseCourse> purchaseCourse);
}
