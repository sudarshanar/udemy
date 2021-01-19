package com.java8.again;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8FindAnyFindFirst {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam", "Ram", "Guru", null, "Nagaraj", "Nandi", "Mahesh", "Mallesh", null);
		Optional<String> findAny = myList.stream().filter(val->val!=null).findAny();
		System.out.println(findAny.get()); //false
		Optional<String> findFirst = myList.stream().filter(val->val!=null).findFirst();
		System.out.println(findFirst.get()); //false
		
	}

}
