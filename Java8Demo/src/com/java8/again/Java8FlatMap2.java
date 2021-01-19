package com.java8.again;

import java.util.Arrays;
import java.util.List;

public class Java8FlatMap2 {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Sam","Raj");
		List<String> list2 = Arrays.asList("Tom","Worth");
		List<String> list3 = Arrays.asList("Sowmya","Thunga");
		List<String> list4 = Arrays.asList("Sudarshan","Ramamurthy");
		
		List<List<String>> myListOfList = Arrays.asList(list1,list2,list3,list4);
		myListOfList.stream().flatMap(arr->arr.stream()).map(str->str.substring(0, 2)).forEach(System.out::print);
	}

}
