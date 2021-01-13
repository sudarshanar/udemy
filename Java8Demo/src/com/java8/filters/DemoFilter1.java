package com.java8.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFilter1 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(25);
		numList.add(50);
		numList.add(30);
		numList.add(65);
		numList.add(80);
		numList.add(105);
		// or
		// numList = Arrays.asList(25,65,45,77,95);
		List<Integer> evenList = new ArrayList<>();
		/*
		 * //Before java 8 for(int i : numList) { if(i%2==0) evenList.add(i); }
		 */
		evenList = numList
				.stream()
				.filter(i -> (i % 2 == 0))
				.collect(Collectors.toList());

		System.out.println(evenList);
		numList
		.stream()
		.filter(i -> (i % 2 == 0))
		.forEach(num->System.out.println(num));
	}

}
