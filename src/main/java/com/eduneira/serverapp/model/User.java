package com.eduneira.serverapp.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class User {
	@Id
	@Column(updatable = false, nullable = false)
	private String id;
	private String username;
	private String fullname;
	private ArrayList<String> groupList;
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getFullname() {
//		return fullname;
//	}
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
//	
//	public ArrayList<String> getGroupList() {
//		return groupList;
//	}
//	public void setGroupList(ArrayList<String> groupList) {
//		this.groupList = groupList;
//	}
	
}
