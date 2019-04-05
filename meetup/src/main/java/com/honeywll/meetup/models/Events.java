package com.honeywll.meetup.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Events {

	@Id
	private Long id;
	@Column
	private String name;
	
	@Column
	private String contact;
	
	@Column
	private Long groupid;

	@Column
	private Date date;
	
	
	
	

	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Events(Long id, String name, String contact, Long groupid, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.groupid = groupid;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public Long getGroupid() {
		return groupid;
	}

	public void setGroupid(Long groupid) {
		this.groupid = groupid;
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
}
