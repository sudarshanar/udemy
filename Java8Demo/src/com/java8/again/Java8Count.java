package com.java8.again;

import java.util.Arrays;
import java.util.List;

public class Java8Count {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam", "Ram", "Guru", null, "Nagaraj", "Nandi", "Mahesh", "Mallesh", null);
		Long count = myList.stream().count();
		System.out.println(count);
	}

}
