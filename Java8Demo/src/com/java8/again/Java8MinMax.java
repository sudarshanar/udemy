package com.java8.again;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8MinMax {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 5, 23, 14, 25, 65, 44, 88, 52, 21);
		Optional<Object> maxOutput = myList.stream().max((val1, val2) -> val1.compareTo(val2))
				.map(val1 -> "Maximum value is " + val1);
		System.out.println(maxOutput.get());
		Optional<Object> minOutput = myList.stream().distinct().min((val1, val2) -> val1.compareTo(val2))
				.map(val1 -> "Minimum value is " + val1);
		System.out.println(minOutput.get());
	}

}
