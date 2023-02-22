package com.sunny.aop2;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class IllegalVoters {
	@AfterThrowing(pointcut = "execution(public void check(..))",throwing = "ex")
	public void afterThrowingAdvice(Exception ex) {
		System.out.println("After Throwing exception in method:"); 
		System.out.println("Exception is: " + ex.getMessage());
	}
}
