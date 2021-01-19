package com.java8.again;

import java.util.Arrays;
import java.util.List;

public class Java8ParallelStream {

	public static void main(String[] args) {
		List<Student> myList = Arrays.asList(new Student("Sudarshan", 95), new Student("Sam", 33),
				new Student("Navdeep", 75), new Student("Raj", 86), new Student("Soma", 88));
		//normalStream
		myList.stream().filter(s -> s.getId() > 85).forEach(System.out::println);
		//Parallel Stream
		myList.parallelStream().filter(s -> s.getId() > 85).forEach(System.out::println);
		//parallel method
		myList.stream().parallel().filter(s -> s.getId() > 85).forEach(System.out::println);
	}
	

}
