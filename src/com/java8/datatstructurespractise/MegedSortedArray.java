package com.java8.datatstructurespractise;

import java.util.Arrays;

public class MegedSortedArray {

	public static void main(String[] args) {

		final int[] myArray = {2, 4, 6, 8};
        final int[] alicesArray = {1,7};
		
		System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));
	}

	public static int[] mergeArrays(int[] array1, int[] array2) {

		int[] finalArray = new int[array1.length + array2.length];
		int x = 0;
		int i = 0;
		int j = 0;
		if(array1.length == 0 ) {
			return array2;
		} else if (array2.length == 0) {
			return array1;
		}
		for (; i < array1.length && j < array2.length; i++) {
			for (; j < array2.length; j++) {
				if (array1[i] < array2[j]) {
					finalArray[x] = array1[i];
					x++;
					break;
				} else {
					finalArray[x] = array2[j];
					x++;
				}
			}
			if(j == array2.length) {
				for (; i < array1.length; i++) {
					finalArray[x] = array1[i];
					x++;
				}
				break;
			} 
		}
		if(j < array2.length) {
			for (; j < array2.length; j++) {
				finalArray[x] = array2[j];
				x++;
			}
		} 
		
		return finalArray;
	}
}
