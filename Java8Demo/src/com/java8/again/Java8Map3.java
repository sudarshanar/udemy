package com.java8.again;

import java.util.Arrays;
import java.util.List;

public class Java8Map3 {

	public static void main(String[] args) {
		List<Double> myList = Arrays.asList(10.0,25.0,3.6,14.58,77.69,21.00);
		myList.stream().map(num->(num*10)/100).forEach(System.out::println);
	}

}
