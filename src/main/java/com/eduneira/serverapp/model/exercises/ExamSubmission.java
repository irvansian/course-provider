package com.eduneira.serverapp.model.exercises;

public class ExamSubmission {
	private String id;
	private String examId;
	private String submitterId;
	private double score;
	private boolean isScored;
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
	public String getSubmitterId() {
		return submitterId;
	}
	public void setSubmitterId(String submitterId) {
		this.submitterId = submitterId;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public boolean isScored() {
		return isScored;
	}
	public void setScored(boolean isScored) {
		this.isScored = isScored;
	}
	
	

}
