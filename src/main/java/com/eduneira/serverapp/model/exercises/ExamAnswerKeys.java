package com.eduneira.serverapp.model.exercises;

import java.util.Map;

public class ExamAnswerKeys {
	private String id;
	private String examId;
	private Map<Integer, Character> answerKeys;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public Map<Integer, Character> getAnswerKeys() {
		return answerKeys;
	}
	public void setAnswerKeys(Map<Integer, Character> answerKeys) {
		this.answerKeys = answerKeys;
	}
	
	
	

}
