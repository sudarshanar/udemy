package com.java8.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap3 {

	public static void main(String[] args) {
		List<Home> first = new ArrayList<>();
		List<Home> second = new ArrayList<>();
		Home home1 = new Home(25, "Sri Venkateshwara nilaya");
		Home home2 = new Home(24, "Sri Shankareshwara nilaya");
		Home home3 = new Home(45, "Sri Mahalingeshwara nilaya");

		first.add(home1);
		first.add(home2);
		first.add(home3);

		Home home4 = new Home(29, "Shalom");
		Home home5 = new Home(42, "Sri Maharaja villa");
		Home home6 = new Home(49, "Raani Banglow");
		second.add(home6);
		second.add(home4);
		second.add(home5);

		List<List<Home>> finalList = Arrays.asList(first, second);

		/*
		 * //Before Java 8
		 * 
		 * for(List<Home> tempHome : finalList) { for(Home home : tempHome) {
		 * System.out.println(home.getHomeName()); } }
		 */

		// Using Stream and flatMap
		List<Home> newList = finalList.stream().flatMap(stream -> stream.stream().filter(s -> s.getHomeName().startsWith("Sri"))
				).collect(Collectors.toList());
		System.out.println(newList);
	}

}
