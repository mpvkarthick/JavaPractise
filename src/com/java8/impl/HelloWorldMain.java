package com.java8.impl;

import com.java8.interfaces.GreetingInterface;

public class HelloWorldMain {

	public void greetings(GreetingInterface greetingInterface) {
		greetingInterface.greet();
	}
	
	public static void main(String[] args) {
		
		GreetingInterface greetingInterfaceLambda = () -> System.out.println("Hello Lambda World");
		
		GreetingInterface greetingClass =  new  GreetingInterface() {
			
			@Override
			public void greet() {
				System.out.println("Hello Anonymous World");
				
				
			}
		};
		
		HelloWorldMain helloWorldMain =  new HelloWorldMain();
		helloWorldMain.greetings(greetingInterfaceLambda);
		helloWorldMain.greetings(greetingClass);
	}
}
