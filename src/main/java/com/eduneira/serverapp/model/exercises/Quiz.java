package com.eduneira.serverapp.model.exercises;

import com.eduneira.serverapp.model.Subject;

public class Quiz {
	private String id;
	private Subject subject;
	private String topic;
	private String subtopic;
	private String task;
	private String imageUrl;
	private char answerKey;
	private String solutionId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSubtopic() {
		return subtopic;
	}
	public void setSubtopic(String subtopic) {
		this.subtopic = subtopic;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public char getAnswerKey() {
		return answerKey;
	}
	public void setAnswerKey(char answerKey) {
		this.answerKey = answerKey;
	}
	public String getSolutionId() {
		return solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	
	
}
