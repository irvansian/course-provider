package com.eduneira.serverapp.model.learningmaterial;

import java.util.ArrayList;

public class VideoLearningPath {
	private String id;
	private String title;
	private String description;
	private ArrayList<String> videoPosts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<String> getVideoPosts() {
		return videoPosts;
	}
	public void setVideoPosts(ArrayList<String> videoPosts) {
		this.videoPosts = videoPosts;
	}
	
	

}
