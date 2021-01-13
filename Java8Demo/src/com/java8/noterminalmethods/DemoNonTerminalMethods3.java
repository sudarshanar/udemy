package com.java8.noterminalmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DemoNonTerminalMethods3 {

	public static void main(String[] args) {
		List<Integer> newList = Arrays.asList(10, 25, 62, 45, 77, 62, 14, 35, 11);
		List<String> strList = Arrays.asList("I"," Love"," You", " 3000");
			//Sorted
		System.out.println("Ascending Sorted List");
		newList.stream().distinct().sorted().forEach(System.out::println);
		System.out.println("Descending Sorted List");
		newList.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("Ascending Sorted List");
		strList.stream().sorted().forEach(System.out::println);
		System.out.println("Descending Sorted List");
		strList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
