package com.java8.again;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Filter3 {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam","Ram","Guru","Ravi","Nagaraj","Nandi","Mahesh","Mallesh","Mahipathi");
		List<String> myNewList = myList.stream().filter(str->str.length()>3 && str.startsWith("M")).collect(Collectors.toList());
		System.out.println(myNewList);
	}

}
