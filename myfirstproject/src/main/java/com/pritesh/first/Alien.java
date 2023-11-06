package com.pritesh.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	//@Autowired
	
	//Laptop lap;
	
	private int age;
	public Computer getCom() {
		return com;
	}



	public void setCom(Computer com) {
		this.com = com;
	}

	private Computer com;
	
	public Alien(int age) {
		
		this.age = age;
	}

	

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		System.out.println("THIS IS SET AGE");
		this.age = age;
	}

//	public Alien() {
//		System.out.println("Alien Constructor");
//	}
	
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("CODE");
		com.compile();
	}
}
