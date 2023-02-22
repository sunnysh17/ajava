package com.sunny.aop1;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class AfterAspect {
	@AfterReturning(pointcut = "execution(public int product(..))",returning = "returnvalue")
	public void adderAfterReturnAspect(int returnvalue) {
		System.out.println("From after returning advice");
		System.out.println("Multplication: " + returnvalue);
	}
}
