package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Ravi", "Ramamurthy", "Sam", "Nandi", "Navdeep", "Mishra", "Raj",
				"Ramesh", "Sandeep", "Sundar");
		List<String> subList = new ArrayList<>();
		//ForEach of Stream
		myList.stream().filter(str -> (str.length() > 3 && str.length() < 8)).forEach(str -> System.out.println(str));
		//Collect Method
		subList = myList.stream().filter(str->(str.length()>3 && str.length()<8)).collect(Collectors.toList());
		System.out.println(subList.toString());
		
	}

}
