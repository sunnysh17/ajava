package com.sunny.aop3;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class CheckAdd {
	@AfterThrowing(pointcut = "execution(public void sum())",throwing = "ex")
	public void afterThrowingMethod(Exception ex) {
			System.out.println("After Throwing Exception");
			System.out.print("Exception is: " + ex.getMessage());
	}
}
