package com.honeywll.meetup.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private Long id;
	
	@Column
	private String name;
	@Column
	private String contact;
	@Column
	private String email;
	@Column
	private Long groupid;
	
	
	
	public User(Long id, String name, String contact, String email, Long groupid) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.groupid = groupid;
	}

	public Long getGroupid() {
		return groupid;
	}

	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}






	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
