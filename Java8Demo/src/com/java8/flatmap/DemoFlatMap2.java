package com.java8.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap2 {

	public static void main(String[] args) {
		List<String> name1 = Arrays.asList("Sam", "ram", "jam");
		List<String> name2 = Arrays.asList("jaanu", "Baanu", "Taanu");
		List<String> name3 = Arrays.asList("Savi", "kavi", "pavi");
		List<String> name4 = Arrays.asList("Tom", "Rom");

		List<List<String>> finalList = Arrays.asList(name1, name2, name3);
		/*
		 * finalList.stream().filter(n -> n.size() > 2).flatMap(name ->
		 * name.stream().map(nam -> nam + " great")) .forEach(System.out::println);
		 */

		List<String> fullList = finalList.stream().filter(n -> n.size() > 2)
				.flatMap(name -> name.stream().map(nam -> (nam + " great").toUpperCase())).collect(Collectors.toList());
		
		System.out.println(fullList);
	}

}
