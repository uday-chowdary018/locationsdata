package com.uday.location.utility;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Component
public class emailUtilityImpl implements emailUtility {

	 @Autowired
     private JavaMailSender sender;
	@Override
	public void emailSender(String addrees, String subject, String body) {
		
	
		MimeMessage message = sender.createMimeMessage();//to send through sender the data createMimemessage method is in the JavaMailSender 
		//we can diretly assig rhr address,subject,body to message .but we create the recipy and lot to code.by using MimeMessageHelper(it is a class) is so essy
		MimeMessageHelper helper = new MimeMessageHelper(message);
		try {
			helper.setTo(addrees);
			helper.setSubject(subject);
			helper.setText(body);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		sender.send(message);
		
		
	}

}
