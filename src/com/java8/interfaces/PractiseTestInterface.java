package com.java8.interfaces;

import java.util.List;

import com.java8.model.Person;

@FunctionalInterface
public interface PractiseTestInterface {

	public void execute(List<Person> people, Condition c);
}
