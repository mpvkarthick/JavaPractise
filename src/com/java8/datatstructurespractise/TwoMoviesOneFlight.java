package com.java8.datatstructurespractise;

import java.util.HashSet;
import java.util.Set;

public class TwoMoviesOneFlight {

	public static void main(String[] args) {

		System.out.println(canTwoMoviesFillFlight2(new int[] {2, 4}, 6));
	}

	
	// if the same movie can be watched more than once
	public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

		for(int i=0;i<movieLengths.length;i++) {
			for(int j=i+1;j<movieLengths.length;j++) {
				if(movieLengths[i]+movieLengths[j] <= flightLength) {
					return true;
				}
			}
		}
		return false;
	}
	
	// If the same movie cannot be watched more than once.
	public static boolean canTwoMoviesFillFlight2(int[] movieLengths, int flightLength) {

		Set<Integer> movieSeenSet =  new HashSet<>();
		int secondMovieLength = 0;
		for(int firstMovieLength:movieLengths) {
			secondMovieLength = flightLength-firstMovieLength;
			if(movieSeenSet.contains(secondMovieLength)) {
				return true;
			}
			movieSeenSet.add(firstMovieLength);
		}
		
		return false;
	}
}
