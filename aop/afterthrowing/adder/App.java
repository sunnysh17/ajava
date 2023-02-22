package com.sunny.aop3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Adder a = context.getBean("adder",Adder.class);
		a.sum();
	}

}
