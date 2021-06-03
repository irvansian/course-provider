package com.eduneira.serverapp.model.group;

import java.util.ArrayList;

public class Group {
	private String id;
	private String adminId;
	private String groupName;
	private String description;
	private ArrayList<String> posts;
	private ArrayList<String> questions;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<String> getPosts() {
		return posts;
	}
	public void setPosts(ArrayList<String> posts) {
		this.posts = posts;
	}
	public ArrayList<String> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<String> questions) {
		this.questions = questions;
	}
	
	
}
