package com.java8.again;

import java.util.Arrays;
import java.util.List;

public class Java8Filter2 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 25, 14, 7, 66, 11, 23);
		myList.stream().filter(num->num%2 == 0).forEach(num->System.out.println(num));
	}

}
