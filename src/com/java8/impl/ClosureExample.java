package com.java8.impl;

import com.java8.interfaces.ProcessInterface;

public class ClosureExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		//b = 30;  --> Not acceptable at this location. Since b will be considered final by jvm so that can be used inside the anonymous inner class
		processLocal(a, i -> System.out.println(i+b));
		
	}
	
	private static void processLocal(int i,ProcessInterface p) {
		p.process(i);
	}
}
