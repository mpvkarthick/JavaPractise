package com.java8.impl;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Printed Runnable");
		runnable.run();
		
		Thread thread =  new Thread(runnable);
		thread.run();
	}
}
