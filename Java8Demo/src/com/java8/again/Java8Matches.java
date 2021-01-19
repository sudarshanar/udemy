package com.java8.again;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8Matches {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam", "Ram", "Guru", null, "Nagaraj", "Nandi", "Mahesh", "Mallesh", null);
		boolean allMatch = myList.stream().filter(val->val!=null).allMatch(val->val.startsWith("N"));
		System.out.println(allMatch); //false
		boolean anyMatch = myList.stream().filter(val->val!=null).anyMatch(val->val.startsWith("N"));
		System.out.println(anyMatch); //false
		boolean noneMatch = myList.stream().filter(val->val!=null).noneMatch(val->val.startsWith("N"));
		System.out.println(noneMatch); //false
	}

}
