package com.mcoder.sample.app;

import java.util.Objects;

/**
 * Reverse a given String!
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		try {
			reverseString(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Empty String can't be reversed");
		}
	}

	public static String reverseString(String given) {

		String givenString = given;

		if (Objects.isNull(given)) {
			System.out.println("Empty String can't be reversed");
			return "";
		}

		System.out.println("Given String    ******   " + givenString);
		String reversed = "";
		String tempArray[] = givenString.split("");

		for (String c : tempArray) {
			reversed = c + reversed;
		}

		System.out.println("Reversed String ******   " + reversed);

		return reversed;
	}

}
