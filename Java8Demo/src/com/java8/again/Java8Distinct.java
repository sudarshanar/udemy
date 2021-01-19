package com.java8.again;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Distinct {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam", "Ram", "Guru", null, "Nagaraj", "Nandi", "Mahesh", "Mallesh", null);
		myList.stream().distinct().forEach(System.out::println);
		List<String> newList = myList.stream().distinct().collect(Collectors.toList());
	}

}
