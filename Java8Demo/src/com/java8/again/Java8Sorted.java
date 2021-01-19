package com.java8.again;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Sorted {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam", "Ram", "Guru", null, "Nagaraj", "Nandi", "Mahesh", "Mallesh", null);
		//Ascending order
		myList.stream().filter(val->val!=null).sorted().forEach(System.out::println);
		//Descending order
		myList.stream().filter(val->val!=null).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
