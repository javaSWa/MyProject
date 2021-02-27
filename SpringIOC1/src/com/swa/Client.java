package com.swa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		/* DI using Constructor injection */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student stu = context.getBean("stu",Student.class);
		stu.display();
		
	}

}
