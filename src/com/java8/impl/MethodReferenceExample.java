package com.java8.impl;

import com.java8.interfaces.ProcessInterface;

public class MethodReferenceExample {

	public static void main(String[] args) {

		
		Thread t1  = new Thread(MethodReferenceExample::println);
		t1.start();
		MethodReferenceExample  methodReferenceExample =  new MethodReferenceExample();
		methodReferenceExample.println(10,System.out::println);
		
	}

	public static void println() {
		System.out.println("Hello Method Reference World");
	}
	
	public void println(int i,ProcessInterface p) {
		System.out.println("Hello Parameterised Method Reference World with Param --> "+ i);
		p.process(i);
	}
}
