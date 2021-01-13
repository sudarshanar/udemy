package com.java8.map;

import java.util.Arrays;
import java.util.List;

public class DemoMap4 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 25, 35, 45, 68, 47, 52, 33);

		intList
		.stream()
		.filter(num -> num > 25)
		.map(num -> num * 5)
		.forEach(System.out::println);

	}

}
