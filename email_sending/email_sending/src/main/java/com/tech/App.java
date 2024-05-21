package com.tech;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Hello world!
 *
 */
public class App {
	private static Session session;

	public static void main(String[] args) {
	 
		
		 String from = "ayassj@gmail.com";
	        String to = "ayassj02@gmail.com";

	        Properties properties = createConfiguration();

	        SmtpAuthenticator authentication = new SmtpAuthenticator();

	        Session session = Session.getDefaultInstance(properties, authentication);

	        try {

	            MimeMessage message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(from));
	            message.addRecipient(Message.RecipientType.TO,
	                new InternetAddress(to));
	            message.setSubject("Java Developer");

	            // Now set the actual message
	            message.setText("Thanks Numetry Technologies");

	           // Send message
	           Transport.send(message);

	           System.out.println("Sent message successfully....");
	        } catch (MessagingException mex) {
	           mex.printStackTrace();
	     }
	 }
 

	 private static Properties createConfiguration() {
	    return new Properties() {
	        {
	            put("mail.smtp.auth", "true");
	            put("mail.smtp.host", "smtp.gmail.com");
	            put("mail.smtp.port", "587");
	            put("mail.smtp.starttls.enable", "true");
	        }
	    };
	 
	 }
		 
		
	 private static class SmtpAuthenticator extends Authenticator {
		 private String username = "ayassj02@gmail.com";
	        private String password = "knjt ancs enrb oupg";

	        @Override
	        public PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	        }
	}
}
