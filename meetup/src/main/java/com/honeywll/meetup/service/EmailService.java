package com.honeywll.meetup.service;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

	public void sendmail() throws AddressException, MessagingException, IOException {
		   Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication("ganesh.poorna86@gmail.com", "2023*Laddu");
		      }
		   });
		   Message msg = new MimeMessage(session);
		   msg.setFrom(new InternetAddress("ganesh.poorna86@gmail.com", false));

		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ganesh.soma86@gmail.com"));
		   msg.setSubject("Event Created email");
		   msg.setContent("Planned Hacktrix Event at Honeywll on 23/04/19", "text/html");
		   msg.setSentDate(new Date());

		   MimeBodyPart messageBodyPart = new MimeBodyPart();
		   messageBodyPart.setContent("Planned Hacktrix Event at Honeywll on 23/04/19. Please do attend", "text/html");

		   
		   Transport.send(msg);   
		}		
	
}
