package com.java8.again;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Limit {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam", "Ram", "Guru", null, "Nagaraj", "Nandi", "Mahesh", "Mallesh", null);
		myList.stream().limit(4).forEach(System.out::println);
	}

}
