package com.java8.interfaces;

import java.util.List;
import java.util.function.Predicate;

import com.java8.model.Person;

@FunctionalInterface
public interface PractiseTestInterfaceBuiltInFn {

	public void execute(List<Person> people, Predicate<Person> predicate);
}
