package com.eduneira.serverapp.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registrant {
	
	@Id
	private String id;
	private String name;
	private String city;
	private Subject subject;
	private CourseType courseType;
	private String email;
	private String phoneNumber;
	private String message;
	
	public Registrant(String name, String city, Subject subject, CourseType courseType, 
			String email, String phoneNumber, String message) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.city = city;
		this.subject = subject;
		this.courseType = courseType;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.message = message;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public CourseType getCourseType() {
		return courseType;
	}
	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
