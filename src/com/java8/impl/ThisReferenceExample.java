package com.java8.impl;

import com.java8.interfaces.ProcessInterface;

public class ThisReferenceExample {

	public static void main(String[] args) {
		
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
//		thisReferenceExample.process(10, p -> {
//			System.out.println(p);
//			// System.out.println(this); --> Not allowed here
//		});
		thisReferenceExample.execute();
		
	}
	
	public void execute () {
		int a = 10;
		int b= 20;
		process(a, p->{
			System.out.println(p+b);
			System.out.println("Inside Execute " + this);
		});
	}
	
	public void process(int i, ProcessInterface p) {
		System.out.println("Inside Process" +this);
		p.process(i);
	}

	@Override
	public String toString() {
		return "ThisReferenceExample [toString()=" + super.toString() + "]";
	}
	
	

}
