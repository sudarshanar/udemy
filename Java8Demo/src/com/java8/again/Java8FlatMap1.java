package com.java8.again;

import java.util.Arrays;
import java.util.List;

public class Java8FlatMap1 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 25, 14, 7, 66, 11, 23);
//		myList.stream().filter(num->num%2 == 0).forEach(num->System.out.println(num));
		
		List<Integer> list1 = Arrays.asList(10, 25);
		List<Integer> list2 = Arrays.asList(12, 28);
		List<Integer> list3 = Arrays.asList(14, 35);
		List<Integer> list4 = Arrays.asList(15, 45);
		
		List<List<Integer>> myListOfList = Arrays.asList(list1,list2,list3,list4);
		myListOfList.stream().flatMap(arr->arr.stream()).map(num->num*20).forEach(System.out::println);
	}

}
