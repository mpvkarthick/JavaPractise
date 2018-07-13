package com.java8.impl;

import com.java8.interfaces.LengthInterface;

public class TypeInference {

	public static void main(String[] args) {
		
		LengthInterface lengthInterface = s -> s.length();
		System.out.println(lengthInterface.getLength("Hello World Length"));
		printStringLength(a->a.length());
	}

	public static void printStringLength(LengthInterface l) {
		System.out.println(l.getLength("Hello Lambda"));
	}
}
