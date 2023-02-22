package com.sunny.aop3;

import org.springframework.stereotype.Component;

@Component
public class Adder {
	public void sum() throws Exception {
		String a="abcd";
		String b="3";
		
		try {
			int c = Integer.parseInt(a);
			int d = Integer.parseInt(b);
			System.out.println(c+d); 
		}
		catch (Exception e) {
			throw new Exception("Not a valid Integer");
		}
	}
}
