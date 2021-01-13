package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoIterations {

	public static void main(String[] args) {
		List<Person> myList = Arrays.asList(new Person("Sudarshan", "Ramamurthy", 25), new Person("Sam", "Caran", 33),
				new Person("Navdeep", "Saini", 22), new Person("Raj", "Ramesh", 22), new Person("Soma", "Sundar", 66));
		Collections.sort(myList, (lName1, lName2) -> lName1.getlName().compareTo(lName2.getlName()));
//		myList.stream().forEach(System.out::println);
		
		myList.forEach(System.out::println);

	}

}
