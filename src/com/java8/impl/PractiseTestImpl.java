package com.java8.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.java8.interfaces.Condition;
import com.java8.interfaces.PractiseTestInterface;
import com.java8.interfaces.PractiseTestInterfaceBuiltInFn;
import com.java8.model.Person;

public class PractiseTestImpl {

	public static List<Person> people = Arrays.asList(new Person("karthik", "mannepallu", 33),
			new Person("raji", "karthik", 33), new Person("isha", "mannepalli", 1));

	public static void main(String[] args) {

		sortArrayByLastName((p, c) -> {
			Collections.sort(p, (p1, p2) -> p1.getLname().compareTo(p2.getLname()));
		}, null);

		printAllNames((p, c) -> {
			for (Person person : p) {
				if (c.isConditionSatisfied(person)) {
					System.out.println(person.getFname() + " " + person.getLname());
				}
			}
		}, p -> null != p);

		printAllNamesV2(people, p -> null != p);
		printAllNamesV3(people, p -> null != p);

		printAllNames((p, c) -> {
			for (Person person : p) {
				if (c.isConditionSatisfied(person)) {
					System.out.println(person.getFname() + " " + person.getLname());
				}
			}
		}, p -> p.getLname().equalsIgnoreCase("mannepalli"));

		printAllNamesV2(people, p -> p.getLname().equalsIgnoreCase("mannepalli"));
		printAllNamesV3(people, p -> p.getLname().equalsIgnoreCase("mannepalli"));
	}

	public static void sortArrayByLastName(PractiseTestInterface practiseTestInterface, Condition c) {
		practiseTestInterface.execute(people, c);
	}

	public static void printAllNames(PractiseTestInterface practiseTestInterface, Condition c) {
		practiseTestInterface.execute(people, c);
	}

	public static void printAllNamesV2(List<Person> people, Condition condition) {

		PractiseTestInterface practiseTestInterface = (p, c) -> {
			for (Person person : p) {
				if (c.isConditionSatisfied(person)) {
					System.out.println(person.getFname() + " " + person.getLname());
				}
			}
		};
		practiseTestInterface.execute(people, condition);

	}

	public static void printAllNamesV3(List<Person> people, Predicate<Person> predicate) {

		PractiseTestInterfaceBuiltInFn practiseTestInterface = (p, c) -> {
			for (Person person : p) {
				if (c.test(person)) {
					System.out.println(person.getFname() + " " + person.getLname());
				}
			}
		};
		practiseTestInterface.execute(people, predicate);

	}

}
