package com.java8.again;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8Reduce {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam", "Ram", "Guru", null, "Nagaraj", "Nandi", "Mahesh", "Mallesh", null);
		Optional<String> reduced = myList.stream().filter(val->val!=null).reduce((val1,val2)->val1+val2);
		System.out.println(reduced.get());
	}

}
