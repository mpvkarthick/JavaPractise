package com.java8.interfaces;

import java.util.List;

import com.java8.datatstructurespractise.Meeting;

@FunctionalInterface
public interface CalculateSeconds {

	public List<Integer> returnSecondsList(Meeting meeting);
}
