package com.honeywll.meetup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "meetupgroups")
public class MeetupGroups {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(columnDefinition = "text")
	private String groupname;
	
	
	public MeetupGroups(Long id, String groupname) {
		super();
		this.id = id;
		this.groupname = groupname;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupname;
	}
	public void setGroupName(String groupname) {
		this.groupname = groupname;
	}
	

}
