package com.sunny.aop1;

import org.springframework.stereotype.Component;

@Component
public class Multiplier {
	public int product(int a, int b) {
		return a*b;
	}
}
