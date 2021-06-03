package com.eduneira.serverapp.model;

import java.util.ArrayList;

public abstract class User {
	private String id;
	private String username;
	private String fullname;
	private ArrayList<String> followingList;
	private ArrayList<String> followersList;
	private ArrayList<String> groupList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public ArrayList<String> getFollowingList() {
		return followingList;
	}
	public void setFollowingList(ArrayList<String> followingList) {
		this.followingList = followingList;
	}
	public ArrayList<String> getFollowersList() {
		return followersList;
	}
	public void setFollowersList(ArrayList<String> followersList) {
		this.followersList = followersList;
	}
	public ArrayList<String> getGroupList() {
		return groupList;
	}
	public void setGroupList(ArrayList<String> groupList) {
		this.groupList = groupList;
	}
	
}
