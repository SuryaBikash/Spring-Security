package com.ssep.test;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class EncryptedPassword {
	
	public String getMD5Password(String myPassword) {
		
		Md5PasswordEncoder encoder=new Md5PasswordEncoder();
		String encryptedPwd=encoder.encodePassword(myPassword, null);
		System.out.println("MD5 encrypted password  :  " +encryptedPwd);
		return encryptedPwd;
	}
	
	public String getBcryptPassword(String myPassword) {
		
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		String encryptedPwd = encoder.encode(myPassword);
		System.out.println("Bcrypt encrypted password  :  " +encryptedPwd);
		return encryptedPwd;
		
	}

}
