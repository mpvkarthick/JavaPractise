package com.java8.impl;

import java.util.Arrays;
import java.util.List;

import com.java8.model.Person;

public class CollectionIterationExample {

	
	public static List<Person> people = Arrays.asList(new Person("karthik", "mannepallu", 33),
			new Person("raji", "karthik", 33), new Person("isha", "mannepalli", 1));

	public static void main(String[] args) {
		people.forEach(System.out::println);

	}

}
