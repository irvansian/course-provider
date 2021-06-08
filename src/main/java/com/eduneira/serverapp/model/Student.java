package com.eduneira.serverapp.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public abstract class Student extends User {
	private ArrayList<String> answeredQuizzes;
	private ArrayList<String> completedExams;
	private ArrayList<String> watchedVideoPost;
//	public ArrayList<String> getAnsweredQuizzes() {
//		return answeredQuizzes;
//	}
//	public void setAnsweredQuizzes(ArrayList<String> answeredQuizzes) {
//		this.answeredQuizzes = answeredQuizzes;
//	}
//	public ArrayList<String> getCompletedExams() {
//		return completedExams;
//	}
//	public void setCompletedExams(ArrayList<String> completedExams) {
//		this.completedExams = completedExams;
//	}
//	public ArrayList<String> getWatchedVideoPost() {
//		return watchedVideoPost;
//	}
//	public void setWatchedVideoPost(ArrayList<String> watchedVideoPost) {
//		this.watchedVideoPost = watchedVideoPost;
//	}
	
	

}
