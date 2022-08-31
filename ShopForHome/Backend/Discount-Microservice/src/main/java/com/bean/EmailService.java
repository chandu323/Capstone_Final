package com.bean;
/*
 * @Author: Ritesh Chandra Shukla
 * 
 * Last Modified Date: 29-08-2022
 * 
 * Description:  Email service Class
 * 
 * Params:
 * 
 * 
 */

public interface EmailService {
	 
    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);
 
    
}
