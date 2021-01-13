package com.java8.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFilter2 {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sudarshan", "Ramamurthy", "Sam", "Caran", "Navdeep", "Saini", "Raj",
				"Ramesh", "Soma", "Sundar");
		List<String> subList = new ArrayList<>();
		//Normal Display
		myList.stream().filter(str -> (str.length() > 3 && str.length() < 8)).forEach(str -> System.out.println(str));
		//assigning to some other list
		subList = myList.stream().filter(str->(str.length()>3 && str.length()<8)).collect(Collectors.toList());
	}

}
