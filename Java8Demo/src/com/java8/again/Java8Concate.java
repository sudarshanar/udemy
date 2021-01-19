package com.java8.again;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Concate {

	public static void main(String[] args) {
		List<String> firstList = Arrays.asList("Anand", "Vaanaram", "Ramika", "Reena", "Kamal", "Sooryavardhan",
				"Kulkarni", "Shantamma", "Andrews");
		List<String> secondList = Arrays.asList("Shetty", "Chaach", "Ravitej", "Khajoor", "Kancha", "Mogembo", "Taklu",
				"Garuda", "Adheera");
		Stream.concat(firstList.stream(), secondList.stream()).sorted().forEach(System.out::println);
		;
	}

}
