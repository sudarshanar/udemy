package com.java8.again;

import java.util.Arrays;
import java.util.List;

public class Java8Map1 {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam", "Ram", "Guru", null, "Nagaraj", "Nandi", "Mahesh", "Mallesh", null);
		myList.stream().filter(str -> str != null).map(str -> str.toUpperCase()).forEach(System.out::println);
	}

}
