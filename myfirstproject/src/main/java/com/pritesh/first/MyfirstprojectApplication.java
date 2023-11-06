package com.pritesh.first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class MyfirstprojectApplication {
	
	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(MyfirstprojectApplication.class, args);
		//Alien obj = context.getBean(Alien.class);
		//obj.code();
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj1 = (Alien)factory.getBean("alien");
		obj1.code();
		System.out.println(obj1.getAge());
		//obj1.age = 15;
		
//		System.out.println(obj1.age);
//		
//		Alien obj2 = (Alien)factory.getBean("alien");
//		obj2.code();
//		
//		System.out.println(obj2.age); 
		
	}

}
