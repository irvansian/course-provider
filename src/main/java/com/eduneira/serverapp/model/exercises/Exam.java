package com.eduneira.serverapp.model.exercises;

import java.util.ArrayList;

import com.eduneira.serverapp.model.Subject;

public class Exam {
	private String id;
	private String name;
	private String description;
	private Subject subject;
	private ArrayList<String> quizzes;
	private String examAnswerKeys;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public ArrayList<String> getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(ArrayList<String> quizzes) {
		this.quizzes = quizzes;
	}
	public String getExamAnswerKeys() {
		return examAnswerKeys;
	}
	public void setExamAnswerKeys(String examAnswerKeys) {
		this.examAnswerKeys = examAnswerKeys;
	}
	
	 
	
}
