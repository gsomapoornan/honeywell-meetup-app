package com.honeywll.meetup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.honeywll.meetup.models.User;
import java.lang.Long;



public interface UserCRUDRepository extends JpaRepository<User, Long> {
	
	List<User> findByGroupid(Long groupid);
	
	
	 
	   
	   
}
