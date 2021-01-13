package com.java8.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFilter3 {

	public static void main(String[] args) {
		// removing nulls
		List<String> myList = Arrays.asList("Sudarshan",null, "Ramamurthy", "Sam", "Caran", null,"Navdeep", "Saini", "Raj",
				"Ramesh",null, "Soma",null, "Sundar");
//		System.out.println(myList.stream().filter(str->!(str==null)).collect(Collectors.toList()));
		myList.stream().filter(str->!(str==null)).forEach(System.out::println);
	}

}
