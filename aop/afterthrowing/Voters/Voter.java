package com.sunny.aop2;

import org.springframework.stereotype.Component;

@Component
public class Voter {
	public void check(String name, int age) throws Exception {
		if(age>=18) 
		{
			System.out.println("Eligible for voting");
		}
		else 
		{
			throw new Exception("Not Eligible");
			 
		}
	}
}
