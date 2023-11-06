package com.pritesh.first;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
		public void compile() {
			// TODO Auto-generated method stub
				System.out.println("This is laptop");
		}
}
