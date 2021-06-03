package com.eduneira.serverapp.model.exercises;

import java.util.ArrayList;

public class LearningPath {
	private String id;
	private String studentId;
	private String topic;
	private int progress;
	private ArrayList<SubPath> subPaths;
	private ArrayList<String> answeredQuizzes;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public ArrayList<SubPath> getSubPaths() {
		return subPaths;
	}
	public void setSubPaths(ArrayList<SubPath> subPaths) {
		this.subPaths = subPaths;
	}
	public ArrayList<String> getAnsweredQuizzes() {
		return answeredQuizzes;
	}
	public void setAnsweredQuizzes(ArrayList<String> answeredQuizzes) {
		this.answeredQuizzes = answeredQuizzes;
	}
	
	
	
	

}
