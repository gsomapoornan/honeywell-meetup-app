package com.honeywll.meetup.controller;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.honeywll.meetup.models.Events;
import com.honeywll.meetup.models.User;
import com.honeywll.meetup.repository.EventsCRUDRepository;
import com.honeywll.meetup.repository.UserCRUDRepository;
import com.honeywll.meetup.service.EmailService;

@Controller
public class GroupsContoller {
	
	@Autowired
	UserCRUDRepository userCRUDRepository;
	
	@Autowired
	EventsCRUDRepository eventsCRUDRepository;
	
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value = "/hackers")
	   public String fetchHackersGroup(Model model) {
		   List<User> users=userCRUDRepository.findByGroupid(1L);  
		   model.addAttribute("userList", users);
		   model.addAttribute("groupname","Hackers Meetup Group");
		   model.addAttribute("groupid",1);
	      return "meetupgroup";
	   }
	
	@RequestMapping(value = "/javadevelopers")
	   public String fetchJavaGroup(Model model) {
		   List<User> users=userCRUDRepository.findByGroupid(2L);  
		   model.addAttribute("userList", users);
		   model.addAttribute("groupname","Java Developers Meetup Group");
		   model.addAttribute("groupid",2);
	      return "meetupgroup";
	   }
	@RequestMapping(value = "/travellers")
	   public String fetchTravellersPage(Model model) {
		   List<User> users=userCRUDRepository.findByGroupid(3L);  
		   model.addAttribute("userList", users);
		   model.addAttribute("groupname","Travellers Meetup Group");
		   model.addAttribute("groupid",3);
	      return "meetupgroup";
	   }


	@RequestMapping(value = "/events")
	   public String fetcEvents(Model model) {
		   List<Events> events=eventsCRUDRepository.findByGroupid(1L);  
		   model.addAttribute("eventList", events);
		   model.addAttribute("groupname","Travellers Meetup Group");
	      return "events";
	   }
	@RequestMapping(value = "/createevents")
	   public String createEvents(Model model) {
		try {
			emailService.sendmail();
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      return "index";
	   }
	
}
