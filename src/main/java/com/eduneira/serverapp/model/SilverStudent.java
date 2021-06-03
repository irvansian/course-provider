package com.eduneira.serverapp.model;

public class SilverStudent extends Student {
	private int quizToken = 20;
	private int examToken = 0;
	public int getQuizToken() {
		return quizToken;
	}
	public void setQuizToken(int quizToken) {
		this.quizToken = quizToken;
	}
	public int getExamToken() {
		return examToken;
	}
	public void setExamToken(int examToken) {
		this.examToken = examToken;
	}
	
	

}
