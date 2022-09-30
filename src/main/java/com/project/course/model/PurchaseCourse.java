package com.project.course.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("PurchaseCourse")
public class PurchaseCourse {
	@Id
	private String purchaseId;
	private List<String> courseId;
	private List<String> studentId;

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public List<String> getCourseId() {
		return courseId;
	}

	public void setCourseId(List<String> courseId) {
		this.courseId = courseId;
	}

	public List<String> getStudentId() {
		return studentId;
	}

	public void setStudentId(List<String> studentId) {
		this.studentId = studentId;
	}

	
	

}
