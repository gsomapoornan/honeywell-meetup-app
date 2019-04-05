package com.honeywll.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.honeywll.meetup.models.Events;
import java.lang.Long;
import java.util.List;

public interface EventsCRUDRepository extends JpaRepository<Events, Long>  {
	
List<Events> findByGroupid(Long groupid);
	
}
