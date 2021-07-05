package com.ssep.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EncryPswdTest {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("application-context.xml");
		EncryptedPassword ecrypwd=context.getBean("encryptedPassword",EncryptedPassword.class);
		ecrypwd.getMD5Password("121212");
		ecrypwd.getBcryptPassword("121212");
		((AbstractApplicationContext) context).close();
	}

}
