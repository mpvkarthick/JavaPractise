package com.java8.datatstructurespractise;

import java.util.Arrays;

public class ReverseCharacterArray {

	public static void main(String[] args) {

		char[] input = { };
		reverseArray(input);
		//System.out.println(Arrays.toString(input));
		char[] inputs = "rat the ate cat the".toCharArray();
		System.out.println(printStringInReverseOrder(inputs));
	}

	public static void reverseArray(char[] input) {
		if (!(input.length ==0 || input.length == 1 )) {
			
			int i = 0;
			Character temp;
			int length = input.length - 1;
			int endSwapIndex = input.length % 2 == 0 ? input.length / 2 : input.length / 2 - 1;
			while (i <= endSwapIndex) {
				temp = input[i];
				input[i] = input[length - i];
				input[length - i] = temp;
				i++;
			}
		}
		
	}
	
	public static String printStringInReverseOrder(char[] input) {
		StringBuffer reversedString =  new StringBuffer();
		int endSwapIndex = input.length - 1;
		int i= input.length-1;
		while(i >=0) {
			if(input[i] == ' ') {
				reversedString.append(new String(input,i+1,endSwapIndex - i)).append(" ");
				endSwapIndex = i-1;
			}
			i--;
		}
		reversedString.append(new String(input,0,endSwapIndex - i));
		input = reversedString.toString().toCharArray();
		return reversedString.toString();
	}
}
