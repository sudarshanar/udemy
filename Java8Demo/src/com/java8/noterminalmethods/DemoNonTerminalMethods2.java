package com.java8.noterminalmethods;

import java.util.Arrays;
import java.util.List;

public class DemoNonTerminalMethods2 {

	public static void main(String[] args) {
		List<Integer> newList = Arrays.asList(10, 25, 62, 45, 77, 62, 14, 35, 11);
		List<String> strList = Arrays.asList("I"," Love"," You", " 3000");

		// counting how many are even
		System.out.println(newList.stream().distinct().filter(num -> (num % 2) == 0).count());
		// Minimum value
		System.out.println("Min Value " + newList.stream().min((val1, val2) -> val1.compareTo(val2)).get());
		// Maximum value
		System.out.println("Max Value " + newList.stream().max((val1, val2) -> val1.compareTo(val2)).get());
		//Reduce method
		System.out.println(strList.stream().reduce((val, combinedVal)->val+combinedVal).get());
		//toArray method
		System.out.println(strList.stream().toArray());
	}

}
