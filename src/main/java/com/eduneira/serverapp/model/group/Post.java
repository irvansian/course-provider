package com.eduneira.serverapp.model.group;

import java.util.ArrayList;
import java.util.Date;

public class Post {
	private String id;
	private String creatorId;
	private Date createdAt;
	private String caption;
	private ArrayList<String> mediaUrls;
	private ArrayList<String> comments;
	private ArrayList<String> favoritedBy;
	private int favoriteCount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public ArrayList<String> getMediaUrls() {
		return mediaUrls;
	}
	public void setMediaUrls(ArrayList<String> mediaUrls) {
		this.mediaUrls = mediaUrls;
	}
	public ArrayList<String> getComments() {
		return comments;
	}
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	public ArrayList<String> getFavoritedBy() {
		return favoritedBy;
	}
	public void setFavoritedBy(ArrayList<String> favoritedBy) {
		this.favoritedBy = favoritedBy;
	}
	public int getFavoriteCount() {
		return favoriteCount;
	}
	public void setFavoriteCount(int favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	
	
	
}
